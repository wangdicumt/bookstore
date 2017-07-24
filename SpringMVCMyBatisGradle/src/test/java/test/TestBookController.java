package test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cumt.controller.BookController;
import cumt.domain.Book;
import cumt.mapper.BookMapper;
import cumt.service.BookService;
import cumt.serviceImp.BookServiceImpl;

public class TestBookController {
	
	@Autowired
	private BookMapper bookMapper;
	private static BookController bookController  = new BookController();
	private static BookService bookService = new BookServiceImpl();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddGoods() {
		Book book = new Book();
		book.setName("童话");
		book.setCount(50);
		book.setFactory("中国");
		book.setImage("1.jpg");
		book.setPrice(50.0);
		bookService.addBook(book);
		
		
	}

	@Test
	public void testShowgoods() {
		List<Book> list = bookService.getAll();
		System.out.println(list);
	}
	

	@Test
	public void testDeleteGood() {
		int id =12;
		bookService.deleteBookById(id);
		bookMapper.deletetb_bookById(id);
	}

	@Test
	public void testGoUpdateGoods() {
		
	}

	@Test
	public void testUpdateGood() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddShopCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testOrderList() {
		fail("Not yet implemented");
	}

}
