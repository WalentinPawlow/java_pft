package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("mister");
    double length=6;
    double width=8;
    System.out.println("Площадь квадрата со стороной "+length+" равна "+ area(length));
    System.out.println("Площадь прямоугольника со сторонами "+length+" и "+width+" равна "+ area(length,width));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, "+somebody+"!");
  }

  public static double area (double length){
    return length*length;
  }

  public static double area (double length, double width){
    return length*width;
  }
}