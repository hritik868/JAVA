public class remove_dup_sorted_arr_05 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 2, 3, 4, 5, 5, 6};
        int[] uniqueArray = removeDuplicates(sortedArray);
        
        System.out.println("Sorted array:");
        printArray(sortedArray);
        
        System.out.println("\nArray after removing duplicates:");
        printArray(uniqueArray);
    }
    

    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];
        
        int[] uniqueArray = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = arr[i];
        }
        return uniqueArray;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
