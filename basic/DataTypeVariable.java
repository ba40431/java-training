public class DataTypeVariable {
  public static void main(String[] args){
    int x = 2;
    long y = 11111111111L;
    double m = 3.1234564;
    float n = 3.1234564444F;

    // 數字 預設 int
    System.out.println(x);

    //長整數 數字後面需特別加上 L
    System.out.println(y);

    //浮點數 預設 double
    System.out.println(m);

    //單精度浮點數 數字後面需特別加上 F
    System.out.println(n); // 3.1234565

    //字元 單引號(只能包一個字)
    System.out.println('好');

    //字串 雙引號
    System.out.println("好的");
  }
}