import java.util.Arrays;

public class Markiyan {

    public static void main(String[] args) {
        String name = "Mark";
        String num = "1234";
        System.out.println(Task2(name,num));


    }

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
    public static   String Task2(String str1,String str2){
//        Another task to do
//            String name = "Mark"
//        String num = "1234"
//        Print name iterated by the numbers
//        Output M1A2R3K4
//        Easy one good luck
        str1=str1.toUpperCase();
        String result="";
        for (int i=0;i<str1.length();i++){
            result+=""+str1.charAt(i)+str2.charAt(i);
        }return result;
    }


}

