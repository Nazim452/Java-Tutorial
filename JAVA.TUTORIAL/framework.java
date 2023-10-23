// import java.util.ArrayList;


import java.util.*;
// public class framework {
//     public static void main(String[] args) {
        
//         ArrayList<Integer>l1 = new ArrayList<>();

//         ArrayList<Integer>l2 = new ArrayList<>();

//         l2.add(11);
//         l2.add(12);
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         l1.add(0, 100);

//         l1.addAll(l2);
//         System.out.println(l1.contains(19));  // if elem present - true

        
//         System.out.println(l1.indexOf(11));
//         for(int i = 0; i<l1.size() ; i++){
//             System.out.println(l1.get(i));
//         }
//     }
    
// }





// public class framework {
//     public static void main(String[] args) {
        
//         ArrayList<Integer>l1 = new ArrayList<>();

//         LinkedList<Integer>l2 = new LinkedList<>();

//         l2.add(11);
//         l2.add(12);
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         l1.add(0, 100);

//         l2.addLast(5677);
//         l2.addFirst(33333);

//         l1.addAll(l2);
//         System.out.println(l1.contains(19));  // if elem present - true

        
//         System.out.println(l1.indexOf(11));
//         for(int i = 0; i<l1.size() ; i++){
//             System.out.println(l1.get(i));
//         }
//     }
    
// }







// public class framework {
//     public static void main(String[] args) {
        
//         ArrayDeque<Integer>l1 = new ArrayDeque<>();

//         LinkedList<Integer>l2 = new LinkedList<>();

//         l2.add(11);
//         l2.add(12);
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         System.out.println(l1.getFirst());
//         System.out.println(l1.getLast());
        

//         l2.addLast(5677);
//         l2.addFirst(33333);

//         l1.addAll(l2);
//         System.out.println(l1.contains(19));  // if elem present - true

        
       
    
// }
// }










// public class framework {
//     public static void main(String[] args) {
        
//        HashSet<Integer>l1 = new HashSet<>();

//         LinkedList<Integer>l2 = new LinkedList<>();

//         l2.add(11);
//         l2.add(12);
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         System.out.println(l1);
      

//         l2.addLast(5677);
//         l2.addFirst(33333);

//         l1.addAll(l2);
//         System.out.println(l1.contains(19));  // if elem present - true

        
       
    
// }
// }






// DATE TIME

// public class framework{
//     public static void main(String[] args) {
//         //System.out.println(System.currentTimeMillis()/1000/3600/24/365);

//         // Date d = new Date();
//         // System.out.println(d);
//         // System.out.println(d.getTime());

//         // System.out.println(d.getYear());



//         Calendar c = Calendar.getInstance();
//         System.out.println(c.getTimeZone());
//         System.out.println(c.getCalendarType());
//     }
// }







// CALENDAR CLASS


public class framework{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.getTime());
        System.out.println(c.MINUTE);
        System.out.println(c.SECOND);
        System.out.println(c.HOUR_OF_DAY +" : " + c.MINUTE +" : "+ c.SECOND);



        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(2020));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}



































































































