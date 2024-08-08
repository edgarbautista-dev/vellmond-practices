package cognizant.draws;

import java.util.Scanner;
/* Dibujar triangulos de diferente manera
**/
public class printDraw {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero para dibujar un triangulo");
        Scanner scanner=new Scanner(System.in);
        int numero=scanner.nextInt();
        for (int i=0;i<numero;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
