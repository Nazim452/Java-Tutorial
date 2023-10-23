

// public class method {
//     static int logic(int x , int y){
//         int z;
//         if(x>y){
//             z= (x +y);
//         }
//         else{
//             z= (x+y)/5;
//         }
//         int l = 222;  // value modify then not change in value 
//         return z;

//     }
//     public static void main(String[] args) {
//         int a = 5;          // a NAHI JAYRGA FUN ME  a  KA COPY JATA H
//         int b = 10;
//         int c;
//         c = logic(a, b);

        
//         System.out.println(c);
        
//     }
    
// }







//2nd way to call the function ---     WITHOUT STATIC



    // public static void main(String[] args) {
    //         int a = 5;
    //         int b = 10;
    //         int c;
    //         method obj = new  method();    // METHOD IS CLASS NAME apin marzi 

    //         c = obj.logic(a, b);
    
            
    //         System.out.println(c);
            
    //     }
        
    // }
    




// public class method{
//     static void change (int [] marks){
//         marks[0] = 100;
//     }


//     static void joke(){        // void - if no return
//         System.out.println("Nazim is a good boy");
//     }
//     public static void main(String[] args) {
//         //joke();
        
//         int [] marks = { 23, 34, 56, 78,67};  // fun call me array me reference pass hota h , copy n
//         change(marks);
//         System.out.println(marks[0]);  // here marks[0] - change bcz
//                                        // array me copy pass n hota h referece hota ha pass
//     }
// }



// Same  name ka 2 fun banane par fun call karne par o/p depend karega





// public class method{
//     static void foo(){
//         System.out.println("Good morning");
//     }

//     static void foo(int a){
//         System.out.println("Good morning  " + a + "  Bro");
//     }
//     public static void main(String[] args) {

//         foo();
//         foo(44); // java sumjh gaya int wale fun ko call karna hai
        
//         // foo(50) -- aargument  --  are actual

//         // foo(int a) -- parameter
//     }
// }




// VARIABLE ARGUMENT





// public class method{

//     static int sum(int...arr){     // static int sum(int x , int...arr)-- 1 argument compulsury
//         int result = 0;             // int result = x
//         for(int a:arr){
//             result = result+a;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(2,3));
//         System.out.println(sum(2,3,4,5)); // no need to write different method 
//         System.out.println(sum());                // give 0


//     }
// }




// RECURSION


//FACRIAL THROUGH RECURSIVE


// public class method{
//     static int factorial(int n){
//         if (n==1 || n==0){
//             return 1;
//         }
//         else{
//             return n*factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int x = 5;
//         System.out.println(factorial(x));
//     }
// }




//  FACRIAL THROUGH ITERATIVE



// public class method{
//     static int factorial_iterative(int n){
//         if (n==1 || n==0){
//             return 1;
//         }
//         else{int product = 1;
//             for(int i =1; i<=n; i++){
//                 product = product*i;
//             }
//             return product;
            
//         }
//     }
//     public static void main(String[] args) {
//         int x = 5;
//         System.out.println(factorial_iterative(x));
//     }
// }



// PRACTICE SET



// MULTIPLICATION TABLE OF N


// public class method{
//      static void multiplication (int n){
//         for(int i = 1; i<=10; i++){
//             System.out.printf("%d X %d = %d \n" , n , i , n*i);
//         }
//      }
//     public static void main(String[] args) {
//         multiplication(5);
        



//     }
// }



// STAR PATTERN



//    public class method{
//     static void star1(int n){
//         for(int i = 0; i<n ; i++){
//             for(int j = 0; j<i+1 ; j++){    // for i = 0 print *
//                 System.out.print("*");    // for i= 1  print ** -- j<i+1
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         star1(10);
        



//     }
//    }




// FIRST N NATURAL NUMBER SUM -- RECURSIVE FUNCTION






// public class method{
//     // 1+2+3+.....+(n-1) + n
//     // sum(n-1) + n

//     static int sum(int n){
//         // base condition
//         if (n==1){
//             return 1;  // for terminating the function
//         }
//         return n + sum(n-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(4));
        
//     }
// }



// STAR REVERSE PATTERN



//    public class method{
//     static void star1(int n){
//         for(int i = 0; i<n ; i++){
//             for(int j = 0; j<n-i ; j++){    // for i = 0 print *
//                 System.out.print("*");    // for i= 1  print ** -- j<i+1
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         star1(10);
    
//     }
//    }



// FIBNOACCI  SERIES  -- FOR nTH SERIES     --    COUNTING START FROM 1

// 0 , 1 , 1 , 2 , 3 , 5 , 8 


// public class method{
//     static int fab(int n){
//         if (n==1){
//             return 0;
//         }
//         else if (n==2){   // beacause 1st 2 no is fixed in fib . 0 & 1
//             return 1;
//         }
//         else{
//             return fab(n-1) + fab (n-2);  // FIB IS SUM OF PREVIOUS TWO NUMBER 
//         } 
//         }
        
        
    
//     public static void main(String[] args) {
//         int result = fab(5);                       // 5th POSITION PAR 3 HAI
//         System.out.println(result);
        
//     }
// }




// AVERAGE NUMBER  -- HW





//  STAR PATTERN -- USING RECURSION



public class method{
    static void star(int n){
        if(n>0){
            star(n-1);
            for(int i=1; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    
    public static void main(String[] args) {
        star(8);
        
    }
}


        

















