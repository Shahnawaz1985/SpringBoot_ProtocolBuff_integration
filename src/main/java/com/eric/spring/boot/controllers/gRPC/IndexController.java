package com.eric.spring.boot.controllers.gRPC;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.eric.spring.boot.abstract_svc.gRPC.ItemService;
import com.eric.spring.boot.beans.collection.Items;

/**
 * 
 * @author Shahnawaz
 *
 */
@Controller
public class IndexController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@GetMapping(value = "/items", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Items>> items() {
		Collection<Items> resultItems = itemService.getAllItems();
		return ResponseEntity.ok().body(resultItems);
	}
	
}
