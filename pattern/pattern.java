public class pattern {
//     public static void main(String[] args) {
// for(int line=1; line<=4; line++)
// {
//     for(int star=1  ; star<=5-line; star++)
//     {
//         System.out.print(" *");
//     }
// {
//     System.out.println();
// }
// }
//     }
// }


// Print half- pyramid pattern
// 
// public static void main(String[] args) {
//      int n=4;
//      char ch='A';
//      for (int line=1;line<=n;line++){
//         for(int chars=1;chars<=line;chars++)
//         {System.out.print(ch);
//             ch++;
// }
// System.out.println();
// }

// }

// public static void hollow_rectangle(int totRows ,int totCols) {
//     for(int i=1; i<=totRows;i++) {

//     for(int j=1;j<=totCols;j++) {
//         if (i ==1 || i == totRows || j == 1 || j == totCols){
//             System.out.print("*");}

          
//          else
//          {
//                 System.out.print(" ");
            
//         }
//     }
//         System.out.println(" ");
//     }

// }
// public static void main(String[] args) {
//     hollow_rectangle (4, 5);
// }
// public static void inverted_rotated_half_pyramid(int n ) 
// {
//     for (int i=1 ;i<=n;i++ ){
//         for (int  j= 1;j<=n-i;j++ ){
//     System.out.print(" ");
// }
//     for (int  j=1; j<=i; j++){
//         System.out.print("*");
// }
// System.out.println();

// }

// }
// public static void main(String[] args) {
//     inverted_rotated_half_pyramid(7);
// }



//  hlf pyramid with numbers
// public static void inverted_rotated_half_pyramid_numb(int n) 
// {
//     for(int i =1; i<=n; i++){
//         for(int j=1; j<=n-i+1; j++){
//             System.out.print(j+ " ");
//     }
//     System.out.println();
// }

// }
// public static void main(String[] args) {
//     inverted_rotated_half_pyramid_numb(5);
// }

// floyd traingle

// public static void floyd_trigle(int n ) {
//     int counter= 1;
//     for(int i=1 ; i<= n; i++){
//         for(int j=1 ; j<=i; j++){
//             System.out.print(counter+ " ");
//             counter++;
//             }System.out.println(" ");
//         }
//     }
    
// public static void main(String[] args) {
//     floyd_trigle(5);
// }

// public static void tragle_patte(int n) {
//     for(int i=1; i<n; i++){
//         for(int j=1;j<=i;j++){
//             if((i+j) % 2 == 0){
//                 System.out.print("1");
//             }
//             else 
//             {
//                 System.out.print("0");
//             }
//         }
//         System.out.println();
//     }
    
// }
// public static void main(String[] args) {
//     tragle_patte(5);
// }
// public static void butterfly (int n){
//     for(int i =1; i<=n; i++){
//         for(int j= 1;j<=i; j++){
//             System.out.print("*");
//         }
//         for(int j=1; j<= 2*(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<= i; j++){
//             System.out.print("*");
//         }
// System.out.println();
//         }
        

//         for(int i=n; i>=1; i--){
//             for(int j= 1;j<=i; j++){
//                 System.out.print("*");
                
//         }
//           for(int j=1; j<= 2*(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<= i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//         }
        
// }


//  public static void main(String[] args) {
//     butterfly(4);
//  }
// public static void solid_rhom(int n) {
//     for(int i=1; i<=n; i++){
//         for(int j=1;j<=(n-i); j++){
//         System.out.print(" ");}
//         for(int j= 1; j<=n; j++ ){
//             System.out.print("*");
//         }
//         for(int j =1; j<=(n-i); j++)
//         {
//             System.out.print(" ");
//         }
//     System.out.println();
//     }
    
// }
// public static void main(String[] args) {
//     solid_rhom(5);
// }
// public static void hollow_rhom(int n) {
//     for(int i=1; i<=n; i++ ){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=n; j++){
//             if(i == 1 || i == n || j == 1 || j ==n) {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
    
// }
// public static void main(String[] args) {
//     hollow_rhom(5);
// }
// public static void diamond(int n) {
//     for(int i=1;i<=n; i++ ){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//     }
//     for(int j=1;j<=(2*i)-1;j++){
//         System.out.print("*");
//     }
//     System.out.println() ;
// }
//  for(int i=n;i>=1; i-- ){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//     }
//     for(int j=1;j<=(2*i)-1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// }
// public static void main(String[] args) {
//     diamond(4);}
// }

}