package ejercicios;

import java.util.Arrays;
import java.util.List;

public class prueba {
    public static void main(String[] args) {
        List<String> nombres= Arrays.asList("Juan","Pedro","Maria","Luis","Ana");
            nombres.stream().filter(nombre->nombre.startsWith("A")).forEach(System.out::println);
    }
}
