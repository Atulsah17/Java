public class dsaques {
//     public static int Rainater(int height[] )  {
//         int n =height.length;
//         int leftMax[]= new int [n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n ; i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);

//         }
// int rightMax[] = new int [n];
// rightMax[n-1]=height[n-1];
// for(int i=n-2; i>=0; i--){
//     rightMax[i] = Math.max(height[i], rightMax[i+1]);
// }
// int trappedWater = 0;
// for (int i = 0; i < n; i++) {
//     int waterLevel = Math.min(leftMax[i], rightMax[i]);
//     trappedWater += waterLevel - height[i];
//     }
// return trappedWater;
// }
//     public static void main(String[] args) {
//           int height[] = {4 , 2   ,0 ,6 , 3 , 2 , 5 };
// System.out.println(Rainater(height));
//          }
//     public static int stocks(int price[]) {
//           int buyPrice = Integer.MAX_VALUE;
//           int maxProfit = 0;
//           for(int i=0; i<price.length; i++){
//           if(buyPrice < price[i]){
//            int profit = price[i] - buyPrice;
// maxProfit= Math.max(maxProfit, profit);

//           }else{
// buyPrice = price[i];

//           }
        
//     }
// return maxProfit;
// }
// public static void main(String[] args) {
// int price [] = {7 , 1 ,5 ,3 ,6 ,4}   ; 
// System.out.println(stocks(price));
// }

// duplicate numbers

// public static boolean containsDuplicate(int[] numb) {
// for(int i=0; i<numb.length; i++){
//     for(int j= i+1; j<numb.length; j++){
//         if(numb[j] == numb[i]){
//     return true;
//         }

//     }

// }
//     return false;
// }
// public static void main(String[] args) {
//     int  numb [] = {1,2,1,4};
//     System.out.println(containsDuplicate(numb));
// }
}