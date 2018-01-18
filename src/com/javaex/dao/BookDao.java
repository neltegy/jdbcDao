package com.javaex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javaex.vo.AuthorVo;
import com.javaex.vo.BookAuthorVo;
import com.javaex.vo.BookVo;

public class BookDao {
	public void insertBook(BookVo bvo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "webdb";
			String pw = "webdb";
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("연결성공");
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "INSERT INTO book VALUES (seq_book_id.nextval, ?, ? , ? ,?)";
			pstmt = conn.prepareStatement(query);
			System.out.println("쿼리준비성공");
			
			pstmt.setString(1, bvo.getTitle());
			pstmt.setString(2, bvo.getPubs());
			pstmt.setString(3, bvo.getPub_date());
			pstmt.setInt(4, bvo.getAuthor_id());

			int count = pstmt.executeUpdate();

			System.out.println("쿼리실행성공");
			// 4.결과처리
			System.out.println(count + "건 저장완료");
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			// 5. 자원정리
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

		}
	}

	public List<BookAuthorVo> selectBookList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<BookAuthorVo> bookauthorList = new ArrayList<BookAuthorVo>();
		
		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "webdb";
			String pw = "webdb";
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("접속성공");
			// 3. SQL문 준비 / 바인딩 / 실행
				String query = "select book_id "+
								      " ,title "+
								      " ,pubs "+
								      " ,to_char(pub_date,'yyyy-mm-dd') pub_date "+
								      " ,b.author_id author_id "+
								      " ,author_name "+
								      " ,author_desc "+
							    " from book b "+
						            " ,author a "+
						        " where b.author_id = a.author_id ";
			pstmt = conn.prepareStatement(query);
			System.out.println("쿼리준비성공");
			rs = pstmt.executeQuery();
			System.out.println("쿼리실행성공");
			
			// 4.결과처리
			while(rs.next()) {
				BookAuthorVo bavo = new BookAuthorVo();
				
				int book_id = rs.getInt("book_id");
				String title = rs.getString("title");
				String pubs = rs.getString("pubs");
				String pub_date = rs.getString("pub_date");
				int author_id = rs.getInt("author_id");
				String author_name = rs.getString("author_name");
				String author_desc = rs.getString("author_desc");
				
				bavo.setBook_id(book_id);
				bavo.setTitle(title);
				bavo.setPubs(pubs);
				bavo.setPub_date(pub_date);
				bavo.setAuthor_id(author_id);
				bavo.setAuthor_Name(author_name);
				bavo.setAuthor_Desc(author_desc);
				
				bookauthorList.add(bavo);
				
				//authorList.toString();
				//System.out.println(authorId+" "+authorName+" "+authorDesc);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			
			// 5. 자원정리
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

		}
		
		return bookauthorList;
		
	}
}
