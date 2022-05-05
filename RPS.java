import java.util.Random;
import java.util.Scanner;
class RPS{
    public static void main(String args []){
        Scanner s= new Scanner(System.in);
        Random r= new Random();
        int system= r.nextInt(3) + 1 ;
        System.out.println("Welcome to Play Rock Scissors Paper Game");
        System.out.println("System is made his choice\nNow you Choose your Choice:\n(1) Rock\n(2) Scissors\n(3) Paper\n(4) Exit");
        int count= s.nextInt();
        while(count != 4){
            switch(count){
                case 1: 
                if(count==1 && system==1){
                    System.out.println("Tie");
                }
                else if(count==1 && system==2){
                    System.out.println("You win");
                }
                else if(count==1 && system==3){
                    System.out.println("System win");
                }
                break;
                case 2:
                if(count==2 && system==2){
                    System.out.println("Tie");
                }
                else if(count==2 && system==3){
                    System.out.println("You win");
                }
                else if(count==2 && system==1){
                    System.out.println("System win");
                }
                break;
                case 3:
                if(count==3 && system==3){
                    System.out.println("Tie");
                }
                else if(count==3 && system==1){
                    System.out.println("You win");
                }
                else if(count==3 && system==2){
                    System.out.println("System win");
                }
                break;
                default:
                {
                    System.out.println("Wrong choice! ");
                }
            }
            system= r.nextInt(3) + 1 ;
            System.out.println("Want to play again. Have your choice:\n(1) Rock\n(2) Scissors\n(3) Paper\n(4) Exit");
            count= s.nextInt();
        }
        System.out.println("Thanks for Playing.");
    }
}