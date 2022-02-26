class SelectionSort{
    public static void main(String[] args) {
        System.out.println("SelectionSort!"); 
        int[] arr = generateRandomIntArray(15, 1);
        System.out.println("Unsorted : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+",");
        }
        arr = sort(arr);
        System.out.println("Sorted : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+",");
        }
        
    }
    // Sort function that makes sure of selection sort algo
    public static int[] sort(int[] unsortedArray){
        
        int min;
        for (int i=0;i < unsortedArray.length - 1; i++){
            min = i;
            for (int j= i+1; j <unsortedArray.length; j++){
                if(unsortedArray[j] < unsortedArray[min]){
                    min = j;
                }
            }
            //swap 
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[min];
            unsortedArray[min] = temp;
        }
        return unsortedArray;
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
}