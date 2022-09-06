import java.util.Scanner;
public class InchestoMetersCenti {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value in inches: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        double centi = inch * 2.54;
        System.out.println(inch + " inches is " + meters + " meters and " + centi + " in centimeters");
    }
}