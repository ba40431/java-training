import java.util.Scanner;

public class LoopStatement {
  public static void main(String[] args) {
    // continue
    // for(int i = 0; i < 6; i++){
    //     if(i % 2 == 0) continue;
    //     System.out.println(i);
    // }

    // break
    // for(int i = 0; i < 6; i++){
    //   if(i == 5) break;
    //   System.out.println(i);
    // }

    Scanner s = new Scanner(System.in);


    int number;

    while(true){
      System.out.println("請輸入一個正整數:");
      number =  s.nextInt();

      if(number > 0){
        break;
      }else{
        System.out.println("輸入錯誤");
      };
    }

    System.out.println("輸入正確:" + number);

    // if(number > 0){
    //   System.out.println("輸入正確");
    // }else{
    //   System.out.println("輸入錯誤");
    // }
  }
}
