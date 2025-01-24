package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TransactionTest {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("에러를 발생하시겠습니까?");
		
		int answer =sc.nextInt();
		
		String host = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String pass = "1234";
		
		
		Connection conn = null;
		
		try {
			// 1단계 - 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계 -
			conn = DriverManager.getConnection(host, user, pass);
			
			// 트랜잭션 자동커밋 해제
			conn.setAutoCommit(false);
			
			// 3단계 -
			String sql1 = "update `bank_account` set `a_balance` = `a_balance` - 80000 where `a_no`=?";
			String sql2 = "update `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no`=?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt1.setString(1, "101-11-1003");
			
			// 4단계
			psmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("예기치 않은 에러가 발생했습니다.");
			}
			
			psmt2.executeUpdate();
			
			// 작업확정(데이터베이스 작업 반영)
			conn.commit();
			
			
			psmt1.close();			
			psmt2.close();			
			conn.close();
			
			
		} catch (Exception e) {
		  e.printStackTrace();
		  try {
			// 작업 취소(데이터베이스 SQL 실행전으로 돌아가기)
			  conn.rollback();
		} catch (Exception e1) {
		  e.printStackTrace();
		}
		  
		}
		
	}

}
