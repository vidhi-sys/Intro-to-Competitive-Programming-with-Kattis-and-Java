import java.util.Scanner;
public class autori{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         String s=sc.nextLine();
         for(int i=0;i<s.length();i++){
             if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                System.out.print(s.charAt(i));}
    }
}}