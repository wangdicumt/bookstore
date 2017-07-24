package cumt.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import cumt.domain.Book;
import cumt.domain.Order;
import cumt.service.BookService;
import cumt.service.OrderService;

@Controller
public class BookController {
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	
	@RequestMapping("/goodmanage")
	public String main(Model model){
		List<Book> book_list = bookService.getAll();
		model.addAttribute("book",book_list);
		return "goodmanage";
	}
	
	
	
	@RequestMapping("/addGoods")
	public String addGoods(MultipartFile picture,Book book,Model m) throws IllegalStateException, IOException{
		
		//1. 获取图片完整名称
		String fileStr = picture.getOriginalFilename();
		//2. 使用随机生成的字符串+源图片扩展名组成新的图片名称,防止图片重名
		String newfileName = UUID.randomUUID().toString() + fileStr.substring(fileStr.lastIndexOf("."));
		//3. 将图片保存到硬盘
		picture.transferTo(new File("C:\\Desktop\\新建文件夹\\SpringMVCMyBatisGradle\\src\\main\\webapp\\images\\" + newfileName));
		//4.将图片名称保存到数据库
		book.setImage(newfileName);
		bookService.addBook(book);
		m.addAttribute("message", "添加成功！");
		return "redirect:/goodmanage";
	}
	
	
	@RequestMapping("/showgood")
	public String showgoods(Model model){
		List<Book> book_list = bookService.getAll();
		model.addAttribute("book",book_list);
		return "showgoods";
	}
	
	@RequestMapping("/deleteGoods/{id}")
	public String deleteGood(@PathVariable int id,Model m){
		bookService.deleteBookById(id);
		m.addAttribute("message", "删除成功");
		return "redirect:/goodmanage";
	}
	
	@RequestMapping("/goUpdateGoods/{id}")
	public String goUpdateGoods(@PathVariable int id,Model m) {
		Book book = bookService.selectBookById(id);
		m.addAttribute("good", book);
		return "updateGood";
	}
	
	@RequestMapping("/updateGood")
	public String updateGood(Book book,MultipartFile pictureFile) throws IllegalStateException, IOException {
		//1. 获取图片完整名称
		String fileStr = pictureFile.getOriginalFilename();
		//2. 使用随机生成的字符串+源图片扩展名组成新的图片名称,防止图片重名
		String newfileName = UUID.randomUUID().toString() + fileStr.substring(fileStr.lastIndexOf("."));
		//3. 将图片保存到硬盘
		pictureFile.transferTo(new File("C:\\Desktop\\新建文件夹\\SpringMVCMyBatisGradle\\src\\main\\webapp\\images\\" + newfileName));
		//4.将图片名称保存到数据库
		book.setImage(newfileName);
		bookService.updateBookById(book);
		return "redirect:/goodmanage";
	}
	//添加到购物车
	@RequestMapping("/addShopCar")
	public String addShopCar(Book book, Model m) {
		bookService.updatBoodByCount(book);
		Order order = new Order();
		order.setId(book.getId());
		order.setGoodsname(book.getName());
		order.setPrice(book.getPrice());
		order.setCount(book.getCount());
		order.setTotal((book.getPrice()*book.getCount()));
		orderService.insertOrder(order);
		return "redirect:/showOrder";
		
	}
	
	//转到购买界面
	@RequestMapping("/orderlist/{id}")
	public String orderList(@PathVariable int id,Model m) {
		Book book = bookService.selectBookById(id);
		m.addAttribute("book", book);
		return "orderlist";
	}
	
}
