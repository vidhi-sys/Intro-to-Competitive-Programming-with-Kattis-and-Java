import java.util.Scanner;
public class aaah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String john= scanner.nextLine();
        String doc=scanner.nextLine();
        int l1= john.length();
        int l2= doc.length();
        if(l1>=l2){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }

    }
}
