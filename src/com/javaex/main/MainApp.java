package com.javaex.main;

import java.util.List;

import com.javaex.dao.AuthorDao;
import com.javaex.dao.BookDao;
import com.javaex.vo.AuthorVo;
import com.javaex.vo.BookAuthorVo;
import com.javaex.vo.BookVo;

public class MainApp {
	
	public static void main(String[] args) {
		
		AuthorVo avo = new AuthorVo("강풀","26년");
		AuthorDao aDao = new AuthorDao();
		aDao.insertAuthor(avo);
		
		List<AuthorVo> authorList = aDao.selectAuthorList(); 
		
		for(AuthorVo str: authorList) {
			System.out.println(str);
		}
		
		BookVo bvo = new BookVo("오직두사람","문학동네","2017-05-04",6);
		BookDao bDao = new BookDao();
		bDao.insertBook(bvo);
		
		List<BookAuthorVo> bookauthorlist = bDao.selectBookList();
		
		for(BookAuthorVo str: bookauthorlist) {
			System.out.println(str);
		}
	}
	
}
