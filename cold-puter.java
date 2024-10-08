import java.util.*;
public class cold{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n= scanner.nextInt();
scanner.next();
int flag=0;
for(int i=0;i<=n;i++){
    int t=scanner.nextInt();
    if(t<0){
    flag=flag+1;
    System.out.println(flag);
}}
}}
