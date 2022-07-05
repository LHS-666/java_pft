package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello ("World");
    hello("User");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со строной " + s.l + " равна " + s.area());

    Rectangle r = new Rectangle(5, 3);
    System.out.println("Площадь прямоугольника со стронами " + r.a + " и " + r.b + " равна " + r.area());
  }
  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }

}