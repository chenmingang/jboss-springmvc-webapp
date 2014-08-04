package org.jboss.tools.example.springmvc.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class BookMarks {

	@Id
	@GeneratedValue
	private int id;
	
	private String index;
	private String name;
	private Date date;
	private String url;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
