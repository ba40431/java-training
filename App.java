import math.geometry.*;
import data.*;
class App {
  public static void main(String[] args) {
    // 程式進入點

    // // 呼叫類別的方法
    // Point.renderOrigin();

    // // 呼叫建構式、產生 point 物件實體
    // Point point1 = new Point(5);
    // Point point2 = new Point(7, 7);

    // point1.renderPoint();
    // point2.renderPoint();

    Person person1 = new Person("Abby");
    Person person2 = new Person("Kate", 26);

    System.out.println(person1.age + "," + person1.name);
    System.out.println(person2.age + "," + person2.name);

  }
}