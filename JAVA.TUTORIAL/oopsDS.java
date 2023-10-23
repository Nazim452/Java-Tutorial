
// public class oopsDS {
//     public  static class student{
//         String name;
//         int roll_no;
//         }


//     public static void change(student x){
//         x.roll_no = 90;       
//         return;
//     }
//     // public static void changeInt(int x){
//     //     x=7;
       
//     // }
//     public static void main(String[] args) {
//         student s1 = new student();
//         s1.name = " Nazim";
//         s1.roll_no = 39;
//         System.out.println(s1.roll_no);
//         change(s1);
//         System.out.println(s1.roll_no);
        
    






//     // int x = 5;
//     // System.out.println(x);   //x =5

//     // changeInt(x);
//     // System.out.println(x);    // x=5    not change     pass by value




//     }

    
// }





// making FRACTION CLASS



// public class oopsDS{
//     public static fraction add(fraction f1, fraction f2){
//         int numerator = f1.num*f2.den+f2.num*f1.den;
//         int denominator = f1.den*f2.den;
        
//         fraction f3 = new fraction();
//         f3.num = numerator;
//         f3.den = denominator;
//         f3.simplify();
//         return f3;
        
         
//     }
//     public static int gcd(int num, int den){
//         if(den==0) return num;
//         return gcd(den,num%den);
//     }
//     public static class fraction{
//         int num;
//         int den;

//         // constructor -> not working 

//         public void oopsDS(int num, int den){
//         this.num = num;
//         this.den = den;
//        // simplify();
//         }

//         public void simplify(){
//             int hcf = gcd(num, den);
//             num/=hcf;
//             den/=hcf;
            
//         }
//     }
    
   
    
//     public static void main(String[] args) {
//         fraction f1 = new fraction();
//         f1.num =35;
//         f1.den = 21;
//         f1.simplify();
//        System.out.println(f1.num+"/"+f1.den);

//        fraction f2 = new fraction();
//        f2.num = 7;
//        f2.den = 3;
//        System.out.println(f2.num+"/"+f2.den);

//        fraction f3 = add(f1,f2);
//        System.out.println(f3.num+"/"+f3.den);

        
//     }
// }





// CREATING ARRAY LIST

import java.util.Arrays;

public class oopsDS{
    public static class array_list{
        int []arr = new int[2];
        int index =0;
        int size =0;

        public void add(int elem){
            if(size==arr.length){
                int []brr = Arrays.copyOf(arr, arr.length*2);
                arr = brr;
            }
            arr[index] = elem;
            index++;
            size++;

        }
    }
    public static void main(String[] args) {
        array_list arr = new array_list();
        arr.add(5);
        System.out.println(arr.size);
        arr.add(7);
        arr.add(10);
        System.out.println(arr.size);
        
        
    }
}