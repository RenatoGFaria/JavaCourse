
import java.util.Scanner;

public class Class_entry_data {

	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
	
	String x;
	int y;
	Double z;
	
	x = sc.next();
	y = sc.nextInt();
	z = sc.nextDouble();
	
	System.out.println("You tape: ");
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
	
	sc.close();
	

	}

}
