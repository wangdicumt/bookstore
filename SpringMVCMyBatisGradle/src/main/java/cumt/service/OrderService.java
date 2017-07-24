package cumt.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cumt.domain.Order;



public interface OrderService {
	//添加订单
	void insertOrder(Order order);
	//查找订单
	List<Order> selectAllOrder();
	//删除订单
	void deleteOrderById(int id);
	//通过ID查找订单
	Order selectOrderById( int id);
	//更新订单
	void updateOrder(int count , double price, int id);
	
	
	
	
	//添加到tb_order表中
	void addOrder(Order order);
	//从tb_order表中删除
	void deleteFromOrderById(int id);
	//展示订单表的订单
	List<Order> showAllOrder();
}
