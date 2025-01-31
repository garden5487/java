package ifexm;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String a1;
		int flo = 5;
		
		
		switch(flo) {
		case 1: a1 = "약국";
		break;
		case 2: a1 = "정형외과";
		break;
		case 3: a1 = "피부과";
		break;
		case 4: a1 = "치과";
		break;
		case 5: a1 = "헬스 클럽";
		}
		System.out.println(flo + "층은 헬스클럽입니다");
	}

}
