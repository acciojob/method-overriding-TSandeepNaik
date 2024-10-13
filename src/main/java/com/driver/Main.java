package com.driver;
class A{
    public  void meth(){
        System.out.println("Invoking method from class A");
    }
}
class B extends A{
    @java.lang.Override //
    public void meth() {
        System.out.println("Method is overridden in Extendend class B");
    }
}
public class Main {
    public static void main(String[] args) {
     B obj = new B();
     obj.meth();
    }
  
}
