package com.lira17.test_deploy_app.service;

import com.lira17.test_deploy_app.dto.Item;
import com.lira17.test_deploy_app.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemService {

	private ItemRepository itemRepository;

	@Autowired
	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Transactional(readOnly = true)
	public List<Item> getItems() {
		return itemRepository.findAll().stream()
				.map(item -> new Item(item.getTitle(), item.getDescription()))
				.toList();
	}
}
