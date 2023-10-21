import java.util.Scanner;

public class $3_castingAndTypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /*
       Automatic type conversion condition :
       1. type should be compatable i.e integer can be convertale in float but string can not convertable. 
       2. destination side should be bigger than source side  i.e 
       float num = input.nextInt() here float can store integer and float both value 
       */ 

    
        // *** narrow conversion or type casting :

        // int num = (int)(input.nextFloat());
        // System.out.println(num);



        // *** automatic type promotion in expression 

        // int a = 257;
        // byte b = (byte)(a); // 257 % 256 = 1;
        // System.out.println(b);

        // byte a= 40;
        // byte b= 50;
        // byte c= 20;
        // int d = (a*b)/c;
        // System.out.println(d);

        // byte a= 40;
        // byte b= 50;
        // byte c= 20;
        // byte d = (a*b)/c; // expression are evaluted in int so you cant store int into byte;
        // System.out.println(d);
  
        // java folow unicode value thats way it speaking language independent
        // System.out.println("مرحبًا");

        /*
        promotion rule in java
        1. all short byte and charector are promoted into int.
        2. if any operend is long/float/double than whole operation is promated to long/float/double.
        
         */

        //  byte b= 57;
        //  char c='A';
        //  short s = 10254;
        //  int i = 50000;
        //  float f = 5.67f;
        //  double d = 0.123456;

        //  double result = (f * b) + (i/c) -(d*s);
        //  System.out.println((f * b) + " "+ (i/c) + " "+ (d*s));
        //  System.out.println(result);

            // ### when i don't know how many times loop going to run use while loop and i know how many time it going to run use for loop but thish rule general
          
    }
}
