class Test{
  public static void main(String[] args) {
    Test.hello("good");
    Test.test2(2);
  }

  static void hello(String msg){
    System.out.println(msg);
  }

  static void test2(int x){
    System.out.println(x);
  }
}