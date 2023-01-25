import java.util.Scanner;

public class ControlFlowStatments {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("Java Control flow staments: ");
            System.out.println("1:If-else Statment");
            System.out.println("2:for loop");
            System.out.println("3:while loop");
            System.out.println("4.do-while loop");
            System.out.println("6.Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("if(condation){");
                    System.out.println("//statments to be executed if condation is true.");
                    System.out.println("}");
                    System.out.println("else{");
                    System.out.println("//statments to be executed if condation is false.");
                    break;
                }
                case 2:{
                    System.out.println("for(intilization ; condation ; increment/decrement){\n\n\n//Statments to be executed until condation become false.\n\n\n}");
                    break;
                }
                case 3:{
                    System.out.println("while(condation){\n\n\n//Statments to be executed until condation become false.\n\n\n}");
                    break;
                }
                case 4:{
                    System.out.println("do{\n\n\n//Statments to be executed\n\n\n}while(condation)");
                    break;
                }
                case 5:{
                    System.out.println("Exiting program.");
                    break;
                }
                default:{
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }while(choice !=5);
        
    }
}
