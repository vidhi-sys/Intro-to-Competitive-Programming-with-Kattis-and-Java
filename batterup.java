import java.util.Scanner;
public class batterup{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int []arr= new int[n];
        double bases=0;
        double sum=0;
        double slugg_percentage;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if(arr[i]!=-1){
                bases++;
                sum=sum+arr[i];
            }
        }
    slugg_percentage= sum/bases;
    System.out.println(slugg_percentage);
    }
}