import java.util.Scanner;

public class AverageFourNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        float a=0;
        float b=0;
        float c=0;
        float average=0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number");
        a = scan.nextFloat();
        
        System.out.println("Enter a number");
        b = scan.nextFloat();
        
        System.out.println("Enter a number");
        c = scan.nextFloat();
        
        average = (a + b +c )/3;
        
        System.out.println( " The average of four numbers is " + average);
	}

}
