import java.util.Scanner;  
public class ElectricityBill {  
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);  
		int a, b, x;
		long res = 0;
		a = sc.nextInt();  
		b = sc.nextInt();  
		x = b - a;  
		if (x <= 50) {  
			res = x * 1484;  
		}  
		else if (x <= 100) {  
			res = 1484 * 50 + (x - 50) * 1533;  
		}  
		else if (x <= 200) {  
			res = 1484 * 50 + 1533 * 50 + (x - 100) * 1786;  
		}  
		else if (x <= 300) {  
			res = 1484 * 50 + 1533 * 50 + 100 * 1786 + (x - 200) * 2242;  
		}      
		else if (x <= 400) {  
			 res = 1484 * 50 + 1533 * 50 + 100 * 1786 + 100 * 2242 + (x - 300) * 2503;     
		}  
		else {  
			  res = 1484 * 50 + 1533 * 50 + 100 * 1786 + 100 * 2242 + 100 * 2503 + (x - 400) * 2587;  
		}  
		res = res * 110 / 100;  
		System.out.print(res);  
	}  
}  