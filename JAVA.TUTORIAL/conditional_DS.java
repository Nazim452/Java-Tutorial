import java.util.Scanner;
public class conditional_DS {

    public static void main(String[] args) {


//  CONVERT INTO ABSOLUTE NUMBER


            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter No to convert for absolute number- ");

            // int n = sc.nextInt();

            // System.out.println("Absolute number is");

            // if(n<0){
            //     System.out.println(Math.abs(n));
            // }else{
            //     System.out.println(n);
            // }








            Scanner sc = new Scanner(System.in);
            System.out.println("Enter cOST PRICE- ");

            int CP = sc.nextInt();

            System.out.println("Enter the celling price");

            int SP = sc.nextInt();

            if(SP>CP){
                System.out.println("Your benefit is "+ (SP-CP));

            }else{
                System.out.println("Your lossed is  " +(CP-SP));

            }









        
    }

    
}
