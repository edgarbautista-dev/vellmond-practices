package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximoYMinimos {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int min = numbers.get(0);
        for(Integer n:numbers){
            if(n < min){
                min = n;
            }
        }
        System.out.println(min);
        Integer minimo= Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().min(Comparator.naturalOrder()).get();
        System.out.println("el valor minimo es: "+minimo);
    }

}
