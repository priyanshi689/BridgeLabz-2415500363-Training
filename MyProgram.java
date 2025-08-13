import java.util.*;
class print
{
    public static void main(String[]args)
    {
    System.out.println("Welcome to BridgeLabz");
}
}





import java.util.*;
class abc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n1,n2,sum;
        double avg;
        System.out.println("Enter the First Number");
        n1=sc.nextInt();
        System.out.println("Enter the second number");
        n2=sc.nextInt();
        sum=n1+n2;
        avg=sum/2;
        System.out.println("sum of two numbers is : "+sum);
        System.out.println("Average of two numbers is : "+avg);
    }
}  



import java.util.*;
class temprature{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double c,f;
System.out.println("Enter the temprature in celsius");
c=sc.nextDouble();
f=(c*9/5)+32;
System.out.println("Temparature in farrenheit is: "+f);
}
}



import java.util.*;
class area{
public static void main(String[]args){
Scanner sc =  new Scanner(System.in);
double area ,r, pi=3.14;
System.out.println("Enter the radius");
r=sc.nextDouble();
area=pi*r*r;
System.out.println("Area of circle is : "+area);
}
}



import java.util.*;
class volume{
public static void main(String[]args){
Scanner sc =  new Scanner(System.in);
double vol, h, r, pi=3.14;
System.out.println("Enter the Radius");
r=sc.nextDouble();
System.out.println("Enter the height of the cylinder");
h=sc.nextDouble();
vol=pi*r*r*h;
System.out.println("Volume of the cylinder is : "+vol);
}
}



import java.util.*;
class simple_interest{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
double SI, p,r,t;
System.out.println("Enter the Principal amount");
p=sc.nextDouble();
System.out.println("Enter the Rate");
r=sc.nextDouble();
System.out.println("Enter the Time");
t=sc.nextDouble();
SI=(p*r*t)/100;
System.out.println("Simple Interest is : "+SI);
}
}



import java.util.*;
class perimeter{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
double l,w,p;
System.out.println("Enter the length of the rectangle");
l=Sc.nextDouble();
System.out.println("Enter the width of the rectangle");
w=sc.nextDouble();
p=2*l*w;
System.out.println("Perimeter of the rectangle is : "+p);
}
}



import java.util.*;
class abc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n1,n2,n3,sum;
        double avg;
        System.out.println("Enter the First Number");
        n1=sc.nextInt();
        System.out.println("Enter the second number");
        n2=sc.nextInt();
        System.out.println("Enter the third number");
        n3=sc.nextInt();
        sum=n1+n2+n3;
        avg=sum/3;
        System.out.println("sum of three numbers is : "+sum);
        System.out.println("Average of three numbers is : "+avg);
    }
}  





import java.util.*;
class miles{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
double d, m , x=0.621371;
System.out.println("Enter the distance in kilometers ");
d=sc.nextDouble();
m = d*x;
System.out.println("Distance in miles is: "+m);
}
}
