package ejercicios;

public class Cognizant {
    public static void main(String[] args){
        String nombre="edgar";
        System.out.println(reverseString(nombre));
    }

    public static String reverseString(String nombre){
        char[] formatedNombre= new char[nombre.length()];
        char[] nombreArray=nombre.toCharArray();
        for(int i=0;i<nombreArray.length;i++){
            formatedNombre[i]=nombreArray[nombreArray.length-1-i];
        }
        return new String(formatedNombre);
    }
}
