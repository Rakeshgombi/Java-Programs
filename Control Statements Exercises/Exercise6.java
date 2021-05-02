/*

Write a program in Java to display the first 10 natural numbers. 
Expected Output :
The first 10 natural numbers are:
1
2
3
4
5
6
7
8
9
10

*/

public class Program
{
    public static void main(String[] args) {
		int n = 10;
        System.out.println("The First " + n + " natural Numbers are:");
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
	}
}
