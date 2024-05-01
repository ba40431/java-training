import java.util.Scanner;

public class ConditionalStatement {
  public static void main(String[] args) {
    // 使用標準輸入(從終端機輸入)
    // Scanner s = new Scanner(System.in);
    // System.out.println("請輸入一個整數:");
    // int x = s.nextInt();
    // System.out.println(x * 10);

    // if 判斷式
    // Scanner s = new Scanner(System.in);
    // System.out.println("請問你想領多少錢:");
    // int money = s.nextInt();

    // if( money > 100000){
    //   System.out.println("太多了不能領");
    // }else if( money < 100){
    //   System.out.println("太少了不能領");
    // }else {
    //   System.out.println("錢在這裡");
    // }

    // switch 判斷式
    int n1 = 3;
    int n2 = 4;
    System.out.println("請輸入想要做的運算 (支援 + - * /):");
    Scanner s = new Scanner(System.in);
    String op = s.next();

    switch (op) {
      case "+":
        System.out.println(n1 + n2);
        break;

      case "-":
        System.out.println(n1 - n2);
        break;

      case "*":
        System.out.println(n1 * n2);
        break;

      case "/":
        System.out.println(n1 / n2);
        break;
    
      default:
        System.out.println("不支援的運算");
        break;
    }
  }
}
