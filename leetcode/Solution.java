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
