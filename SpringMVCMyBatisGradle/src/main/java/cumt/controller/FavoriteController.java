package cumt.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cumt.domain.Book;
import cumt.domain.Favorite;
import cumt.service.BookService;
import cumt.service.FavoriteService;

@Controller
public class FavoriteController {
	
	@Autowired
	@Qualifier("favoriteService")
	private FavoriteService favoriteService;
	
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	//添加到收藏夹
	@RequestMapping("/favorite/{id}")
	public String favorite(@PathVariable int id) {
		Book book = bookService.selectBookById(id);
		Favorite f = new Favorite();
		f.setName(book.getName());
		f.setFactory(book.getFactory());
		f.setPrice(book.getPrice());
		f.setImage(book.getImage());
		f.setCreatetime(new Date());
		favoriteService.insertFavorite(f);
		return "redirect:/favoriteList";
	}
	//查找收藏夹所有商品
	@RequestMapping("/favoriteList")
	public String favoriteList(Model m) {
		List<Favorite> list = favoriteService.selectAll();
		m.addAttribute("favorite", list);
		return "favoriteList";
	}
	
	//删除收藏夹中的商品
	@RequestMapping("/deleteFavorite/{id}")
	public String deleteFavorite(@PathVariable int id) {
		favoriteService.deleteFavorite(id);
		return "redirect:/favoriteList";
	}
}
