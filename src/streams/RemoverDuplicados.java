package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverDuplicados {
    public static void main(String[] args){
        List<Integer> numbers= Arrays.asList(1,2,3,4,4,4,4,5,6,6,6,7,8,9,10);
        System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
        System.out.println(numbers.stream().collect(Collectors.toSet()));
        System.out.println(new HashSet<>(numbers));
    }
}
