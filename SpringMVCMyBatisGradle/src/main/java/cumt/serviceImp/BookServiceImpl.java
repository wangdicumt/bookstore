package cumt.serviceImp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cumt.domain.Book;
import cumt.mapper.BookMapper;
import cumt.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper bookMapper;
	
	//查找所有商品
	@Override
	public List<Book> getAll() {
		return bookMapper.findAll();
	}

	//添加商品
	@Override
	public void addBook(Book book) {
		bookMapper.addtb_book(book);
	}

	//删除商品
	@Override
	public void deleteBookById(int id) {
		bookMapper.deletetb_bookById(id);
	}

	//更新商品
	@Override
	public void updateBookById(Book book) {
		bookMapper.updatetb_bookById(book);
	}

	//根据ID查找商品
	@Override
	public Book selectBookById(int id) {
		Book book = bookMapper.selecttb_bookById(id);
		return book;
	}

	//根据购买数量更新商品
	@Override
	public void updatBoodByCount(Book book) {
		bookMapper.updatetb_bookByCount(book);
	}

}
