import java.util.ArrayList;
import java.util.Map;

public class EverybodyWorkshere {
    public static void main(String[] args) {
        System.out.println("Im adding this from my site Nurlan ");
        Duplicates();
    }
    public static void Duplicates(){
        int [] num = {10,20,30,40,50,50};
        for (int i = 0; i <num.length ; i++) {
            boolean duplicates = false;
            for (int j = 0; j <num.length ; j++) {
                if(i != j && num[i] == num[j]){
                    duplicates = true;
                    break;
                }
            }if(duplicates == true){
                System.out.println(num[i]);
            }
        }

    }
    ArrayList<String> names = new ArrayList<>();
    //Do some changes here

}
