package cumt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cumt.domain.Order;



public interface OrderMapper {
	//添加到购物车
	@Insert("insert into tb_shopcar(goodsid,goodsname,count,total,price) values(#{id},#{goodsname},#{count},#{total},#{price})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	void insertOrder(Order order);
	
	//展示购物车
	@Select("select * from tb_shopcar ")
	List<Order> selectAllOrder();
	
	//通过ID查找购物车的订单
	@Select("select * from tb_shopcar where id=#{id}")
	Order selectOrderById(@Param("id") int id);
	
	//更新购物车订单
	@Update("update tb_shopcar set count=#{count} ,total=#{price}*#{count} where id =#{id}")
	void updateOrder(@Param("count") int count ,@Param("price") double price, @Param("id") int id);
	
	
	//删除购物车的订单
	@Delete("delete from tb_shopcar where id=#{id}")
	void deleteOrderById(@Param("id") int id);
	
	//添加订单到订单表
	@Insert("insert into tb_order(goodsid,goodsname,count,total,price) values(#{id},#{goodsname},#{count},#{total},#{price})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	void addOrder(Order order);
	
	//删除订单表的订单
	@Delete("delete from tb_order where id=#{id}")
	void deleteFromOrderById(@Param("id") int id);
	//展示订单表的订单
	@Select("select * from tb_order ")
	List<Order> showAllOrder();
}
