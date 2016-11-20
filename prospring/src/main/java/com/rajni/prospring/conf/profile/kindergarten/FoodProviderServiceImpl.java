package com.rajni.prospring.conf.profile.kindergarten;

import java.util.ArrayList;
import java.util.List;

import com.rajni.prospring.conf.profile.Food;
import com.rajni.prospring.conf.profile.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {

	public List<Food> provideLunchSet() {
		// TODO Auto-generated method stub
		List<Food> food = new ArrayList<Food>();
		food.add(new Food("Milk"));
		food.add(new Food("Biscuits"));
		return food;
	}

}
