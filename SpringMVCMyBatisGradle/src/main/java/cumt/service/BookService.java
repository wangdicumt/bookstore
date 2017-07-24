package cumt.service;

import java.util.List;

import cumt.domain.Book;





public interface BookService {
	List<Book> getAll();
	void addBook(Book book);
	
	void updateBookById(Book book);
	void deleteBookById(int id);
	
	Book selectBookById(int id);
	
	void updatBoodByCount(Book book);
}
