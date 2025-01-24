package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Appmain {

   private static Scanner scanner = new Scanner(System.in);
   private static List<Account> account = new ArrayList<>();
     
   public static void main(String[] args) {
	
	   boolean isRunning = true;
	   while (isRunning) {
		   System.out.println("---------------------------------");
		   System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		   System.out.println("---------------------------------");
		   System.out.print("선택> ");
		   
		 
		   int selectNo = Integer.parseInt(scanner.nextLine());
		   if ( selectNo == 1) {
			   createAccount();
		   } else if (selectNo == 2) {
			   accountList();
		   } else if (selectNo == 3) {
			   deposit();
		   } else if (selectNo == 4) {
			   withdraw();
		   } else if (selectNo == 5) {
			   isRunning = false;
		   }
		   System.out.println(selectNo); 
	   }
	   System.out.println("프로그램 종료");
   }
   private static void createAccount() {
	   System.out.println("---------- 계좌생성 ---------------");
	   System.out.print("계좌번호 : " );
	   String id = scanner.nextLine();
	   
	   System.out.print("계좌주 : ");
	   String id1 = scanner.nextLine();
	   
	   System.out.print("초기금액 : ");
	   String id2 = scanner.nextLine();
	   
	   
	   System.out.println("결과: 계좌가 생성되었습니다 " );
	   
   }
   private static void accountList() {
	   System.out.println("---------- 계좌목록 ---------------");
	   String a1 = "110-11-1011 김유신 10000";
	   String a2 = "110-11-1002 김춘추 20000";
	   System.out.println(a1);
	   System.out.println(a2);
   }
   private static void deposit() {
	   System.out.println("----------- 예금 ---------------");
	   System.out.println();
   }
   private static void withdraw() {
	   
   }
   private static Account findAccount(String ano) {
	   return null;
   }
}

	
		
	


