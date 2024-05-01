public class Loop{
  public static void main(String[] args) {
    // while 迴圈

    // int x = 2;
    // while(x <= 6){
    //   System.out.println(x);
    //   x = x +2;
    // }

    // int x = 1;
    // int total = 0;
    // while (x < 101) {
    //   total = total + x;
    //   x++;
    // }
    // System.out.println(total);

    // for 迴圈
    int total = 0;
    for(int x = 0; x < 101; x++){
      total = total + x;
    }
    System.out.println(total);
  }
}
