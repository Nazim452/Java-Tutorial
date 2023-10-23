
import java.util.Scanner;

// public class error_exception {
//     public static void main(String[] args) {
//         int a = 2400;

//         int b = 0;
//         int c = a/b;
//         try{
//             System.out.println(c);

//         }
//         catch(Exception e){
//             System.out.println("Your input is wrong  reason i s--");
//             System.out.println(e);
//         }
//     }
    
// }




// import java.util.Scanner;

// public class error_exception{
//     public static void main(String[] args) {
        
//         int [] marks =  new int[3];
        
//         marks[0] = 48;
//         marks[1] = 34;
//         marks[2] = 50;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the marks");
//         int mark = sc.nextInt();

//         System.out.println("Enter the number to divide the marks");
//         int num  = sc.nextInt();
        

//         try{
//             System.out.println("THe division is "+ marks[mark] / num);
//         }
//         catch(ArithmeticException e){
//             System.out.println("ArithmeticException occured sale 0  se divide mat kar");
//             System.out.println(e);

//         }
//         catch(IndexOutOfBoundsException e){
//             System.out.println("sale index sahi se dal" );
//             System.out.println(e);
//         }

//         catch(Exception e){
//             System.out.println("some  other excption");
//             System.out.println(e);
//         }
        

        
//     }
// }





// nested try catch




// import java.util.Scanner;

// public class error_exception{
//     public static void main(String[] args) {
        
//         int [] marks =  new int[3];
        
//         marks[0] = 48;
//         marks[1] = 34;
//         marks[2] = 50;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the index");
//         int index = sc.nextInt();

//         try{
//             System.out.println("Hi");

//             try{
//                 System.out.println(marks[index]);   // wrong idex dalne par andar wala hi 
//                                           //try catch se kam khatam ho jayega
//             }
//             catch(IndexOutOfBoundsException e){
//                 System.out.println("sale index sahi se to dal");
//                 System.out.println(e);
//                 System.out.println("Exception  level 2");
//             }
//         }
//         catch(Exception e){
//             System.out.println("Other excwption ");
//             System.out.println(e);
//         }

       

        
//     }
// }







// import java.util.Scanner;

// public class error_exception{
//     public static void main(String[] args) {


//         int [] marks =  new int[3];
        
//         marks[0] = 48;
//         marks[1] = 34;
//         marks[2] = 50;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the index");
//         int index = sc.nextInt();

//         boolean flag = true;

//         while(flag){
//             try{
//                 System.out.println("Hi");
    
//                 try{
//                     System.out.println(marks[index]);   // wrong idex dalne par andar wala hi 
//                                               //try catch se kam khatam ho jayega

//                     flag = false;
//                 }
//                 catch(IndexOutOfBoundsException e){
//                     System.out.println("sale index sahi se to dal");
//                     System.out.println(e);
//                     System.out.println("Exception  level 2");
//                 }
//             }
//             catch(Exception e){
//                 System.out.println("Other excwption ");
//                 System.out.println(e);
//             }
    
//         }
//         System.out.println("Thanks for using");

       
        
        
       

        
//     }
// }








// EXCEPTION CLASS


// class MyException extends Exception{

//     public String toString(){
//         return "I am a to string()";
//     }

//     public String getMessage(){
//         return "I am a get Message()";
//     }
// }

// public class error_exception{
//     public static void main(String[] args) {
//         int a;
        

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no");
//         a = sc.nextInt();
//         if(a>9);

//         try{
//             //throw new MyException();
//             throw new ArithmeticException("I am a airthmatic function");  

//         }
//         catch(Exception e){
//             System.out.println(e.getMessage());
//             System.out.println(e.toString());
//             System.out.println(e);                // call toString
//             e.printStackTrace();          // kon sa error kis line me hai pata karta 
//         }
//         System.out.println("Program is finish");
//     }
// }





// practiacal uses if   THROW VS TTHROWS


//THROW  - EXCEPTIION  ko through karne ke liye chahe ho custom ho ya predefined

// THROWS  - indicate for using other programmer


// class RadiusNegativeException extends Exception{
//     @Override
//     public String toString() {
//         return "Sale radius -ve mat dal()";
//     }


// }



// public class error_exception{

// public static double area(int  r) throws RadiusNegativeException{
//     double result = Math.PI*r*r;
//     return result;
// }

    
// public static int divide(int a, int b) throws ArithmeticException{
//     int result = (a/b);
//     return result;
// }


//     public static void main(String[] args) {
        
        
              
//         try{
//             // int c = divide( 2, 0);
//             // System.out.println(c);
//             double ar = area(7);
//             System.out.println(ar);

//         }
//         catch(Exception e){
//             System.out.println("sale 0 se divide mat kar");
//         }
      
        

        
//     }
// }





// FINALLLY BLOCK



// public class error_exception{
//     public static int greet(){
//         try{
//             int a = 12;
//             int b = 3;
//             int c = a/b;
//             return c;
//         }
//         catch(Exception e){
//             System.out.println("sale sahi se dal");
//         }

//         finally{   // upar return c hone ke badd bhi yah har hal me run hoga hamesha
//             System.out.println("The program is claenuing");
//         }
//         return 0;
//     }



//     public static void main(String[] args) {
//         int k=greet();
//         System.out.println(k);
//         int a = 7;
//         int b = 8;
//         //int c = a/b;

//         while(true){
//             try{
//                 System.out.println(a/b);
//             } 
//             catch(Exception e){
//                 System.out.println(e);
//                 break;
//             } 

            
//             finally{     // 0 aane par break ke baadd bhi finally chala
//                   System.out.println("I am a finally for value b = " + b);
//            }
//            b--;
               
//         }

//         try{
//             System.out.println(5/8);
//         }
//         finally{
//             System.out.println("Yes, i am finaaly");
//         }


//     }
// }








// write a program that allow you to keep accessing an array until a valid index is given .
// if max returns exceed 5 print error


public class error_exception{
    public static void main(String[] args) {

      int []marks = new int [3]  ;

      marks[0] = 45;
      marks[1] = 50;
      marks[2] = 55;

      boolean flag = true;
      Scanner sc = new Scanner(System.in);
      int i = 0;
      int index;

      while(flag && i<5){

        try{
            System.out.println("Enter the index;- ");
            index = sc.nextInt();
            System.out.println("The  value of marks[idex] = " + marks[index]);
            break;

        }
        catch(Exception e){
            System.out.println("sale index 3 se jyada kyo dala  invalid index");
            i++;
        }
        
      }
      if(i>=5){
        System.out.println("eroor");
      }

      


      


    }
}










