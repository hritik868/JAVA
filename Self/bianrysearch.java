public class bianrysearch {
public static void main(String[] args) {
    
    int arr[] = {1,3,5,7,9,11,13,15,17,19};
    
    int result = binary(arr);
    System.out.println(result); 

}

public static int binary(int arr[]) {
    int low =0;
    int high = arr.length-1;
    int find = 12;
    
    while(low<=high){
        int mid = (low+high)/2;

        if(arr[mid]<find)
        low = mid+1;
        else if(arr[mid]>find)
        high = mid-1;
        else
        return mid;
    }
    return -1;
}
}
