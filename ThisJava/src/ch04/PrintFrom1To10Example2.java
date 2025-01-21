package ch04;

public class PrintFrom1To10Example2 {
	public static void main(String[] args) {
		int i =1;
		while (i<=10) {
			System.out.println(i+ " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		System.out.println("시스템 종료...");
	}

}
