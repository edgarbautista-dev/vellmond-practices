package EstructurasDeControl;

import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("teclea la tabla a mostrar");
        int tabla =sc.nextInt();
        System.out.println("tabla del "+tabla);
        for(int i=1;i<=10;i++){
            System.out.println(" "+tabla+"x"+i+"="+tabla*i);
        }
    }
}
