import java.lang.Math;

class Solution {

    public int alicePts;
    public int bobPts;

    public boolean canAliceWin(int[] nums) {
        for (int num: nums) {
            int absNum = Math.abs(num);
            
            if (absNum >= 1 && absNum <= 9) {
                alicePts += num
            }
            
            else if (absNum >= 10 && absNum <= 99) {
                bobPts += num;
            }

            System.out.println(alicePts > bobPts); 
        }
    }
}
