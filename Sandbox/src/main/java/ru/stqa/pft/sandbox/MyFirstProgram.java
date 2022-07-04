package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello ("World");
    hello("User");

    double l = 5;
    System.out.println("Площадь квадрата со строной " + l + " равна " + area(l));

    double a = 5;
    double b = 3;
    System.out.println("Площадь прямоугольника со стронами " + a + " и " + b + " равна " + area(a, b));
  }
  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }
  public static double area (double len) {
    return len * len;
  }
  public static double area (double a, double b) {
    return a * b;
  }
}