
//threads using runnablle




// class RunnableThrads1 implements Runnable{
//     public void run(){
//     int a = 0; 
//     while(a<2000){
//         System.out.println("I am a Runnable thraeeds 1");
//         a++;
//     }
// }
// }
// class RunnableThrads2 implements Runnable{
//     public void run(){
//     int a = 0;
//     while(a<2000){
//         System.out.println("I ma a runnable in threads 2");
//         a++;
//     }
// }
// }
// public class threading{
//     public static void main(String[] args) {

//         RunnableThrads1 bullet1 = new RunnableThrads1();
//         Thread gun1 = new  Thread(bullet1);

        
//         RunnableThrads2 bullet2 = new RunnableThrads2();
//         Thread gun2 = new  Thread(bullet2);

//         gun1.start();
//         gun2.start();


        
//     }
// }



// GET NAME & GET ID METHOD IN THRAEAD




// class Mythreads extends Thread{
//     public Mythreads(String name){
//        super(name);
//     }
    
//     public void run(){
//         int a = 5;
//         while(a>1000){
//             System.out.println("I am a thread");
//         }
//     }
// }

// public class threading{
//     public static void main(String[] args) {
//         Mythreads t1 = new Mythreads("Nazim");
//         Mythreads t2 = new Mythreads("Malik");

//         t1.start();

//         System.out.println("My id is  " + t1.getId());
//         System.out.println("Name is "+ t1.getName());
//         t2.start();

//         System.out.println(t2.getId());
//         System.out.println("Name is"+ t2.getName ());
//     }
// }




// PRIORITY IN THRRREADS




// class Mythreads extends Thread{
//     public Mythreads(String name){
//        super(name);
//     }
    
//     public void run(){
//         int a = 5;
//         while(true){
//             System.out.println("Thank you " + this.getName());
//         }
//     }
// }

// public class threading{
//     public static void main(String[] args) {
//         Mythreads t1 = new Mythreads("Nazim");
//         Mythreads t2 = new Mythreads("Malik");
//         Mythreads t3 = new Mythreads("KHAN");
//         Mythreads t4 = new Mythreads("nazim12");

//         t1.setPriority(Thread.MAX_PRIORITY);
//         t2.setPriority(Thread.MIN_PRIORITY);
//         t3.setPriority(Thread.MIN_PRIORITY);
        

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();



//    }
// }





// OTHER METHOD IN THREADS

//join method



// class Mythreads1 extends Thread{
   
    
//     public void run(){
//         int i = 0;
        
//         while(i<500){
//             System.out.println("Thank you " );
//             i++;
//         }
//     }
// }
// class Mythreads2 extends Thread{
//     public void run(){
//         while(true){
//             System.out.println("THank you Nazim");
//         }
//     }
// }

// public class threading{
//     public static void main(String[] args) {
//         Mythreads1 t1 = new Mythreads1();
//         Mythreads2 t2 = new Mythreads2();

//         t1.start();
//         try{
//             t1.join();               // first end t1 threads then start thraeds t2 
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         t2.start();


//     }

// }





// SLEEP METHOD





// class Mythreads1 extends Thread{
   
    
//     public void run(){
//         int i = 0;
        
//         while(true){
//             System.out.println("Thank you " );
            
//             try{
//                 Thread.sleep(30000);
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//             i++;
//         }
//     }
// }
// class Mythreads2 extends Thread{
//     public void run(){
//         while(true){
//             System.out.println("THank you Nazim");
//         }
//     }
// }

// public class threading{
//     public static void main(String[] args) {
//         Mythreads1 t1 = new Mythreads1();
//         Mythreads2 t2 = new Mythreads2();

//         t1.start();
//         try{
//             t1.join();               // first end t1 threads then start thraeds t2 
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         t2.start();


//     }

// }





// add a sleep method in weelcome




class goodMorning extends Thread{
    public void run (){
        while(true){
            System.out.println("GOOD MORNING");
        }
    }
}


class welcome extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("WELCOME");
        }
    }
}


public class threading{
    public static void main(String[] args) {
        goodMorning g = new goodMorning();

        welcome w = new welcome();

        
        w.start();

        
        g.start();

        System.out.println(w.getState());  // -- o/p kabhi new kabbhi kabhi runnble
                                             // state change hote rahta hai  


         // current thread -- referance of the currently thread obj 
         System.out.println(Thread.currentThread().getState());  // - o/p - runnable                                 
    }


}




































































