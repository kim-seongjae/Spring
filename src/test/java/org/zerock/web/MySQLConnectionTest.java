package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	//MySQL Driver 6.0 "com.mysql.cj.jdbc.Driver";
	
	private static final String URL = "jdbc:mariadb://127.0.0.1:3306/book_ex?useSSL=false";
	//private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&serverTimezone=Asia/Seoul";
	
	private static final String USER = "zerock";
	
	private static final String PW = "zerock";
	
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER); // DRIVER변수이름의 클래스를 메모리에 올린다
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
