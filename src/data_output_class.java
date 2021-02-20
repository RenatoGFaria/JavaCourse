import java.util.Locale;

public class data_output_class {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 10.35784;
		String name = "Maria";
		int age = y;
		double income = 10000.0;
		
        System.out.println("Hello Wolrd!");
        System.out.println("Good Afternoon!\n");
        
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n\n", x);
        
        System.out.println("Result = " + x + " meters");
        System.out.printf("Result = %.2f meters%n\n", x);
        
        System.out.printf("%s have %d old age, and earn US$ %.2f dollars%n", name, age, income);
   
	}
}
