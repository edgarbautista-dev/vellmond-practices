package ejercicios.crakingCode;

/**
 *  Is Unique
 *  Implement an algorithm to determine if a string has all unique characters.
 *
 *  */

public class isUnique {

    public static boolean isUnique(String nombre){
        if(nombre.length()>=128){
            return false;
        }

        boolean[] contains = new boolean[128];
        for(int i=0;i<nombre.length();i++){
            int val= nombre.charAt(i);
            if(contains[val]){
                return false;
            }
            contains[val]=true;
        }
        return true;
    }

    public static void main(String[] args){
        String[] nombres = {"pablo", "pedro","pepe","edgar","arturo","ricardo"};
        for(String nombre: nombres){
            System.out.println(nombre+" no tiene letras repetidas? = "+ isUnique(nombre));
        }
    }

}
