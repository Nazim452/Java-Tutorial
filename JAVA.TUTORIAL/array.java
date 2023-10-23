import  java.util.Scanner;



public class array {
    public static void main(String[] args) {
        // int[] marks = new int [5];
        
        // marks[0] = 50;
        // marks[1] = 20;
        // System.out.println(marks[1]);  

        // // declaration , memory allocation & initialization , all together


        // int[] mark = {20, 30 , 40 ,70, 90};

        // System.out.println(mark[4]);

         // String [] student = { "Nazim", "Rohan" , "Abdul"};

        // int[] marks = {20, 30 , 40 ,70, 90};
        //System.out.println(marks.length);

        // Displaying the array - using for loop


        // for(int i = 0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // }


        // Reverse displaying

        // for( int i = marks.length - 1; i>=0; i-- ){
        //     System.out.println(marks[i]);
        // }



        // Dispalying using for - each loop - Easy way

        // for(int element: marks){
        //     System.out.println(element);
        // }



        // MULTIDIMENTIONAL ARRAY


        // int [][] flats =new int  [2][3];

        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;
        // flats[1][0] = 104;
        // flats[1][1] = 105;
        // flats[1][2] = 106;


        // for(int i= 0; i<flats.length;i++ ){
        //     for(int j= 0;j<flats[i].length; j++){
        //         System.out.print(flats[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }
        



        // CREATE ARRAY & THEEIR SUM



        // float[] marks = { 12.5f , 45.6f , 90.6f , 45.8f , 90.8f};

        // float sum = 0;
        // for( float element:marks){
        //     sum = sum +element;
        // }
        // System.out.println(sum);

        

        // CHECK NO IS PRESENT IN ARRAY OR NOT





        // float[] marks = { 12.5f , 45.6f , 90.6f , 45.8f , 90.8f};


        // float num = 90.5f;
        // boolean isInArray = false;
        // for( float element:marks){
        //     if(num == element){
        //         isInArray =true;
        //         break;
        //     }

        // }
        // if(isInArray){
        //     System.out.println("Number is present");
        // }
        // else{
        //     System.out.println("no is not presnt");
        // }
            



        // CALCULATE AVERAGE MARKS IN ARRAY




        
        // float[] marks = { 12.5f , 45.6f , 90.6f , 45.8f , 90.8f};

        // float sum = 0;
        // for( float element:marks){
        //     sum = (sum +element);
        // }
        // System.out.println(sum/marks.length);

        


        // ADD OF 2X3 MATRICES




        // int [][] m1 = {{2, 4, 6}, 
        //                {3, 4, 7}};


        // int [][] m2 = {{2, 4, 6}, 
        //                {56, 4, 7}};

        // int [][] result= {{0, 0, 0}, 
        //                {0, 0, 0}}; 

        // for(int i = 0; i<m1.length; i++){   // for row wise
        //     for(int j=0;j<m1[i].length;j++ ){  // for column wise
        //         // System.out.print(result[i][j] +" ");
        //         result[i][j] = m1[i][j] + m2[i][j];
        //         System.out.print(result[i][j] +" ");
        //     } 
        //     System.out.println(" ");  // print new line
        //        }



            

            // REVERSE THE ARRAY



        

            // int [] arr = { 2, 4, 6, 8, 10};
            // int l = arr.length;
            // int n = Math.floorDiv(l, 2);  // length ke aadha tak hi chalana h
            // int temp;

            // for(int i = 0; i<n; i++){
            //     temp = arr[i];
            //     arr[i] =arr[l-i-1];     // rule to reach at that target reverse arr
            //     arr[l-i-1] = temp; 
                
            // }
            // for(int element:arr){
            //     System.out.println(element);
            // }




            // FIND MAXIMUM ELEMENT IN ARRAY



            // int  [] arr = { 2,54,67, 66, -467 , 56};
            // int max = Integer.MIN_VALUE;
            // for(int e:arr){
            //     if (e>max){
            //         max = e;
            //     }
            // }System.out.println(max);


            // System.out.println(Integer.MIN_VALUE);  // giive min value in java
            // System.out.println(Integer.MAX_VALUE);




            // CHECK ARRAY IS SORTED OR NOT



            // int []arr ={1,2,3,4,5,6,7};
            // boolean isSorted = true;

            // for(int i = 0; i<arr.length-1; i++){
            //     if(arr[i]> arr[i+1]){
            //         isSorted = false;
            //     }
            // }
            // if(isSorted){
            //     System.out.println("YOUR array is  sorted");
            // }
            // else{
            //     System.out.println("your array is not sorted");
            // }





        



        
    




        

            
            
          


        




        
        












































    }
    
}
