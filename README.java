# java21082018
import java.io.*;
import java.util.Scanner;

public class Interval{
  public void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First value:");
    int value1=sc.nextInt();
    System.out.println("Enter Second Value:");
    int value2=sc.nextInt();
    System.out.println("--------------");
    for(int i=value1;i<=value2;i++)
    {
       if(i%2!=0)
       {
        System.out.println("->"+i);
        }
        else
        {
        System.out.println(" ");
        }
     }
  }
} 
  
        
