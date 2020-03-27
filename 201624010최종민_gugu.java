import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("구구단 프로그램입니다.");
		System.out.print("단을 입력해주세요 : ");
		
		a = input.nextInt();
		
		System.out.println();
		System.out.println("=-=-=-=-=-=-=-=");
		
		for(int i=1;i<=9;i++) {
			b = a*i;
			System.out.println(a+" X "+i+" = "+b);
		}
		
		System.out.println("=-=-=-=-=-=-=-=");
		System.out.println();
		System.out.println("구구단 종료.");
		
		
	}

}
