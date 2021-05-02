public class Program {
    /*
    1. Write a Java method to print the multiplication table of a number n.
    
    static void multiplication(int n){
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }
    */

    /*
    2. Write a program using functions to print the following pattern:
    *
    
    **
    
    ***
    
    ****
        static void pattern1(int n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < i + 1; j++){
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    */

    /*
    3. Write a recursive function to calculate the sum of first n natural numbers.
        static int sumRec(int n) {
            if (n == 1){
                return 1;
            }
            else{
                return n + sumRec(n-1);
            }
        }
    */

    /*
    4. Write a function to print the following pattern:
        ****
    
        ***
    
        **
    
        *
    
    static void pattern2(int n){
            for(int i = n; i > 0; i--){
                for(int j = i; j > 0; j--){
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    */
    /*
    5. Write a function to print the nth term of the Fibonacci series using recursion.

    static int fibonacci(int n){
        if(n == 1 || n ==2){
            return n - 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n -2);
        }
    }
    */

    /*
    6. Write a function to find the average of a set of numbers passed as arguments
    static float average(int ...arr){
        int sum = 0;
        for(int e:arr){
            sum += e;
        }
    
        float average = sum / arr.length;
        return average;
    }
    */

    /*
    7. Repeat problem 2 using Recursion.
        static void pattern1_rec(int n) {
            if (n > 0) {
                pattern1_rec(n - 1);
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    */


    /*
    8. Repeat problem 4 using Recursion.
        static void pattern2_rec(int n) {
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println();
                pattern2_rec(n-1);
            }
        }
    */

    /*
    9. Write a function to convert Celsius temperature into Fahrenheit.
    */
    static float celcius_To_Fahreinheit(int n){
        return (n * ((float)9/5)) + 32;
    }

    /* 
    10. Repeat problem 3 using an iterative approach.
    static int sum(int n){
        int res = 0;
        for(int i = 1; i<=n; i++){
            res += i;
        }
        return res;
    }
    */


    public static void main(String[] args) {
    // question 1
    // multiplication(6);

    // question 2
    // pattern1(4);

    // question 3
    // int  c = sumRec(5);
    // System.out.println(c);

    // question 4
    // pattern2(4);

    // question 5
    // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    // System.out.println(fibonacci(19));

    // question 6
    // int [] arr = {1, 2, 3, 4, 5};
    // System.out.println(average(arr));

    // question 7
    // pattern1_rec(4);

    // question 8
    // pattern2_rec(4);

    // question 9
    int celsius = 3;
    System.out.println(celcius_To_Fahreinheit(celsius) + "°F");

    // question 10
    // System.out.println(sum(2));
    }
}
