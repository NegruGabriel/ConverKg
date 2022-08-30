package ConvertInch;

import java.util.Scanner;

public class ConvertInch {
   //Se va citi de la tastatura un numar double pt inaltimea persoanei in cm
   // Se va afisa inaltimea persoanei in inch (metoda)
    public static  void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of centimeters:");
        double centimeters=sc.nextDouble();

        double inch = convertCmIntoInch(centimeters);

        System.out.println("Value of "+centimeters+" centimeters into inch: "+ inch);
    }

    public static  double convertCmIntoInch(double cm){

        double inch =cm *0.394;
        return inch;

    }
}
