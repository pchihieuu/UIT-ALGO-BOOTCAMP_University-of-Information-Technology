//---Candies_program---//
import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int n, a, b, c, x, y;
			System.out.println("Mời nhập vào số phần tử: ");
			n = sc.nextInt();
			System.out.println("Mời bạn nhập vào số a: ");
			a = sc.nextInt();
			System.out.println("Mời bạn nhập vào số b: ");
			b = sc.nextInt();
			c = (b<<1)/n*n;
			if(c<= (a<<1)) { 
				x= a ; y =a;
				System.out.println("Số kẹo Alice cần mua là:"+x);
				System.out.println("Số kẹo Bob cần mua là:"+y);
			}else {
	            if(c >= a+b) {
	            	x = b; y = c- b;
	            	System.out.println("Số kẹo Alice cần mua là:"+x);
	            	System.out.println("Số kẹo Bob cần mua là:"+y);
	            	}else { 
	            		x = c - a; y = a;
	            		System.out.println("Số kẹo Alice cần mua là:"+x);
	            		System.out.println("Số kẹo Bob cần mua là:"+y);
	            	}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
