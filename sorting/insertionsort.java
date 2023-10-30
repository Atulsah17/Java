public class insertionsort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] +"");
        }
        System.out.println();
    
    }
    public static void sorting(int arr []) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while((curr>0) && (arr[prev] > curr)){
                arr[prev+1] = arr[prev];
prev --;
        }
        arr[prev + 1]= curr;
    }
    }
   
    public static void main(String[] args) {
        int arr [] = { 1 , 3 , 5, 2 ,4};
    sorting(arr);
    printArr(arr);

    }
}
 