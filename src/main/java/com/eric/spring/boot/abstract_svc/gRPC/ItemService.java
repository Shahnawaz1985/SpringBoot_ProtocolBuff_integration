package com.eric.spring.boot.abstract_svc.gRPC;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.spring.boot.beans.collection.Items;


/**
 * 
 * @author Shahnawaz
 *
 */
@Service
public interface ItemService {
	
	List<Items> getAllItems();
	
	Items findItem(String itemId);

}
