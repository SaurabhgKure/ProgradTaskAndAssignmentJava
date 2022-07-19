import java.util.*;
class A {
    public A(int a){
        System.out.println("this is a base class constructor");
        System.out.println("It contains integer : "+a);
    }
    public void detailA()
    {
        System.out.println("This is a base class Method");
    }
}

class B extends A {
    public B(int a,int b){
        super(a);
        System.out.println("This is constructor of derived class of A ");
        System.out.println("It contains integer : "+b);
    }
    public void detailB()
    {
        System.out.println("This is a derived class method");
    }
}

class C extends B {
    public C(int a,int b,int c){
        super(a,b);
        System.out.println("This is constructor of derived class of B which is again derived from class A ");
        System.out.println("It contains integer : "+c);
    }
    public void detailC()
    {
        System.out.println("This is a derived class method of B which is derived from class A");
    }
}


public class Q38_MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter base class A integer : ");
        int a=sc.nextInt();
        System.out.println("Enter derived class B integer : ");
        int b=sc.nextInt();
        System.out.println("Enter derived class c  integer : ");
        int c=sc.nextInt();
        C obj=new C(c,b,a);
        obj.detailA();
        obj.detailB();
        obj.detailC();
    }
}
