import java.util.Locale;

public class data_output_class_exercise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 34;
		int code = 5290;
		char gender = 'M';
		
		double price1 = 2100.0;
		double price2 = 860.0;
		double measure = 53.234567;
		
		System.out.println("Poducts:\n");
		System.out.printf("%s, which price is US$ %.2f%n", product1, price1);
        System.out.printf("%s, which price is US$ %.2f%n\n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c%n\n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);     
	}

}
