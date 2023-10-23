import java .util.Random;
import java.util.Scanner;;
public class proj {
    public static void main(String[] args) {


        // 0 - rock
        // 1 - paper
        // 2 - scissor

        //rock vs paper - 1 win
        // paper vs scissor  - 2 win
        // rock  vs sciss- 0 win

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0  for rock , 1 - paer  , 2- scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput  = random.nextInt(3);

        if(userinput == computerinput){
            System.out.println("Draw");
        }
        else if(userinput == 0 && computerinput==2 || userinput ==1 && computerinput==0 || userinput == 2 && computerinput==1){
            System.out.println("YOU WIN");
        } 
        else{
            System.out.println("Computer win");
        }
        System.out.println("Computer choice " + computerinput);
        
    }
    
}
