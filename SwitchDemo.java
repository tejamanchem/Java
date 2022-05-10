import java.util.Scanner;

public class SwitchDemo{
    public static void main(String[] args) {
        SwitchDemo sd = new SwitchDemo();

         Scanner fi = new Scanner(System.in);
        System.out.println("enter 1 for integer category 2 for string category");
        int inputpassed = fi.nextInt();


   
    if(inputpassed==1){
        ForInteger();

    }
    else if (inputpassed==2){
        ForString();
    }
        
    
    }

    private static void ForInteger(){

        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int day = in.nextInt();

        
        switch(day){
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("this is tuesday");
                break;
            
            case 2:
                System.out.println("this is wednesday");
                break;
            case 3:
                System.out.println("this is thursday");
                break;
            case 4:
                System.out.println("this is friday");
                break;
            case 5:
                System.out.println("this is saturday");
                break;

            case 6:
                System.out.println("this is saturday");
                break;
            default:
                System.out.println("option is wrong");

        }
       

    }
    private static void ForString(){
        Scanner sc= new Scanner(System.in);  //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String str= sc.next(); 

        switch(str.toLowerCase()){
            case "sunday":
                System.out.println("");
                break;
            case "monday":
                System.out.println("this is tuesday");
                break;
            
            case "tuesday" :
                System.out.println("this is wednesday");
                break;
            case "wednesday":
                System.out.println("this is thursday");
                break;
            case "thursday":
                System.out.println("this is friday");
                break;
            case "friday":
                System.out.println("this is saturday");
                break;

            case "saturday":
                System.out.println("this is saturday");
                break;
            default:
                System.out.println("option is wrong");

        }  
    }

    
}










