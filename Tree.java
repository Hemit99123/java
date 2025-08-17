// Define your tree class in this file!

public class Tree {
  public static void main(String[] args) {
    // Introducing ourselves + printing a tree to the screen

    System.out.println("Hey there, I'm Hemit and I'm learning to code in Java!");

    System.out.println("Ready to get my hands dirty!");

    for (int i = 1; i <= 4; i++) {
      String space = " ".repeat(4-i);
      System.out.println(space + "*".repeat(i));
    }

  }
}

