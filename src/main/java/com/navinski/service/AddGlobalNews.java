package com.navinski.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.navinski.news.Comments;
import com.navinski.news.News;
import com.navinski.news.Tags;

public class AddGlobalNews implements AddNews {
	
	List<News> news = new ArrayList<>();
	
	@Override
	public void addNews() {
		for(int i=0; i<10; i++) {	
			News news = new News();
			news.setAuthor("Valera");
			news.setDate(LocalDateTime.now());
			news.setMainTitle("Some Main Title");
			news.setNewsText("Some news text");
			news.setShortTitle("Some short title");
			
			Comments comments = new Comments();
			news.setComments(comments );
			
			Tags tags = new Tags();
			news.setTags(tags);
		}
	}
	
	
}
