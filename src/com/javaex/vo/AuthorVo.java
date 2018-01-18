package com.javaex.vo;

public class AuthorVo {
	private int authorid;
	private String author_Name;
	private String author_Desc;
	public AuthorVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AuthorVo(String author_Name, String author_Desc) {
		super();
		this.author_Name = author_Name;
		this.author_Desc = author_Desc;
	}



	public AuthorVo(int authorid, String author_Name, String author_Desc) {
		super();
		this.authorid = authorid;
		this.author_Name = author_Name;
		this.author_Desc = author_Desc;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
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
		return "AuthorVo [authorid=" + authorid + ", author_Name=" + author_Name + ", author_Desc=" + author_Desc + "]";
	}
	
	
	
}
