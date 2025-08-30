import java.util.Random;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        Random r=new Random();
        char ch='y';
        int userCount=0;
        int compCount=0;
        while(ch=='y' || ch=='y'){
            
            //Take user choice
            System.out.print("p: for paper\ns: for scissor\nr: for rock\nEnter your Choice: ");
            char user=sc.next().charAt(0);
            
            //computer choice
            int randm=r.nextInt(3);
            char comp='p';
            if(comp==0) comp='p';
            else if(comp==1) comp='s';
            else comp='r';
            System.out.print("Computer Choice: "+comp+"\n");
            
            if(user=='p'){ 
                if(comp=='p') System.out.print("Tie");
                else if(comp=='s'){
                    System.out.print("Computer won ");
                    compCount++;
                }
                else{
                    System.out.print("Congo!!, You Won");
                    userCount++;
                }
            }
            else if(user=='s'){ 
                if(comp=='s') System.out.print("Tie");
                else if(comp=='r'){
                    System.out.print("Computer won ");
                    compCount++;
                }
                else{
                    System.out.print("Congo!!, You Won");
                    userCount++;
                }
            }
            else if(user=='r'){
                if(comp=='r') System.out.print("Tie");
                else if(comp=='p'){
                    System.out.print("Computer won ");
                    compCount++;
                }
                else{
                    System.out.print("Congo!!, You Won");
                    userCount++;
                }
            }
            else{
                System.out.print("Wrong input!!, Please enter the valid input");
            }
            System.out.print("\nPress y/Y for continue playing ");
            ch=sc.next().charAt(0);
        }
        if(userCount>compCount){
            System.out.print("\nCongo!!, You won the Game");
        }
        else if(userCount<compCount){
            System.out.print("\nOops!!, You loose the Game");
        }
        else{
            System.out.print("\nGame tie!!");
        }
        System.out.print("\nThanks for playing!!");
        
    }
}