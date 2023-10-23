// class employee{
//     int id;
//     String name;
//     int salary;
//     public void printdetails(){
//         System.out.println("My ID is ---   " + id);
//         System.out.println("My Name is ----  " + name);
//     }

//     public int getsalary(){
//         return salary;
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         employee Nazim = new employee(); //instatatiating a new employee object

//         // setting properties

//         Nazim.id = 12;
//         Nazim.name = "Nazim Khan";


//         employee harry = new employee();
//         harry.id = 2;
//         harry.name = "HARISH";
//         harry.salary = 45;


//         // System.out.println(Nazim.id);
//         Nazim.printdetails();
//         harry.printdetails();


//         int salary = harry.getsalary();
//         System.out.println(salary);
        
//     }
    
// }



// prob - 1



// class employee{
//     int salary;
//     String name;

//     public int getsalary(){
//         return salary;

//     }

//     public String getname(){
//         return name;
//     }


//     public void setname(String n){
//         name = n;

//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         employee nazim =  new employee();

//         nazim.setname("Nazim");
//         nazim.salary = 233;

//         System.out.println(nazim.getname());
//         System.out.println(nazim.getsalary());   
        
//     }
// }





// CREATE A CLASS CELPHONE WITH METHOD TOI PRINT RING VIBR 





// class cellphone{
//     public void ring(){
//         System.out.println("Ringing");
//     }

//     public void vibr(){
//         System.out.println("vibrating");
//     }

//     public void call(){
//         System.out.println("Calling");
//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         cellphone asus = new cellphone();
//         asus.vibr();
//         asus.ring();
//         asus.call();

//     }

// } 




// CREATE A CLASS SQUAE WITH A METHOD TO INITIALIZE SIDE  , CALCU ARAEA , PERIMERTER


// class square{
//     int side;
//     public int area(){
//         return side *side; 
//     }

//     public int perimeter(){
//         return 4*side;
//     }
// }

// public class oops{
//     public static void main(String[] args) {
//         square sq = new square();
//         sq.side = 3;

//         System.out.println(sq.area());
//         System.out.println(sq.perimeter());


//     }
// }




// class recatanngle{
//     int length;
//     int breadth;
    

//     public int area(){
//         return length*breadth;

//     }

//     // public int perimeter(){
//     //     int a = 2;
//     //     return a(length+breadth);

//     // }
// }

// public class oops{
//     public static void main(String[] args) {
//         recatanngle rect = new recatanngle();

//         rect.length = 2;
//         rect.breadth = 3;
//         System.out.println(rect.area());
//     }
// }





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
// public class oops{
//     public static void main(String[] args) {
//         employee nazim = new employee();

//       // nazim.name = "NazimKhan"; --> error , bcz private name

//        nazim.setname("Nazim ");
//        System.out.println(nazim.getname());
//     }
// }





