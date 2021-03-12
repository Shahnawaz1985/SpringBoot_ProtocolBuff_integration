package com.eric.spring.boot.service.gRPC;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.eric.spring.boot.abstract_svc.gRPC.ItemService;
import com.eric.spring.boot.beans.collection.Items;
import com.eric.spring.boot.utils.ApplicationProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author Shahnawaz
 *
 */
@Component
@Slf4j
public class ItemServiceImpl implements ItemService{
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ItemServiceImpl.class);
	
	
	@Autowired
	private ObjectMapper objectMapper;


	@Override
	public Items findItem(String itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Items> getAllItems() {
		RestTemplate restTemplate = new RestTemplate();
		String itemsResult = restTemplate.getForObject(ApplicationProperties.ITEMS_MONGO_REST_ENDPOINT, String.class);
		log.info("Response received from Mongo Rest Endpoint : {} " ,itemsResult);
		List<Items> allItems = null;
		try {
			allItems = (List<Items>)objectMapper.readValue(itemsResult.getBytes(), List.class);
			log.info("Response converted to Object form : {} " ,allItems);
		} catch (IOException e) {
			log.error("Exception occurred while parsing : {} ", e.getMessage());
			e.printStackTrace();
		}
		return allItems;
	}

}
