package com.rajni.prospring.conf.profile.highschool;

import java.util.ArrayList;
import java.util.List;

import com.rajni.prospring.conf.profile.Food;
import com.rajni.prospring.conf.profile.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {
	
	public List<Food> provideLunchSet() {
		List<Food> lunchSet = new ArrayList<Food>();
		lunchSet.add(new Food("Hamburger"));
		lunchSet.add(new Food("Coke"));
		lunchSet.add(new Food("French Fries"));
		return lunchSet;
	}
	
}
