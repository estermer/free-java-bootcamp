public class forLoop {
  public static void main(String[] args) {
    String[] array = new String[] {"Hello, ", "my ", "name ", "is ", "Eric!"};

    // for (itterator variable; conditional to stop loop; increase or decrease itterator)
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i]);
    }
  }
}
