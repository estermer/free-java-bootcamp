public class userInput {
  public static void main(String[] args) {
    //Ask for the users name and say hello
    System.out.println("What is your name? ");
    String name = System.console().readLine();
    System.out.println("Hello " + name);
    // Ask for the users age the comment on it once received
    System.out.println("What is your age? ");
    //Integer.parseInt() is a method that connverts a String into and int
    int age = Integer.parseInt(System.console().readLine());
    System.out.println("Wow a young " + age + " years old!");
  }
}
