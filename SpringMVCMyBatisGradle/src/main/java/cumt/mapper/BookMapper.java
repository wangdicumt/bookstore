package cumt.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cumt.domain.Book;




public interface BookMapper {
	@Select("select * from tb_book")
	List<Book> findAll();
	
	@Select("select * from tb_book where id=#{id}")
	Book selecttb_bookById(@Param("id") int id);
	
	@Insert("insert into tb_book(name,price,count,factory,image) values(#{name},#{price},#{count},#{factory},#{image})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	void addtb_book(Book book);
	
	@Update("update tb_book set count=count-#{count} where id=#{id}")
	void updatetb_bookByCount(Book book);
	
	@Update("update tb_book set name=#{name},price=#{price},count=#{count},factory=#{factory},image=#{image} where id=#{id}")
	void updatetb_bookById(Book book);
	
	@Delete("delete from tb_book where id=#{id}")
	void deletetb_bookById(@Param("id") int id);
}
