package optional;

import java.util.Optional;

public class PruebaOptional {
    private static String[]  nombres = {"Juan", "Pedro", "Luis", "Carlos", "Ana", "Maria", "Luisa"};
    public static Optional<String> buscarPornombre(String nombre){
        for(String n : nombres){
            if(n.equals(nombre)){
                return Optional.of(n);
            }
        }
        return Optional.empty();
    }

    public  static void main(String[] args){
        Optional<String> result = buscarPornombre("Edgar");
        if(result.isPresent()){
            System.out.println(result.get().toUpperCase());
        } else {
            System.out.println("No se encontro el nombre");
        }
    }
}
