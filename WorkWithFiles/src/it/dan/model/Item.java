package it.dan.model;

import java.io.File;
import java.io.Serializable;

public class Item implements Serializable  {
	private String articleid;
	private String name;
	private Integer price;
	private File img;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	
	public Item(String articleid, String name, Integer price, File img) {
		super();
		this.articleid = articleid;
		this.name = name;
		this.price = price;
		this.img = img;
	}
	
	public String getArticleid() {
		return articleid;
	}
	public void setArticleid(String articleid) {
		this.articleid = articleid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public File getImg() {
		return img;
	}
	public void setImg(File img) {
		this.img = img;
	}
	
}
