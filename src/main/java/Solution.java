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
       double numone = (int)(userDouble/100);
            numone += 1;
            numone %= 10;
            numone *= 100;
        double numtwo = (int)(userDouble/10);
        numtwo %= 10;
            numtwo += 1;
            numtwo %= 10;
            numtwo *= 10;
        double numthree = (int)(userDouble);
        numthree %= 10;
        numthree += 1;
        numthree %= 10;
        double numfour = (int)(userDouble * 10);
        numfour %= 10;
        numfour += 1;
        numfour %= 10;
        numfour /= 10;
        double numfive = (int)(userDouble * 100);
        numfive %= 10;
        numfive += 1;
        numfive %= 10;
        numfive /= 100;
        return (numone + numtwo + numthree + numfour + numfive);

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
