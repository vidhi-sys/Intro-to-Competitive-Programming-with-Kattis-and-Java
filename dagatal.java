import java.util.Scanner;
public class dagatal{
    public static void main(String[]args ){
      Scanner s = new Scanner(System.in);
      int m = s.nextInt();
      
          if(m==2){
              System.out.println(28);
          }
          else if(m/2==0){
             System.out.println(30); 
              
          }
          else{
              System.out.println(31);
          }
      }
    }
