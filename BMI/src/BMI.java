import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float weight;
        float height;
        float BMI;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter the weight of a person (kg)");
        weight= scan.nextFloat();
        
        System.out.println("Enter height of a person (m)");
        height= scan.nextFloat();
        
       
		BMI = weight /(height * height);
		
		System.out.println( "The BMI of Alisya" + " is " + BMI );
		
		
	}
        
        
		
}
