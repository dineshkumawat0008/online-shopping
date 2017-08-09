package com.dishu.shoppingbackend.dao;

import java.util.List;

import com.dishu.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
