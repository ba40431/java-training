import java.util.Scanner;
public class Array {
  public static void main(String[] args) {
    // 陣列基本操作與練習
    // int[] grades = new int[3];
    // grades[0] = 95;
    // grades[1] = 88;
    // grades[2] = 92;
    // or int[] grades = new int[]{95, 88, 92};
    // System.out.println("陣列長度:" + grades.length);


    // for(int i = 0; i < grades.length; i++){
    //   System.err.println(grades[i]);
    // };

    // 輸入學生的數量，以及每位學生的成績，計算平均數
    System.out.println("請輸入有幾位學生?");
    Scanner s = new Scanner(System.in);

    int number = s.nextInt();
    int[] grades = new int[number]; 

    System.out.println("逐一輸入學生的成績:");

    int total = 0;

    for(int i = 0; i < grades.length; i++){
      grades[i] = s.nextInt(); 
      total = total + grades[i];
    }

    int average = total / number;


    System.out.println("學生平均成績是:" + average);

  }
}
