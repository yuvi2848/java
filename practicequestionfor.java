import java.util.Scanner;

public class question {


    // print the sum of first n natural numbers
    // given N = 4
    // Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    //int sum = 0;
    //for(int i = 0; i<=n; i++){
    //  sum = sum + i;
    // }
    // System.out.println(sum);
    // }


    //Enter 3 numbers from the user & make a function to print their average.
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avarage = (a+b+c);
        System.out.println(avarage);*/


    //Write a function to print the sum of all odd numbers from 1 to n.
/*public static void printSum(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
        if(i % 2 !=0){
            sum = sum + 1;
        }
    }
    System.out.println(sum);

        }
        public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
            printSum(n);
        }
    }*/
//Write a function which takes in 2 numbers and returns the greater of those
//two
    /*public static int getGreater(int a,int b){
        if(a > b){
            return a;

            }else{
            return b;
        }
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getGreater(a,b));


    }*/

    //Write a function that takes in the radius as input and returns the
    //circumference of a circle.
    /*public static Double printCircumference(Double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println(printCircumference(r));

    }*/

    //Write a function that takes in age as input and returns if that person is eligible
    //to vote or not. A person of age > 18 is eligible to vote

    /*public static boolean isElligble(int age) {
        if (age > 18) {
            return true;
        }
        return false;

    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isElligble(age));

    }*/

    //Write an infinite loop using do while condition
  /*  public static void main(String args []){
        do{

        }while(true);

        }*/

    //Write a program to enter the numbers till the user wants and at the end it
    //should display the count of positive, negative and zeros entered.

    public static void main(String args []){
        int positive=0, negative=0, zeros=0;
        System.out.println("press 1 to start & 0 to stop" );
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1) {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number > 0) {
                positive++;
            } else if(number < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);

    }
    }
