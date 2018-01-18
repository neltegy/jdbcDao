package com.javaex.vo;

public class BookAuthorVo {
	private int book_id;
	private String title;
	private String pubs;
	private String pub_date;
	private int author_id;
	private String author_Name;
	private String author_Desc;
	public BookAuthorVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookAuthorVo(String title, String pubs, String pub_date, int author_id, String author_Name,
			String author_Desc) {
		super();
		this.title = title;
		this.pubs = pubs;
		this.pub_date = pub_date;
		this.author_id = author_id;
		this.author_Name = author_Name;
		this.author_Desc = author_Desc;
	}
	public BookAuthorVo(int book_id, String title, String pubs, String pub_date, int author_id, String author_Name,
			String author_Desc) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.pubs = pubs;
		this.pub_date = pub_date;
		this.author_id = author_id;
		this.author_Name = author_Name;
		this.author_Desc = author_Desc;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubs() {
		return pubs;
	}
	public void setPubs(String pubs) {
		this.pubs = pubs;
	}
	public String getPub_date() {
		return pub_date;
	}
	public void setPub_date(String pub_date) {
		this.pub_date = pub_date;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_Name() {
		return author_Name;
	}
	public void setAuthor_Name(String author_Name) {
		this.author_Name = author_Name;
	}
	public String getAuthor_Desc() {
		return author_Desc;
	}
	public void setAuthor_Desc(String author_Desc) {
		this.author_Desc = author_Desc;
	}
	@Override
	public String toString() {
		return "BookAuthorVo [book_id=" + book_id + ", title=" + title + ", pubs=" + pubs + ", pub_date=" + pub_date
				+ ", author_id=" + author_id + ", author_Name=" + author_Name + ", author_Desc=" + author_Desc + "]";
	}
	
	
}
