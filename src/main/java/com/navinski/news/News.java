package com.navinski.news;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class News {
	// 50 symbols - main title
	String mainTitle = new String();
	// 230 symbols short-title
	String shortTitle = new String();
	// 5000 symbols-  news text (content)
	String newsText = new String();
	// author (one or more)
	String author = new String();
	// the date of publishing
	LocalDateTime date = LocalDateTime.now();
	// the main photo
	
	// the list of attached tags
	List<String> listTags = new ArrayList<>();
	//comment
	String comments = new String();
}
