import java.util.Scanner;

public class ComputeAndInterpreterBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter weight in pounds: ");
        double weight=input.nextDouble();
        System.out.print("enter height in inches: ");
        double height=input.nextDouble();

        final double kilograms_per_pounds=0.45359237;
        final double meters_per_inch=0.0254;

        double weightInKilograms=weight*kilograms_per_pounds;
        double heightInMeters=height*meters_per_inch;
        double bmi=weightInKilograms/(heightInMeters*heightInMeters);

        System.out.println("BMI is"+bmi);
        if(bmi<18.5)
            System.out.println("underweight");
        else if(bmi<25)
            System.out.println("Normal");
        else if(bmi<30)
            System.out.println("Overweight");
        else
            System.out.println("obese");
    }
}
