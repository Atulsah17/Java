 

public class functions{
// public static void swap(int a, int b) {
//       int temp = a;
//         a = b ;
//         b = temp;
        
          
// }
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
//      swap(a,b);
//         System.out.println(" a=" +a);
//             System.out.println("b= " +b);
        
//     }
// }
//    product of two numbers
// public static int multiply(int a , int b) {
//     int product = a * b;
//     return product;
    
// }
// public static void main(String[] args) {
//     int a = 3;
//     int b = 5;
//     int prod = multiply(a , b);
//     System.out.println("a * b =" +prod);
//     prod = multiply(56, 89);
//     System.out.println("56*89="+prod ); 
// }
// }
// public static int factorial(int n) {
//     int f =1;
//     for (int i =1 ; i<= n;i++){
//         f = f * i ;
//     }
//     return f;
// }
// // public static void main(String[] args) {
// //     System.out.println(factorial(9));
// // }



// public static int bincoeff(int n , int r) {
//     int fact_n = factorial(n);
//     int fact_r = factorial(r);
//     int fact_nmr = factorial(n-r);
//     int bincoeff= fact_n / (fact_r*fact_nmr);
//     return bincoeff;
    
// }
// public static void main(String[] args) {
//     System.out.println(bincoeff(7, 2));
// }
// }

// function to calculate sum of two nums 
// public static int sum (int a , int b) {
//     return a + b ;
    
// }
// //  function to calculate sum of 3 nums
// public static int sum(int a , int b , int c) {
//     return a + b +c ;
// }
// public static int sum(int a ,int b) {
//     return a + b ;

    
// }
// public static float sum(float a , float b) {
//     return a + b ;
// }
// public static void main(String[] args) {
//     System.out.println(sum(5, 3));
// System.out.println(sum(3.2f, 4.8f));
// }
    
// public static boolean isprime(int n) {
//     boolean isprime = true;
//     for(int i = 2;i<=n-1;++i){
//     if( n % i == 0){
//     return  false;
    
//     }
// }
//     return  true;
// }
//     public static void main(String[] args) {
//      System.out.println(isprime(6));  
//     }
     
// public static boolean isprime(int n ) {
//     if(n == 2){
//     return true;

    
// }
// for( int i=2; i<=Math.sqrt(n);i++ ){
//     if(n%i==0) {
//     return false;
// }
// }
// return true; 
// }
// public static void isPrimeRange(int n) {
//     for(int i=2; i<=n; ++i){
//     if(isprime(i)){
//         System.out.print(i+"  ");
//     }
// }

//     System.out.println();
// }
// public static void main(String[] args) {
//     isPrimeRange(20);
// }

// covert from binary to decimal

public static void binTodec(int binNum) {
    int myNum = binNum;
    int pow = 0;
    int decNum =0;
    while(binNum > 0){
        int lastDigit = binNum % 10;
        decNum += (lastDigit * (int)Math.pow(2 , pow ));
        pow++;

    }
    System.out.println("decimal of" + myNum +"  = " +decNum);

}
public static void main(String[] args) {
    
    binTodec(110);
}
}

