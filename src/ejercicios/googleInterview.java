package ejercicios;

//given a sorted array of n integers that has been rotated an unkown number of times, write code to find an element in the array. You may assume that the array was originally sorted in increasing order.
//EXAMPLE:
//Input: find 5 in array (15 16 19 20 25 1 3 4 5 7 10 14)
//Output: 8 (the index of 5 in the array)
//with binary search
public class googleInterview {
    public static void main(String[] args) {
        int[] array = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int index = findElement(array, 5);
        System.out.println(index);
    }

    public static int findElement(int[] array, int element){
        int index = -1;
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int middle = (start + end) / 2;
            if(array[middle] == element){
                index = middle;
                break;
            }else if(array[middle] < element){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return index;
    }
}
