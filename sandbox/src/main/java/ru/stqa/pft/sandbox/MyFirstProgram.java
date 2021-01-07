package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("mister");
    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной "+s.length+" равна "+ s.area());
    Rectangle r= new Rectangle(6,8);
    System.out.println("Площадь прямоугольника со сторонами "+r.length+" и "+r.width+" равна "+ r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, "+somebody+"!");
  }



}