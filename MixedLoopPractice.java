/*
 * APCS-A - Mixed Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then 
 * you should complete and test the methods that are incomplete or missing. 
 *
 *  1) oneToThirtyF    - uses a for loop to print the set {1, 2, 3, ... , 30}.
 *
 *  2) oneToThirtyW    - uses a while loop to print the set {1, 2, 3, ... , 30}.
 *
 *  3) twentyToZeroF   - uses a for loop to print the set {20, 18, 16, ... , 0}.
 *
 *  4) twentyToZeroW   - uses a while loop to print the set {20, 18, 16, ... , 0}.
 *
 *  5) sumN            - uses a while loop to find the sum of the first n integers. 
 *
 *  6) countMtoN       - uses a while loop to print the set {m, m+1, m+2, ... , n}.
 *
 *  7) iLoveJava       - uses a while loop to print the sentence "I love java." n
 *                       times.
 *
 *  8) divBy2and9      - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 2 and 9 are printed.
 *                       (you'll need to use an if statement.)
 *
 *  9) divBy3and8      - uses a while loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 3 and 8 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 10) divBy5or7Sum    - uses a while loop to find the sum of all values in the
 *                   set {1, 2, 3, ... , 10000} that are divisible by 5 or 7.
 *
 * 11) bizzBuzz        - uses a while loop to count from 1 to n by ones. However,
 *                       if a number is divisible by 3, the word "bizz" should be 
 *               printed, and if the number is divisible by 5, "buzz" should
 *           be printed. Sample output:
 *
 *           1, 2, Bizz, 4, Buzz, Bizz, 7, 8, Bizz, Buzz, 11, Bizz, 13, 14, 
 *                       Bizz Buzz, 16, 17, Bizz, 19, Buzz, Bizz, 22, 23, Bizz, ...
 *
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
 public class MixedLoopPractice
 {
    public static void oneToThirtyF()
    {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    
    public static void oneToThirtyW()
    {
        int i = 1;
        
        do {
            System.out.print(i + " ");
            i++;
         } while (i <= 30);
        System.out.print("\n");
    }
        
    // keep making methods here
    
    public static void twentyToZeroF() {
        for (int i = 20; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    
    public static void twentyToZeroW() {
        int i = 20;
        do {
            System.out.print(i + " ");
            i -= 2;
        } while (i >= 0);
        System.out.print("\n");
    }
    
    public static int sumN(int n) {
        int sum = 0;
        for (n = n; n > 0; n--) {
            sum += n;
        }
        System.out.println(sum);
        return sum;
    }
    
    public static void countMtoN(int m, int n) {
        for (m = m; m <= n; m++) {
            System.out.print(m + " ");
        }
        System.out.print("\n");
    }
    
    public static void iLoveJava(int n) {
        for (int i=0; i < n; i++) {
            System.out.println("I love Java!");
        }
    }
    
    public static void divBy2and9() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
    
    public static void divBy3and8() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 8 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }    
    
    public static int divBy5or7Sum() {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }
    
    public static void bizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            String output = Integer.toString(i);
            boolean div3 = i % 3 == 0;
            boolean div5 = i % 5 == 0;
            if (div3 && div5) {
                output = "Bizz Buzz";
            } else if (div3) {
                output = "Bizz";
            } else if (div5) {
                output = "Buzz";
            }
            System.out.print(output + " ");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args)
    {
        oneToThirtyF();
        oneToThirtyW();
        
        twentyToZeroF();
        twentyToZeroW();
        
        sumN(9);
        
        countMtoN(6, 13);
        
        iLoveJava(3);
        
        divBy2and9();
        divBy3and8();
        
        divBy5or7Sum();
        
        bizzBuzz(25);
        // test your methods here
    }
 }
 