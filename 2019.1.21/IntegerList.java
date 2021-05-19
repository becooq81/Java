import java.util.Scanner;
public class IntegerList {
    int[] list; // values in the list 
    
    // create a list of the given size
    public IntegerList (int size) {
        list = new int[size];
    }
    
    // fill array with integers between 1 and 100, inclusive
    public void randomize() {
        for (int i = 0; i <list.length; i++) {
            list[i] = (int) (Math.random() * 100) +1;
        }
    }
    
    // print array elements with indices
    public void print() {
        for (int i = 0; i <list.length; i ++) {
            System.out.println(i + ":\t" + list[i]);
        }
    }
    
    // return the index of the first occurrence of target in the list.
    // return -1 if target does not appear in the list
    public int search (int target) {
        int location = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                location = i;
                break;
            }
        }
        return location;
    }
    
    // sort the list into ascending order using the selection sort algorithm
    public void selectionSort() {
        int minIndex;
        for (int i = 0; i < list.length-1; i ++) {
            // find smallest element in list starting at location i
            minIndex = i; 
            for (int j = i + 1; j <list.length; j ++ ) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                    }
            }
            //Swap list[i] with smallest element
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
        
    }
    
    public void sortDecreasing() {
        int min, temp;
        
        for (int ind = 0; ind < list.length-1; ind ++) {
            min = ind;
            for (int scanner = ind + 1; scanner < list.length; scanner ++ )
                if (list[scanner] > list[min])
                    min = scanner;
            // swap the values
            temp = list[min];
            list[min] = list[min];
            list[min] = temp;
        }
    }
    
    public void replaceFirst(int oldVal, int newVal) {
        
        int index = this.search(oldVal);
        
        if (index >= 0) {
            list[index] = newVal;
        }
        
        
    }
    
    public void replaceAll(int oldVal, int newVal) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == oldVal) {
                list[i] = newVal;
            }
        }
    }
    
    public int binarySearch(int target) {
        int index = -1;
        this.selectionSort();
        int min = 0;
        int max = list.length-1;
        while (min<=max) {
            int middle = (min+max) /2;
            if (list[middle]<target){
                min = middle + 1;
            }
            else if (list[middle]>target){
                max = middle-1;
            }
            else {
                index = middle;
                break;
            }
        }
        return index;
    }
    
    public void insertionSort() {
        for (int i = 1; i < list.length; i++) {
            int num = list[i];
            for (int j = i-1; j>=0; j--) {
                if (list[j]>list[j+1]) {
                    int temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                } else {
                    break;
                }
            }
            
           
        }
        
    }
}