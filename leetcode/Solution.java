class DigitGame {

    public int aliceSinglePts;
    public int bobSinglePts;
    public int bobDoublePts;
    public int aliceDoublePts; // double digits
    public int total;

    public boolean canAliceWin(int[] nums) {
        for (int num: nums) {           
            boolean isSingle =  num >= 1 && num <= 9;
            boolean isDouble = num >= 10 && num <= 99;
            if (isSingle) {
                aliceSinglePts += num;
            }

            else if (isDouble) {
                aliceDoublePts += num;                
            }

            total += num;
        }

        bobSinglePts = total - aliceSinglePts;
        bobDoublePts = total - aliceDoublePts;

        if (aliceSinglePts > bobSinglePts || aliceDoublePts > bobDoublePts) {
            return true;
        } else {
            return false;
        }
    }
}
