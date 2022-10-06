import java.util.Scanner;

/*public class function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
        public static void main(String args []){
        Scanner sc = new Scanner(System.in);
       String name = sc.next();

        printMyName(name);// call the functions./
        }
}*/

// question:- make  fuunction to add 2 numbers nd return the sum
/*public class function{
    public static int calculateSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println(sum);


    }
}*/

// question 2:- make a function to multiply 2 numbers and return the product.

/*public class function{
    public static int calculateMultiply(int a,int b){
        int multiply = a * b;
        return multiply;
        //we can direct return value like return a*b
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = calculateMultiply(a,b);
        System.out.println(multiply);

    }
}*/

//question 3:-find the factorial of a number
public class function {
    public static int printFactorial(int n) {
        // loop
        if(n<0){
            System.out.println("invalid number");
            return   0;
        }
        int factorial = 1;
        for(int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return 0;

    }


        public static void main (String args []){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printFactorial(n);

        }
    }

