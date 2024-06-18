import java.util.Scanner;
public class  fabin{
public static void main(String[]args){
int fabi;
Scanner sc = new Scanner(System.in);
System.out.print("enter the length");
fabi =sc.nextInt();
int num[]= new int[fabi];
num[0]=0;
num[1]=1;
for(int i=2; i<fabi;i++){
num[i]=num[i-1]+num[i-2];
}
System.out.print("fabinocci");
for(i=0;i<fabi;i++)
System.out.print(num[i]+" ");
}}


