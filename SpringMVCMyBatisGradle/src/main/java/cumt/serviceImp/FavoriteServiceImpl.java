package cumt.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cumt.domain.Favorite;
import cumt.mapper.FavoriteMapper;
import cumt.service.FavoriteService;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {
	@Autowired
	private FavoriteMapper favoriteMapper;

	@Override
	public void insertFavorite(Favorite f) {
		favoriteMapper.insertFavorite(f);
	}

	@Override
	public List<Favorite> selectAll() {
		List<Favorite> list = favoriteMapper.selectAll();
		return list;
	}

	@Override
	public void deleteFavorite(int id) {
		favoriteMapper.deleteFavorite(id);
	}
}
