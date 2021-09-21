package Paintcalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of wall in meters:");
        float length = scanner.nextFloat();
        System.out.println("Height of wall in meters:");
        float height = scanner.nextFloat();
        System.out.println("The dimensions of the wall are: " + length + "m x " + height + "m");
        float area = length*height;
        System.out.println("The area of the wall to be painted is: " + area + "m^2");
        return area;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many walls are you painting?");
        int wallnumber = keyboard.nextInt();
        double[] array;
        array = new double[wallnumber];
        while (wallnumber > 0) {
            array[wallnumber-1] = getArea();
            wallnumber--;
        }
        double sum = Arrays.stream(array).sum();
        float sum1 = (float) sum;

        //assuming a standard 6m^2 per litre of paint gives 1/6litre of paint for every m^2

        System.out.println("The total area to be painted is: " + sum1 + " m^2");
        double paintvolume = sum * 1/6;
        System.out.println("How many coats?");
        int coats = keyboard.nextInt();
        double totalpaint = paintvolume*coats;
        float total = (float) totalpaint;
        System.out.println("You will need " + total + " litres of paint.");
    }
}