/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author 21cse097
 */
public class Javaapplication1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner obj=new Scanner(System.in);
        System.out.println("Implementation of Stack using Array");
        Stack_array stk=new Stack_array();
        int ch=0;
        do
        {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit 5.Use Linked List");
            System.out.println("Enter your choice:");
            ch=obj.nextInt();
            switch(ch)
            {
            case 1:
                stk.push();
                break;
            case 2:
                stk.pop();
                break;
            case 3:
                stk.display();
                break;
            case 4:
                System.exit(0);
            }
        }
        while(ch<5);
    }
} // TODO code application logic here
interface Mystack
{
    public void pop();
    public void push();
    public void display();
}
class Stack_array implements Mystack
{
    final static int n=5;
    int stack[]=new int[n];
    int top=-1;
    @Override
    public void push()
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            if(top==(n-1))
            {
                System.out.println(" Stack Overflow");
            }
            else
            {
                System.out.println("Enter the element");
                int ele=Integer.parseInt(br.readLine());
                stack[++top]=ele;
            }
        }
        catch(IOException e)
        {
            System.out.println("e");
        }
    }
    @Override
    public void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            int popper=stack[top];
            top--;
            System.out.println("Popped element:" +popper);
        }
    }
 
    @Override
    public void display()
    {
        if(top<0)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            String str=" ";
            for(int i=0; i<=top; i++)
                str=str+"  "+stack[i]+" <--";
            System.out.println("Elements are:"+str);
        }
    }
}

run:
Implementation of Stack using Array
1.Push 2.Pop 3.Display 4.Exit 5.Use Linked List
Enter your choice:
1
Enter the element
43543
1.Push 2.Pop 3.Display 4.Exit 5.Use Linked List
Enter your choice:
3
Elements are:   43543 <--
1.Push 2.Pop 3.Display 4.Exit 5.Use Linked List
Enter your choice:
1
Enter the element
4353
1.Push 2.Pop 3.Display 4.Exit 5.Use Linked List
Enter your choice:
3
Elements are:   43543 <--  4353 <--
1.Push 2.Pop 3.Display 4.Exit 5.Use Linked List
Enter your choice:
0
1.Push 2.Pop 3.Display 4.Exit 5.Use Linked List
Enter your choice:
67
BUILD SUCCESSFUL (total time: 38 seconds)
