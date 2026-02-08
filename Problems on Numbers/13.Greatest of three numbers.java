import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        
        if(a>=b && a>=c) {
            System.out.print(a);
        }
        else if(b>=a && b>=c) {
            System.out.print(b);
        }
        else {
            System.out.print(c);
        }
        
    //System.out.print( Math.max(a, Math.max(b,c) ) );
    
    sc.close();
    }
}
