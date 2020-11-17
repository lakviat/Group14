import java.util.Arrays;

public class Markiyan {


    public int[] lastInter(int[] num) {
        //int [] num = {10,20,30,40,50,60};
        // print out rist and last iteratvely
        // OUTPUT WILL BE 10 60 20 50 30 40
        // make sure the code i dynamic and can handle any size of the array
        // PUT YOUR CODE HERE -- > Good Luck
        int result[] = new int[num.length];
        int j = num.length - 1;
        int c = 0;
        for (int i = 0; i < j; i++) {

            result[c] = num[i];
            c++;
            result[c] = num[j];
            c++;
            j--;

        }
        return result;

    }
}

