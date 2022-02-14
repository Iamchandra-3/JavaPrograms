import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double m , kg , bmi;

        System.out.print("Your Height in m: ");
        m = k.nextDouble();

        System.out.print(" Your Weight in kg: ");
        kg = k.nextDouble();

        bmi = kg / (m*m);

        System.out.println(" Your BMI is " +bmi);
        k.close();        
    }
}
