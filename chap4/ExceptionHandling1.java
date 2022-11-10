package chap4;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        int zero = 0;
        try {
            int result = 1500/zero;
        } catch (ArithmeticException e) {
            System.out.println("หารด้วย 0 ไม่ได้");
        }
        
        String str = null;
        
        try {
            str.length();
        } catch (Exception e) {
            System.out.println("Null");
        }
        
    }
    
}
