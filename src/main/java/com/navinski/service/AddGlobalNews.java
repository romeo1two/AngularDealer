package com.navinski.service;

import java.time.LocalDateTime;

import com.navinski.news.Comments;
import com.navinski.news.News;
import com.navinski.news.Tags;

public class AddGlobalNews implements AddNews {
	
	@Override
	public void addNews() {
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
