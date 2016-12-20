public class loops {
  public static void main(String[] args) {
    String[] array = new String[] {"Hello, ", "my ", "name ", "is ", "Eric!"};

    /****FOR LOOPS*****/
    // for (itterator variable; conditional to stop loop; increase or decrease itterator)
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i]);
    }
    System.out.println();//create new line

    /******WHILE LOOPS*****/
    int j = 0; // j is my itterator variable
    while(j < array.length) { // conditional when to stop the loops
      System.out.print(array[j]);
      j++;//increase itterator
    }
    System.out.println();

    /****DO-WHILE LOOPS****/
    int h = 0;//define itterator variable
    do {
      System.out.print(array[h]);
      h++;//increase itterator
    } while(h != array.length);
    System.out.println();

    /******CONTIONAL OPERATORS******/
    // || is or
    // && is and
    // < less than
    // > greater than
    // <= lessthan or equal to
    // >= greater than or equal to
    // == equal to
    // != not equal to
    /*******OPERATORS********/
    // + plus, - minus, * multiply, / divide, % modulus
  }
}
