package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static double Calculate(double side1,double side2){
        double result=0;
        result=Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        return result;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Введите Сторону 1: ");
        double side1=input.nextDouble();
        System.out.print("Введите Сторону 2: ");
        double side2=input.nextDouble();
        System.out.print("Гипотенуза: "+Calculate(side1,side2));
    }
}
