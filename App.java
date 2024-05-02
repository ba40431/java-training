class Test{
  public static void main(String[] args) {
    Test.hello("good");
    int addResult = BasicMath.add(5,4);
    int multiplyResult = BasicMath.multiply(addResult, addResult);

    System.out.println(addResult);
    System.out.println(multiplyResult);
  }

  static void hello(String msg){
    System.out.println(msg);
  }
}

class BasicMath {
  static int add(int x, int y){
    int result = x + y;

    return result;
  }

  static int multiply(int x, int y){
    int result = x * y;

    return result;
  }
}