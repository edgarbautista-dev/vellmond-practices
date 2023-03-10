package ejercicios.crakingCode;

public class urlify {

    public static String charArrayToString(char[] array){
        StringBuilder buffer= new StringBuilder(array.length);
        for(char a: array){
            if(a==0){
                break;
            }
            buffer.append(a);
        }
        return buffer.toString();
    }

    public static void replaceSpaces(char[] array, int trueLength){
        int countSpaces=0, index, i=0;
        for(i=0;i<trueLength;i++){
            if(array[i]==' '){
                countSpaces++;
            }
        }

        index=trueLength+countSpaces*2;
        if(trueLength<array.length)array[trueLength]='\0';
        for(i =trueLength-1;i>=0;i--){
            if(array[i]==' '){
                array[index - 1]= '0';
                array[index - 2]= '2';
                array[index - 3]= '%';
                index=index - 3;
            } else {
                array[index - 1]=array[i];
                index--;
            }
        }
    }

    public static int findLastCharacter(char[] array){
        for(int i=array.length-1;i>=0;i--){
            if(array[i]!=' '){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String name = "Edgar Jesus Bautista     ";
        char[] arreglo = name.toCharArray();
        int trueLength = findLastCharacter(arreglo)+1;
        replaceSpaces(arreglo,trueLength);
        System.out.println("\""+charArrayToString(arreglo)+"\"");
    }
}
