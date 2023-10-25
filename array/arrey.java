

public class arrey {
//     public static void main(String[] args) {
//         int marks [] =new int [50];

//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
//         System.out.println("phy  :" +marks[0]);
//          System.out.println("chem  :" +marks[1]);
//           System.out.println("maths :" +marks[2]);
//    marks[2] = marks[2] + 67;
//    System.out.println("math :" +marks[2]);
//         }

// public static void update(int marks[]) {
//     for(int i =0; i< marks.length;i++){
//         marks[i] = marks[i] +1;
//     }
    
// }
// public static void main(String[] args) {
//     int marks [] ={98,43 ,56};
//     update(marks);
//     for(int i =0; i<marks.length;i++){
//     System.out.print(marks[i]+ " ");
//     }
//     System.out.println();
//     }
// public static int linearsearch(int numbers[], int key) {

//     for(int i=0; i<numbers.length;i++){
//     if(numbers[i] == key){
//         return i;}
//     }
//     return -1;

// }
// public static void main(String[] args) {
//     int numbers[] = {2, 4, 6 , 8 ,10 ,12 ,14 ,16};
//     int key = 14 ;
//     int index =linearsearch(numbers, key);
//     if(index == -1){
//         System.out.println("not found");
//     }
//     else{
//         System.out.println("found at position "+ (index  ));
//     }
// }
// public static int getLargest(int numbers[]) {
// int largest = Integer.MIN_VALUE;

// for(int i=0; i<numbers.length;i++){
//     if(largest <numbers[i]){
//         largest = numbers[i];}
//     }
   
        
    
    
//     return largest;
// }
// public static void main(String[] args) {
//     int numbers[]= { 1 , 6 ,9 ,8 ,56 ,78 ,2};{
//         System.out.println("largest value is " +getLargest(numbers));
//     }

// }

// binarysearch


// public static int binarysearch(int numbers[] ,int key ) {
// int start =0, end = numbers.length-1;
// while(start <= end) {
//     int mid = (start+end)/2;

//     if(numbers[mid] == key){
//         return mid;
//     }
//     if (numbers[mid] < key){
//         start = mid + 1;
//     }else {
//         end = mid - 1;
//     }
// }    

// return -1;
// }

// public static void main(String[] args) {
//     int numbers [] = {2, 4, 6 , 8 ,10 ,12 ,14 ,16};
//     int key = 10;
//     System.out.println("index for key is " +binarysearch(numbers, key));
// }

// reverse an array

// public static void reverse (int numbers[] )

//  {
//     int first = 0, last = numbers.length-1;
//     while (first <last){
//         int temp = numbers [last];
//         numbers[last] = numbers[first];
//         numbers[first]=temp;
//         first++;
//         last--;
//     }
// }
// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10};
//     reverse(numbers);
//     for(int i=0;i<numbers.length;i++){
//         System.out.print(numbers[i]+" ");
//     }
//     System.out.println();
// }
// public static void printpairs(int numbers[]) {

//     for(int i =0; i<numbers.length; i++){
//         int curr = numbers[i];
//         for(int j = i+1 ;j<numbers.length; j++) {
//             System.out.print("(" + curr +"," + numbers[j] + " )" );
//     }
//     System.out.println();
// }


// }
// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10};
//     printpairs(numbers);
// }
// public static void printSubarrays(int numbers[]) {
//     int currsum =0;
//     int maxSum = Integer.MIN_VALUE;
//     for(int i=0; i< numbers.length;i++){
//         int start =i;
//         for(int j=i; j< numbers.length;j++){
//             int end = j;
//             currsum =0;
//             for (int k=start;k<=end;k++){
//                 currsum +=numbers[k];
                
//             }
            
//             System.out.println(currsum);
//             if(maxSum < currsum){
//             maxSum = currsum;
//         }
        
//     }
    
// }
// System.out.println(" max sum = " + maxSum);
// }
// public static void main(String[] args) {
//     int numbers[] = {1 ,-2 ,6,-1};
//     printSubarrays(numbers);
// }

// public static void maxsubarraysum(int numbers[]) {
//     int currSum =0;
//     int maxSum = Integer.MIN_VALUE;
//     int prefix[] = new int [numbers.length];
//     prefix[0]=numbers[0];
//     for(int i =1; i<prefix.length; i++){
//         prefix[i] = prefix[i-1] + numbers [i];
//     }
//     for (int i=0; i<numbers.length ; i++){
//         int start = i;
//         for(int j=i;j<numbers.length; j++){
//             int end = j;
//             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
//             if(maxSum < currSum){
//             maxSum = currSum;
//         }
//     }
// }
// System.out.println("max sum = " + maxSum);


// }
// public static void main(String[] args) {
//     int numbers[] = {1, -2, 3, 4, -5};
//     maxsubarraysum(numbers);
// }


}