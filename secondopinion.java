import java.util.Scanner;

public class secondopinion {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int hr=n/3600;
       
        int min= ((n%3600)/60);
        int sec= ((n%3600)-min*60) ;
    
        System.out.println(hr + " : "+ min + " : " + sec);
        
    }
}
