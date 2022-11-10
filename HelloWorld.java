public class HelloWorld {
   static void add(int x, int y){
        System.out.println("Add Number "+(x+y));
    }
   static int add(int x, int y, int z){
        return x+y+z;
    }
   static int minus(int x, int y,int z){
        return x-y-z;
    }
   static void multiply(int x, int y,int z){
       System.out.println("Multiply Number "+(x*y*z));
   }
   static void divide(int x, int y){
       System.out.println("Divide Number "+(x/y));
   }
   static void minus(int x, int y){
       System.out.println("Minus Number "+(x-y));
   }
    public static void main(String args[]) {
      System.out.println("Hello World");
      System.out.print("Suban ");
      System.out.println("Noksang");
      add(12,50);
      multiply(5,2,4);
      divide(40,20);
      minus(500, 150);
      int result = add(300,200,100);
        System.out.println("result = "+result);
      int answer = minus(400,150,50);
        System.out.println("answer = "+answer);
    } 
    
    
    
    
}//end class