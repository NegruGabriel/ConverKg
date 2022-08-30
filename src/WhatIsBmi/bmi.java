package WhatIsBmi;

import java.util.Scanner;

public class bmi {
    //Se va calcula BMI-ul persoanei pe baza inaltimii si greutatii (metoda)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();

        System.out.print("Input height in meters: ");
        double height= sc.nextDouble();

        double BMI = CalculateBMI(weight,height);
        System.out.println("BMI is: "+BMI+" kg/m2");


     ShowRangeOfBMI ( BMI);

    }
    public static double CalculateBMI(double weight, double height){
        double BMI= weight/(height*height);
        return BMI;
    }
// In functie de BMI, se va afisa in ce categorie se incadreaza persoana
// (fit, obez, supraponderal) - google values (metoda)
public static void ShowRangeOfBMI(double rangeBmi){
        if(rangeBmi<18.5){
            System.out.println("Esti underweight");
        }else if (rangeBmi<25) {
            System.out.println("Esti in greutate optima ");
        }else if(rangeBmi<30) {
            System.out.println("Esti overweight");
        }else {
            System.out.println("Esti obese");

        }

}
}
