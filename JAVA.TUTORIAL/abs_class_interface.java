import java.util.concurrent.ThreadPoolExecutor;

// abstract class parent{
//     public parent(){
//         System.out.println("I am a constructor of base");
//     }

//     public void sayHello(){
//         System.out.println("Hello friends");

//     }

//     abstract public void greet(); 
// }

// class child1 extends parent{
//     @Override
    
//     public void greet(){
//         System.out.println("Goood mornning");
//     }
// }



// abstract class child2 extends parent{
//     public void hi(){
//         System.out.println("Hi! friends");
//     }
// }


// public class abs_class_interface{
//     public static void main(String[] args) {
//         //parent par = new parent();      // ABSTRACT CLASS KA  OBJ NAHI BAN SAKTA
          

//         child1 c1 = new child1();

//         //child2 c2 = new child2();


        


//     }
    
// }






// interface bicycle{
//     int a= 45;

//     void applybreak(int decrement);
//     void speedup(int increment);

    
// }

// interface blowhoron{
//     //int x = 34;
//     void horon1();       // - no nee dto write the public
//     void horon2();

// }

// class Avonbicycle implements bicycle , blowhoron{
//     // void blowhorron(){
//     //     System.out.println("PPPPPP");
//     // }


//     public void applybreak(int decrement){
//         System.out.println("Break is applying....");
//     }

//     public void speedup(int increment){
//         System.out.println("speed is incrising");
//     }

//     public void horon1(){
//         System.out.println("Po po po po .....");
//     }

//     public void horon2(){
//         System.out.println("Pe pe pe pe .....");
//     }
// }

// public class abs_class_interface{
//     public static void main(String[] args) {
        
//         Avonbicycle ac  = new Avonbicycle();
//        // ac.applybreak(3);
//        //System.out.println(ac.x);

//         //ac. a = 56;    // we cant modify the vlaue of interface in
//        // System.out.println(ac.a);

        

//         ac.horon1();
//         ac.horon2();
//     }
// }








// EXAMPLE OF INTERFACE

// default keyworf in inheritnce





// interface  camera{
//     void takesnap();
//     void recordvodeo();

//     private void greet(){           // private metod can't be acces
//         System.out.println("Good morning");
//     }
//     default void record4kvideo(){ // if we dont want to implement method then
        
        //         greet();     // for acces of greet function

//   System.out.println("Recording in 4k video");  //use default keyword
//     }
// }

// interface wifi{
//     String [] getNetwork();

//     void connectToNetwork(String network);
// }

// class phone{
//     void callNumber(int phonenumber){
//         System.out.println("Calling the number"  + phonenumber);
//     }

//     void pickcall(){
//         System.out.println("Call is picking");
//     }
// }

// class smartphone extends phone implements wifi , camera{


//     public void takesnap(){
//         System.out.println("Snap is taking");
//     }

//     public void recordvodeo(){
//         System.out.println("Video is recording");
//     }

//     public String [] getNetwork(){
//     System.out.println("Getting the network");
//     String[] networkList = {"Nazim " , "Haary" , "hh"};
//     return networkList;
//     }


//     public void connectToNetwork(String network){
//         System.out.println("Connecting to network" + network);
//     }

//     // public void record4kvideo(){    // default wala overlap karne par ye wala run hoga
//     //     System.out.println("Recording in 4k by nazim");
//     // }



// }

// public class abs_class_interface{
//     public static void main(String[] args) {
        
//         smartphone sp = new smartphone();
//         String [] ar = sp.getNetwork();
//         for(String item:ar){
//             System.out.println(item);
//         }
//         sp.record4kvideo();

//         //sp.greet();  // private method can't be directly acces thriugh interface 
//     }
// }







// INHERITANCE IN INTERFACES




// interface sampleInterface{
//     void meth1();
//     void meth2();

// }

// interface  ChildsampleInterface extends sampleInterface{
//     void meth3();
//     void meth4();

// }

// class myclass implements sampleInterface{
//     public void meth1(){
//         System.out.println("Meth1");
//     }
//     public void meth2(){
//         System.out.println("Meth2");
//     }

