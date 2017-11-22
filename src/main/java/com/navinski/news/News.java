package com.navinski.news;

import java.time.LocalDateTime;

public class News {
	// 50 symbols - main title
	private String mainTitle;
	// 230 symbols short-title
	private String shortTitle;;
	// 5000 symbols-  news text (content)
	private String newsText;
	// author (one or more)
	private String author;
	// the date of publishing
	LocalDateTime date;
	// the main photo
	
	// the list of attached tags
	Tags tags;
	//comment
	Comments comments;
	
	
	public String getMainTitle() {
		return mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}
	
	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}
	
	public String getNewsText() {
		return newsText;
	}
	public void setNewsText(String newsText) {
		this.newsText = newsText;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	
	public Comments getComments() {
		return comments;
	}
	public void setComments(Comments comments) {
		this.comments = comments;
	}
	
}
