package test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cumt.domain.Order;
import cumt.mapper.OrderMapper;
import cumt.service.OrderService;
import cumt.serviceImp.OrderServiceImpl;

public class TestOrderService {
	@Autowired
	private OrderMapper orderMapper;
	
	private OrderService orderService = new OrderServiceImpl();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertOrder() {
		
	}

	@Test
	public void testSelectAllOrder() {
		List<Order> list =orderMapper.selectAllOrder();
		System.out.println(list);
	}

	@Test
	public void testDeleteOrderById() {
		Order order = orderMapper.selectOrderById(7);
		System.out.println(order.getGoodsname());
	}

	@Test
	public void testSelectOrderById() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteFromOrderById() {
		fail("Not yet implemented");
	}

	@Test
	public void testShowAllOrder() {
		fail("Not yet implemented");
	}

}
