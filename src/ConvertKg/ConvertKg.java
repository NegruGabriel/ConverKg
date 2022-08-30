package ConvertKg;

import java.util.Scanner;

public class ConvertKg {
    // Se va citi de la tastatura un numar double pt greutatea persoanei in kg
    //Se va afisa greutatea persoanei in pounds (metoda)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of kilogram :");

        double kilogram=sc.nextDouble();

        double pound = convertKgIntoPounds(kilogram);

        System.out.println("Value of "+kilogram+" kilogram in pound: "+ pound);
    }

    public static double convertKgIntoPounds(double kg){

        double pound =kg *2.20462;
       return pound;
    }


}

