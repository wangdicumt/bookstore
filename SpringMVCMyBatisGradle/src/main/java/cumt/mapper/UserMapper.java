package cumt.mapper;

import org.apache.ibatis.annotations.Insert;


import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cumt.domain.User;



public interface UserMapper {
	@Select("select * from tb_user where loginname=#{loginname} and password=#{password}")
	User find(@Param("loginname") String loginname,
			@Param("password") String password
			);
	
	@Insert("insert into tb_user(loginname,password,username,phone,address)"
			+ "values(#{loginname},#{password},#{username},#{phone},#{address})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	void saveUser(User user);
	
	@Update("update tb_user set password=#{password} where id =#{id}")
	void changePassword(@Param("password") String password, @Param("id") int id);
}
