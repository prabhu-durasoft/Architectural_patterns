package com.healthycoder;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class NewsEngine {
	private Map<String, NewsItem> registry = new HashMap<>();
	
	public void displayNews() {
		while(true) {
			registry.keySet().forEach(name -> {
				NewsItem newsItem = registry.get(name.toString());
				System.out.println(name + "-> " + newsItem.fetchInformation() );
			});
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public NewsEngine(String file) throws Exception{
		InputStream inputStream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(inputStream);
		properties.keySet().stream().forEach(name -> {
			String newsItemName = name.toString();
			NewsItem newsItem;
			try {
				newsItem = (NewsItem)Class.forName(properties.get(newsItemName).toString()).newInstance();
				registry.put(newsItemName, newsItem);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		});
	}
}
