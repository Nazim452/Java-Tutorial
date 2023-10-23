

// if user give wrong vlaue then we stop send message to him, so private used




// class employee{
//     private String  name;

//     public String getname(){
//         return name;

//     }

//     public void setname(String n){
//          name =n  ;

        
//     }

// }
// public class Accessmod_construc {
//     public static void main(String[] args) {

//         employee nazim = new employee();

//       // nazim.name = "NazimKhan"; --> error , bcz private name

//        nazim.setname("Nazim ");
//        System.out.println(nazim.getname());
//     }
// }

   


// CONSTRUCTOR




// class employee{
//     private String  name;

//     public String getname(){
//         return name;

//     }

//     public void setname(String n){
//          name =n  ;

        
//     }
//     public employee(){                   // constructor
//         name = "Nazim Hero";
//     }



//     public employee(String myname){       // in constructor we give  argument
//         name = myname;                     // we can also give 2 argument   

//     }   

// }   // 2 - constructor same name  ---   overloading in constructor 



// public class Accessmod_construc{
//     public static void main(String[] args) {


//         //employee Nazim = new employee("Nazim Mmm");     // in public employeee is take argument , so here arg

//         //Nazim.setname("Nazim malik"); -- in constructor if we not write  ths line then public class run
//        employee Nazim = new employee();



//        System.out.println( Nazim.getname());


        
//     }
// }





// CREATE A CLASS CYLINDER & USE GETTER & SETTER  & SET ITS RADIUS & HEIGHT






// class cylinder{
//     private int radius;
//     private int height;

//     public int getheight(){
//         return height;
//     }

//     public void setheight(int n){
//         height = n;
//     }


//     public int getradius(){
//         return radius;
//     }

//     public void setradius(int r){
//         radius = r;
//     }

//     public double volume(){
//         return Math.PI * radius * radius * height;
//     }



    
// }


// public class Accessmod_construc{
//     public static void main(String[] args) {
//         cylinder cy = new cylinder();

//         cy.setheight(12);
        
//         System.out.println(cy.getheight());


//         cy.setradius(9);


//         System.out.println(cy.getradius());


//         //System.out.println(cylinder.volume());  //    NOT WORKING
//     }
// }






// Q - 1 WITH CONSTRUCTOR










// class cylinder{
//     private int radius;
//     private int height;

//     public cylinder(int r , int h){      // CONSTRUCTOR
//         height = h;  
//         radius = r;
//     }

//     // public int getheight(){
//     //     return height;
//     // }

//     // public void setheight(int n){
//     //     height = n;
//     // }


//     // public int getradius(){
//     //     return radius;
//     // }

//     // public void setradius(int r){
//     //     radius = r;
//     // }

//     public double volume(){
//         return Math.PI * radius * radius * height;
//     }



    
// }


// public class Accessmod_construc{
//     public static void main(String[] args) {
//         cylinder cy = new cylinder(9,12);

//         // cy.setheight(12);
        
//         // System.out.println(cy.getheight());


//         // cy.setradius(9);


//         // System.out.println(cy.getradius());


//         System.out.println(cylinder.volume());  //    NOT WORKING
//     }
// }







class base{
    public int x;

    public int getx(){
        System.out.println("I am in base &  print x");
        return x;
    }

    public void setx(int a){
        x = a;


    }
}
class derived extends base{        // EXTENDS  - MAEN   base ka sara code derived me aa gaya
    public int y;           // public -- kahin bhhi access kiya ja sakt hai

    public int gety(){
        return y;
    }

    public void sety(int b){
        y = b;


    }

    
}

public class Accessmod_construc{
    public static void main(String[] args) {
        
        

        derived b = new derived();     // derived me base ka object use kiya

        b.setx(55555);
        System.out.println(b.getx());
    }
}



















































    
    

