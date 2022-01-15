import java.util.Scanner;
class Dup
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=0;
int[] arr=new int[n];
for(int j=0;j<n;j++)
{
arr[j]=sc.nextInt();
}
for(int j=0;j<n;j++)
{
int c=0;
for(int i=0;i<n;i++)
{
if(arr[i]==arr[j])
{
c++;
}
}
if(c>1)
{
System.out.print(arr[j]);
}
}
}
}