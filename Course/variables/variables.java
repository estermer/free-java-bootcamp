public class variables {
  public static void main(String[] args){
    String string = "Hello World";
    int number = 10;
    char letter = 'H';
    boolean truthy = true;
    double decimals = 3.1415;
    float decimal = 3.1f;
    String[] strArr = new String[] {"Hello ", "World"};
    int[] intArr = new int[] {10, 20, 30, 40};
    int[] lengthTen = new int[10];

    System.out.println(string);
    System.out.println(letter);
    System.out.println(number);
    System.out.println(strArr[0] + strArr[1]);
    System.out.println(intArr[2]);
    System.out.println(lengthTen[1]);
    System.out.println(decimals);
    System.out.println(truthy);
    System.out.println(decimal);
  }
}
