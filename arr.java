
package oops;
import java.io.*;
import java.util.Scanner;
public class arr {

    public static void main(String[] args) throws IOException{
        Scanner obj=new Scanner(System.in);
        System.out.println("Implementation of Stack using Array");
        System.out.print("Enter the size of stack:");
        int n=obj.nextInt();
        Stack_array stk;
        stk = new Stack_array(n);
        int ch;
        do
        {
            System.out.println("\n\n1.Push \n2.Pop \n3.Display \n4.Exit");
            System.out.print("Enter your choice:");
            ch=obj.nextInt();
            switch(ch)
            {
            case 1:
                System.out.println("Enter the element");
                int ele =obj.nextInt();
                stk.push(ele);
                break;
            case 2:
                stk.pop();
                break;
            case 3:
                stk.display();
                break;
            case 4:
                System.out.println("Successfully Done!!!!");
                System.exit(0);
            }
        }
        while(ch<4);
    
    }
    
}
interface Mystack
{
    public void pop();
    public void push(int a);
    public void display();
}
class Stack_array implements Mystack
{
    int n;

    public Stack_array(int n ) {
        this.n = n;
    }

    int get_size()
    {
        return n;
    }
    int top=-1; 
    int stack[]=new int[5];
    @Override
    public void push(int a)
    {
        if(top==(n-1))
        {
            System.out.println(" Stack Overflow");
        }
        else
        {
            
            stack[++top]=a;
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
            int i;
            System.out.print("Elements are: ");
            for( i=0; i<top; i++)
               System.out.print(stack[i]+" <--");  
            System.out.print(stack[i]); 
        }
    }
}
