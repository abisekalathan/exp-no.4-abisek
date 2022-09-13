
package tax;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        String z,y;
        int x;
        double w;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Name:");
        z=obj.next();
        System.out.print("Enter Gender(Male or Female):");
        y=obj.next();
        System.out.print("Enter Aadhar Number:");
        x=obj.nextInt();
        System.out.print("Enter Income:");
        w=obj.nextDouble();
       employee o;
        o = new employee(z,y,x);
        
        System.out.println("Tax:"+o.caltax(w));   
    }
}
abstract class person
{
    String name,gender;
    int adhar_no;
    double taxs=0;
    abstract String getinfo();
    double caltax(double a)
    {
        System.out.println(a);
        double income=a;
        if("Male".equals(gender))
        {
            System.out.println(a);
            if(190000>=income)
            {
                System.out.println(a);
                taxs=0;
            }
            else if (200000>=income)
            {
                System.out.println(a);
               taxs=income*.10;
            }
            else if (500000>=income)
            {
                taxs=income*.20;
            }
            else
            {
                 taxs=income*.25;
            }
        }
        else
        {
           if(190000>=income)
            {
                 taxs=0;
            }
            else if (200000>=income)
            {
                 taxs=0;
            }
            else if (500000>=income)
            {
                 taxs=income*.1;
            }
            else
            {
                 taxs=income*.2;
            } 
        }
        System.out.println(taxs);
        return taxs;
    }
}
class employee extends person
{
   employee(String a,String b,int c){
       name=a;
       gender=b;
       adhar_no=c;
   }
   
    String getinfo()
    {
        return name+gender+adhar_no;
        
    }
}