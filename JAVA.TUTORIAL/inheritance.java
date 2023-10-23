import java.nio.channels.Pipe;

// class base{
//     public int x;

//     public int getx(){
//         System.out.println("I am in base &  print x");
//         return x;
//     }

//     public void setx(int a){
//         x = a;


//     }
// }
// class derived extends base{        // EXTENDS  - MAEN   base ka sara code derived me aa gaya
//     public int y;           // public -- kahin bhhi access kiya ja sakt hai

//     public int gety(){
//         return y;
//     }

//     public void sety(int b){
//         y = b;


//     }

    
// }

// public class inheritance{
//     public static void main(String[] args) {
        
        

//         derived b = new derived();     // derived me base ka object use kiya

//         b.setx(55555);
//         System.out.println(b.getx());
//     }
// }






// CONSTRUCTION IN INHERITANCE


// class base{
//     base(){
//         System.out.println("I am a constructor in base");
//     }

//     base(int a){
//         System.out.println("I am a constructor in base a as: " + a);
        

//         // if we want to run this constru without using argument then use super keyword
//     }
// }

// class derived extends base{
//     derived(){
//         super(0);  
//         System.out.println("I am a constructor in derived");
//     }
// }

// public class inheritance{

//     public static void main(String[] args) {

//         //base b = new base();
//         derived d = new derived();   // -- ise call karne par 1st base then derived constr print
        
//     } 
// }







// class base{
//     base(){
//         System.out.println("I am a constructor in base");
//     }

//     base(int a){
//         System.out.println("I am a constructor in base a as: " + a);
        

//         // if we want to run this constru without using argument then use super keyword
//     }
// }

// class derived extends base{
//     derived(){
//         //super(0);  
//         System.out.println("I am a constructor in derived");
//     }
//     derived(int x , int y){
//         super(x);
//         System.out.println("I am a connstructor in derived as y = " + y);
//     }
// }

// public class inheritance{

//     public static void main(String[] args) {

//         //base b = new base();
//         derived d = new derived(4,5);   // derive ka aakhiri wala  & base ka akhiri wala
//     }                                      // print nbcz -- super (x)
// }





//  METHOD OVERLOADING  -- SAME METHOD IN A CLASS , DIFFERENT PARAMATER


// METHOD OVERRIDING -- SAME METHOD IN DIFFERENT CLASS , SAME PARAMETER






// OVERRIDING IN METHOD




// class a{
//     public int a;

//     public void meth1(){
//         System.out.println("I am a method in class a");
//     }
    
// }

// class b extends a{
//     @Override                      // not compulsury -- only denote for overiding
//     public void meth1(){
//         System.out.println("I am a cmethd in class b");
//     }
// }

// public class inheritance{
//     public static void main(String[] args) {
//         a A = new a();
//         a.meth1();

//         b B = new b();
//         b.meth1();
//     }
// }








// DYNAMIC METHOD DISPATCH 


// class phone{
//     public void greet(){
//         System.out.println("Good morning");
//     }

//     public void on(){
//         System.out.println("Phone is ringing");
//     }
// }

// class smartphone extends phone{

//     public void on(){
//         System.out.println("Smart phone is ringing");
//     }

//     public void music(){
//         System.out.println("Music is playing");
//     }

// }

// public class inheritance{
//     public static void main(String[] args) {

//         phone ph = new smartphone();   // obj run time pe banta hai isliye dynamic dispatch


//         //smartphone ph1 = new phone();       -- not allowed


//         ph.greet();

//         ph.on();   // smartphone ka obj bana hai isliye smartphone wala on print hoga


//         //ph.music(); --- not allowed  --  it is present in smartphone class
//     }
// }







// make  A CIRCLE CLASS INASIDE THIS EXTENDS CYLINDER CLASS


class circle{
    public int radius;

    circle(){
        System.out.println("I am not paramized");
    }

    circle(int r){                  // constructor
        System.out.println(" i am a paramarized circle");
        radius = r;
    }
    // public float getradius(){
    //     return radius;
    // }
    


    public double area(){           // method
        return Math.PI*radius*radius;


    }
   

    
    
}
class cylinder1 extends circle{
    public int height;

    cylinder1(int r, int h){      //constructor
        super(r);      // isse argument wala constuc hi run hoga

        System.out.println("I am a paramized cylimnder constructor");
        height = h;
    }

    public  double getheight(){
        return height;
    }
    public double volume(){
        return  Math.PI*radius*radius*height;
    }
    
    

}
public class inheritance{
    public static void main(String[] args) {
        
        circle cir = new circle(46);
        
       
        

        //cylinder1 cyl = new cylinder1(3, 5);
    }
}



































































