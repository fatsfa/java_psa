package pack1;
 public class A{
    public void m1(){
        System.out.println("A-M1");
        //m2();
    }
    void m2(){
        System.out.println("A-M2");
       // m1();
    }
    public static void main(String[] args){
         A a = new A();
         a.m1();
          a.m2();
        
     
    }
    }