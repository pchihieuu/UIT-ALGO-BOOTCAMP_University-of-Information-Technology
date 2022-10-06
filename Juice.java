import java.util.Scanner;

public class Juice {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int n, a, b, c, d, ans;
			System.out.println("Mời nhập vào số phần tử: ");
			n = sc.nextInt();
			System.out.println("Mời bạn nhập vào số a: ");
			a = sc.nextInt();
			System.out.println("Mời bạn nhập vào số b: ");
			b = sc.nextInt();
			System.out.println("Mời bạn nhập vào số c: ");
			c = sc.nextInt();
			d = b - c;
			    if(a<=d) ans = n/a;
			    	
			        else{
			            ans =(n - b)/d+1;
			            n-= ans*d;
			            ans+=n/a;
			        }
			    System.out.println("Số chai có thể mua là: "+ans);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
