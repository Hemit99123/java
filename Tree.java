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

import java.lang.Math;

class Solution {
    public boolean canAliceWin(int[] nums) {
        for (int num: nums) {
            int absNum = Math.abs(num);
            
            if (Math.abs(num)) {
                System.out.println(num + " is double-digit");
            }
            
            else if ((num >= 1 && num <= 9) || (num <= -1 && num >= -99)) {

            }
        }
    }
}
