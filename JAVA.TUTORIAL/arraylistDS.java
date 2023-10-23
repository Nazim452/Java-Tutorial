import java.util.ArrayList;


public class arraylistDS {

// reverse of array list


    static void Reverselist(ArrayList<Integer> list ){
        int i = 0, j = list.size()-1;

        while(i<j){
            int temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

       
    }
    public static void main(String[] args) {
        
        // // wrapper class  -- many method aplicable only for wrappr class not primitive data type

        // Integer j = Integer.valueOf(4);
        // System.out.println(j);

        // ArrayList<Integer> l1 = new ArrayList<>();

        // l1.add(5);
        // l1.add(6);

        // // for access of elemnt of arraylist

        // for(int i = 0; i<l1.size() ; i++){
        //     System.out.println(l1.get(i));
        // }

        // // we  can access without for loop

        // System.out.println(l1);
        
        // // adding element at ith position

        // l1.add( 1, 100);
        // System.out.println(l1);

        // // modifying elemnt at index i

        // l1.set(1, 10);
        // System.out.println(l1);


        // // remove element at index i

        // l1.remove(1);
        // System.out.println(l1);


        // //removig elemement e

        // l1.remove(Integer.valueOf(5));
        // System.out.println(l1);

        // // check existant of element

        // boolean ans = l1.contains(Integer.valueOf(51));
        // System.out.println(ans);


        // // if wee don't specify class anything we can add in arraylist

        // ArrayList l2 = new ArrayList<>();

        // l2.add("p");
        // l2.add(1);
        // l2.add(true);

        // System.out.println(l2);



        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println("Original list" +  list);

        // inbuilt revese mrthod

       // Collections.reverse(list);

        // inbuilt sorting methosd

        // Collections.sort(list);
        // System.out.println("Ascending list" + list);


        // sortin in decresing order


       
        System.out.println("decresing order" + list);

       // Reverselist(list);
       // System.out.println("Reverse List"+ list);



       // String in increasing order


       ArrayList<String> s1 = new ArrayList<>();

       s1.add("Welcome");
       s1.add("Nazim");
       s1.add("Khan");

       
       System.out.println("Sorting String" + s1);

}
}
