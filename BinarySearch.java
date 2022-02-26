import java.util.Arrays;
class BinarySort{
    public static void main(String[] args) {
        System.out.println("Binary Sort! Searching 5" ); 
        int[] arr = generateRandomIntArray(15, 1);
        Arrays.sort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+",");
        }
        int found =  BinarySearch(arr, 5);
        //int found =  BinarySearchRecursive(arr, 5, 0, 9);
         System.out.println("Found : "+ found);
    }
    
    public static int[] generateRandomIntArray(int ma, int mi){
        // define the range
        int max = ma;
        int min = mi;
        int range = max - min + 1;
        int[] intArray = new int[10];
        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
            intArray[i] = rand;
        }
        return intArray;
    }
    
    public static int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left <= right ){
            int middle = (right + left)/2;
            if(arr[middle] == target){
                return middle;
            }
            else{
                if(arr[middle] > target)
                {
                    right = middle - 1;
                }
                else{
                    left = middle + 1;
                }
            }
        }
        return -1;
    }

     public static int BinarySearchRecursive(int[] arr, int target, int left, int right){
        int middle;
        if(left <= right){
            middle = (right + left)/2;
            if(arr[middle] == target){
                return middle;
            }
            else{
                if(arr[middle] > target)
                {
                    return  BinarySearchRecursive(arr, target, left, right-1);
                }
                else{
                    BinarySearchRecursive(arr, target, left+1, right);
                }
            }
        }
        return -1;
    }
}