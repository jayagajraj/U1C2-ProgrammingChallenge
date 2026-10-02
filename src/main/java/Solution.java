public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double sum = (t1 + t2 + t3 + t4);
        double average = sum / 4;
        return (average);
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        int roundedAverage = (int) (average + .5); 
        return roundedAverage;
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        boolean isPassing;
        if (roundedAverage < 65) {
            isPassing = false;
        }
        else {
            isPassing = true;
        }
        
          return isPassing;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        double totalStock = (shares * price);
        return totalStock;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        int roundValueChange = (int) (Math.round(totalStock));
        return roundValueChange;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        double userDouble100 =(userDouble%100 +1) *100;

        double userDouble10 = (userDouble%10 +1) *10;

        double userDouble1 = (userDouble%1 +1);

        double userDoublePoint1 = (userDouble%0.1 +1 ) *.1;

        double userDoublePoint01 = (userDouble%.01 +1) *.01;

        double adjustDigits = (userDouble100 + userDouble10 + userDouble1 + userDoublePoint1 +userDoublePoint01);

        return adjustDigits;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
