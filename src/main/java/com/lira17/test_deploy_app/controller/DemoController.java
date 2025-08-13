package com.lira17.test_deploy_app.controller;

import com.lira17.test_deploy_app.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


	@GetMapping("/item")
	public Item getItem() {
		return new Item("Test headphones", "Test description");
	}
}
