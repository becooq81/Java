public class Sorts implements Comparable{
    // Sorts the specified array of integers using the selection sort algorithm
    public static void selectionSort(Object array) {
        Comparable[] object = (Comparable[]) array;
        int min;
        Comparable temp;
        for (int index = 0; index< object.length-1; index++) {
            min = index;
            for (int scan = index+1; scan < object.length; scan++) {
                if (object[scan].compareTo(object[min]) < 0) // compareTo is only in Comparable objects. not in all objects
                    min = scan;
            }
            // Swap the values
            temp = object[min]; // temp should be Object, not int
            object[min] = object[index];
            object[index] = temp;
            
        }
    }

    public int compareTo(Object o) {
        Object com = (Object) o;
        int comparison;
        final int EQUAL = 0;
        comparison = this.compareTo(com);
        if (this== com) {
            return 0;
        }
        else if (comparison < EQUAL) {
            return -1;
        }
        else {
            return 1;
        }
        
    }

}