package cumt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cumt.domain.Favorite;

public interface FavoriteMapper {
	//添加商品到收藏夹
	@Insert("insert into tb_favorite(name,price,image,createtime,factory) "
				+ "values(#{name},#{price},#{image},#{createtime},#{factory})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	void insertFavorite(Favorite f);
	
	//查看收藏夹
	@Select("select * from tb_favorite ")
	List<Favorite> selectAll();
	
	//删除收藏夹
	@Delete("delete from tb_favorite where id = #{id}")
	void deleteFavorite(@Param("id") int id);
	
		
}