//     public void meth3(){
//         System.out.println("Meth3");
//     }
//     public void meth4(){
//         System.out.println("Meth4");
//     }
// } 

// public class abs_class_interface{
//     public static void main(String[] args) {
        
//         myclass obj = new myclass();
//         obj.meth1();
//         obj.meth2();
//     }
// }







//  POLYMORPHISM IN INHERITANCE



// polymorphism  -- jiska referance liya usi ka method use ho sakta hai





// interface  camera{
//     void takesnap();
//     void recordvodeo();

//     private void greet(){           // private metod can't be acces
//         System.out.println("Good morning");
//     }
//     default void record4kvideo(){ // if we dont want to implement method then
        
        
//         greet();     // for acces of greet function


//         System.out.println("Recording in 4k video");  //use default keyword
//     }
// }

// interface wifi{
//     String [] getNetwork();

//     void connectToNetwork(String network);
// }

// class phone{
//     void callNumber(int phonenumber){
//         System.out.println("Calling the number"  + phonenumber);
//     }

//     void pickcall(){
//         System.out.println("Call is picking");
//     }
// }

// class smartphone extends phone implements wifi , camera{


//     public void takesnap(){
//         System.out.println("Snap is taking");
//     }

//     public void recordvodeo(){
//         System.out.println("Video is recording");
//     }

//     public String [] getNetwork(){
//     System.out.println("Getting the network");
//     String[] networkList = {"Nazim " , "Haary" , "hh"};
//     return networkList;
//     }


//     public void connectToNetwork(String network){
//         System.out.println("Connecting to network" + network);
//     }

//     // public void record4kvideo(){    // default wala overlap karne par ye wala run hoga
//     //     System.out.println("Recording in 4k by nazim");
//     // }



// }

// public class abs_class_interface{
//     public static void main(String[] args) {

//         camera c1 = new smartphone();   // refarance of camera, obj  of smartphone


//         // this is a smartphone, but only use as a camera


//         //c1.getNetwork();  // referance cmarea ka hia iasliye network nahi kam karega

//         c1.takesnap();
//         c1.record4kvideo();


//         smartphone sp = new smartphone();  // now w we can do access any method
//         sp.connectToNetwork("Nazim");
//         sp.callNumber(34);
        
       
//     }
// }






// create a abstract class pen extends concrete class fountainpen method write......




// abstract  class pen{
//     abstract void write();
//     abstract void refil();
    
// }

// class fountainPen extends pen{
//     void write(){
//         System.out.println("Writing");

//     }
//     void refil(){
//         System.out.println("Refilling");
//     }
//     void chnagenib(){
//         System.out.println("Changong the nib");
//     }
// }
// public class abs_class_interface{
//     public static void main(String[] args) {
        
//         fountainPen fp = new fountainPen();

//         fp.refil();
//         fp.write();
//     }
// }





// create a class monkey which inherits human class , inmplements basicanimal




//  class monkey{
//     void jump(){
//         System.out.println("Jumping....");
//     }
//     void bite(){
//         System.out.println("Biting..");
//     }
//  }

//  interface Basicanimal{
//     void eat();           
//     void sleep();
//  }


//  class human extends monkey implements Basicanimal{

//     public void eat(){
//         System.out.println("Eating......");
//     }

//     public void sleep(){
//         System.out.println("sleeping....");
//     }
//  }

// public class abs_class_interface{
//     public static void main(String[] args) {
        
//         human h = new human();
//         h.bite();
//         h.eat();
//         h.jump();

        

//         // polymorphism



//         monkey m = new human();  // only monkey method run

//        // m.eat();    -- eat is not presnt in monkey class
//        m.bite();




//        Basicanimal ha = new human();

//        ha.eat();
//        ha.sleep();

//       // ha.bite();
//     }
// }






// class calculator{
//     public void cal(int a , int b){
//         System.out.println(a + b);
//     }
// }
// class ScClaculator{
//     public void cal1(int c , int d){
//         System.out.println(c*d);
//     }
// }

// class hybridcal{
//     public void cal2(int e ,int f){
//         System.out.println(e*f);
//     }
// }






























