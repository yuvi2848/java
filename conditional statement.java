import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        // First we take input from the user
       /* Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");

        }else{
            System.out.println("Not Adult");
        }*/

        //Checking odd or even


      /*  Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }*/
       /* Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 3 == 0){
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }*/

        // question , taking input from user a,b
        // 1- if a=b then print equal
        //2- if a>b then print greater
        //3- if a<b then print lesse

       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");
        } else{
           if(a > b){
               System.out.println("a is greater");

           }else{
               System.out.println("a is lesser");
           }*/

        //Another way to check problme through else if



      /*  Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");
        } else if(a > b){
                System.out.println("a is greater");

        }
        else{
                System.out.println("a is lesser");
            }
        }*/


        /*Scanner sc = new Scanner(System.in);
        sc.nextInt();
        if(3 % 2 == 0){
            System.out.println("bazinga");
        }else{
            System.out.println("Not Bazinga");*/

        // Question print the greeting
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
       // if(button == 1){
         //   System.out.println("Hello");
      //  }else{
        //    if(button == 2){
          //      System.out.println("Namste");
            //}else{
              //  System.out.println("banjour");
            //}

        // switch variable
        switch(button){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Namste");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            default :
                System.out.println("invalid");

        }
        }


    }
