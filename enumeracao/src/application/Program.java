package application;
import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;


public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		OrderStatus os1 = OrderStatus.valueOf("DELIVERED");
		OrderStatus os2 = OrderStatus.DELIVERED;
		
		System.out.println(order);
		System.out.println(os1);
		System.out.println(os2);
	}

}
