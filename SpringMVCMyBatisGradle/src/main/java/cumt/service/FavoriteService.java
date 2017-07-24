package cumt.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cumt.domain.Favorite;

public interface FavoriteService {
	//添加商品到收藏夹
	
	void insertFavorite(Favorite f);
	
	//查看收藏夹

	List<Favorite> selectAll();
	
	//删除收藏夹

	void deleteFavorite(int id);
	
}
