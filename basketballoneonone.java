import java.util.Scanner;
public class basketballoneonone {    
    public static void main(String[] args) {     
            Scanner sc = new Scanner(System.in);
            int counta=0;
            int countb=0;
            String s= sc.nextLine();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A'){
                   counta= counta+ s.charAt(i+1);

                }
                if(s.charAt(i)=='B'){
                    countb= countb+ s.charAt(i+1);
 
                 }
            }
            if((counta-countb>=2)||(countb-counta>=2)){
                if((counta>=11)&&(counta>countb)){
                    System.out.println("A");
                }
                if((countb>=11)&&(countb>counta)){
                    System.out.println("B");
                }

            }
    }
    }

