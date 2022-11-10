package chap4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int m;
         for (int i = 2; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i+ "\t" + i*j + "\t" );
            }
            System.out.println("");
        }
    }
    
}//end class
