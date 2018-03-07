package com.healthycoder.modules;

import java.util.Date;

import com.healthycoder.NewsItem;

public class SportsNews implements NewsItem{

	@Override
	public String fetchInformation() {
		String news = "Cricket, Hockey news from Reuters at " + new Date();
		return news;
	}

}
