package com.lira17.test_deploy_app.controller;

import com.lira17.test_deploy_app.dto.Item;
import com.lira17.test_deploy_app.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

	private ItemService itemService;

	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping("/items")
	public List<Item> getItem() {
		return  itemService.getItems();
	}
}
