package kr.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.model.OrderCommand;
import kr.model.OrderItem;

@Controller
@RequestMapping("/order/order.do")
public class OrderController {
	
//	GET
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "order/OrderForm";
	}
	
//	POST
	@RequestMapping(method = RequestMethod.POST)
	public String submit(OrderCommand orderCommand) {
		System.out.println("order command : " + orderCommand.toString());
		System.out.println("order command : " + orderCommand.getOrderitem());
		
//		검증하기
		List<OrderItem> items = orderCommand.getOrderitem();
		for(OrderItem item : items) {
			System.out.println(item.getItemid() + " / " + item.getNumber());
		}
		
		return "order/OrderCommitted";
	}
}
