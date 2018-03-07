package com.healthycoder.modules;

import com.healthycoder.NewsItem;

public class WeatherNews implements NewsItem{

	@Override
	public String fetchInformation() {
		String temperature = "Current temperature is " + Math.random()*100;
		return temperature;
	}

}
