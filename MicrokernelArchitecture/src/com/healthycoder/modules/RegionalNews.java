package com.healthycoder.modules;

import java.util.Date;

import com.healthycoder.NewsItem;

public class RegionalNews implements NewsItem{

	@Override
	public String fetchInformation() {
		String news = "Regional News on " + new Date();
		return news;
	}

}
