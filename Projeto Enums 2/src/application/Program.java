package application;


import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);
		System.out.println(order);
		OrderStatus orderStatus = OrderStatus.DELIVERED;
		OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(orderStatus);
		System.out.println(orderStatus2);
	}
}
