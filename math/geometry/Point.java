package math.geometry;

public class Point {

  // 類別的屬性和方法
  public static int ORIGIN_X = 0;
  public static int ORIGIN_Y = 0;

  public static void renderOrigin(){
    System.out.println("ORIGIN_X: " + ORIGIN_X + "," + "ORIGIN_Y: " + ORIGIN_Y);
  }

  // 物件的屬性、方法、建構式
  public int x; 
  public int y;
  
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void renderPoint(){
    System.out.println("x:" + x + "," + "y:" + y);
  }
}
