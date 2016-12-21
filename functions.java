public class functions {
  public static void main(String[] args) {
    printName();
    System.out.println(helloWorld());
    System.out.println(add(1, 1));
  }

  // public declares the functions
  //static is a function that doesnt belong to a object
  // void means it is no returnable
  public static void printName() {
    System.out.println("Eric Stermer");
  }

  // String declares the data type of the returnable
  public static String helloWorld() {
    return "Hello World";
  }

  // the () is the place where parameters can be defined for arguments to be passed
  // the parameters need the data type declared when defined
  public static int add(int a, int b) {
    return a + b;
  }
}
