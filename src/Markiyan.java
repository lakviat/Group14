public class Markiyan {




        public static void main(String[] args) {
            int [] num = {10,20,30,40,50,60};
            // print out rist and last iteratvely
            // OUTPUT WILL BE 10 60 20 50 30 40
            // make sure the code i dynamic and can handle any size of the array
            // PUT YOUR CODE HERE -- > Good Luck
            String result=" ";
            int j=num.length-1;
            for (int i=0;i<j;i++){
                result+=num[i]+""+num[j]+" ";
                j--;

            }
            System.out.println(result);
        }
    }

