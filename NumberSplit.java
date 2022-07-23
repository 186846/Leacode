package SecondWork.LeaCode;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberSplit {

    public static int number;
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        function(number,1);
    }
    public static void function(int current_num,int start) {
        if(current_num>0) {
            for(int i=start;i<number;++i) {
                arrayList.add(i);
                function(current_num-i,i);
                int b= arrayList.get(arrayList.size()-1);
                arrayList.remove(arrayList.size()-1);
            }
        }
        else if(current_num==0) {
            for(int i=0;i<arrayList.size();++i) {
                System.out.print(arrayList.get(i));
                if(i!=arrayList.size()-1) System.out.print("+");
            }
            System.out.println();
        }
    }
}

