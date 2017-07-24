package cumt.controller;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cumt.domain.Order;
import cumt.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	
	//展示购物车的订单
	@RequestMapping("/showOrder")
	public String showOrder(Model m) {
		List<Order> list = orderService.selectAllOrder();
		m.addAttribute("orderList", list);
		return "shopcar";
	}
	
	//去到修改订单页面
	@RequestMapping("/goToeditOrder/{id}")
	public String goToeditOrder(@PathVariable int id, Model m) {
		Order order = orderService.selectOrderById(id);
		m.addAttribute("order", order);
		return "editOrder";
	}
	//修改订单
	@RequestMapping("/updateOrder")
	public String updateOrder(int count ,double price ,int id) {
		orderService.updateOrder(count, price, id);
		return "redirect:/showOrder";
	}
	
	//删除订单
	@RequestMapping("/deleteOrder/{id}")
	public String deleteOrder(@PathVariable int id) {
		orderService.deleteOrderById(id);
		return "redirect:/showOrder";
	}
	
	
	
	
	
	//添加订单表的订单
	@RequestMapping("/addOrderTable")
	public String addOrderTable(Order order,Model m) {
		orderService.addOrder(order);
		m.addAttribute("message", "购买成功，欢迎下次光临！！");
		return "purchaseSuccess";
	}
	//展示订单表的订单
	@RequestMapping("/showOrderForm")
	public String showOrderForm(Model m) {
		List<Order> list = orderService.showAllOrder();
		m.addAttribute("orderList", list);
		return "orderForm";
	}
	
	//删除订单表的订单
	@RequestMapping("/deletOrderForm/{id}")
	public String deleteOrderForm(@PathVariable int id) {
		orderService.deleteFromOrderById(id);
		return "redirect:/showOrderForm";
	}
}
