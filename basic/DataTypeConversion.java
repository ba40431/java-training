public class DataTypeConversion {
  public static void main(String[] args){
    // 數字型態金的轉換
    // 數字型態範圍大小的排序: double > float > long > int > short > byte
    // 小範圍轉換到大範圍:自動轉換

    // byte x = 3;
    // int y = x;
    // System.out.println(y);

    // long z = y;
    // System.out.println(z);

    // double d = z;
    // System.out.println(d);

    // 大範圍轉換到小範圍:需要使用(資料型態)做強制轉換

    // int x = 1024;
    // byte y = (byte)x;
    // System.out.println(y); //0

    // long z = 102400;
    // int m = (int)z;
    // System.out.println(y); //0

    // // float f = 3.141592689; // 錯誤:試圖把 double 轉換成 float
    // float f = (float)3.141592689;
    // System.out.println(f); //3.1415927

    // 字串轉換成數字
    // String text = "34";
    // int x = Integer.parseInt(text);
    // System.out.println(x);

    // text = "3.1415";
    // double y = Double.parseDouble(text);
    // System.out.println(y);

    // 數字轉換成字串

    int x = 34;
    String s = String.valueOf(x);
    System.out.println(s);

    long y = 999999999;
    s = String.valueOf(y);
    System.out.println(s);

    s = String.valueOf(3.14159F);
    System.out.println(s);
  }
}