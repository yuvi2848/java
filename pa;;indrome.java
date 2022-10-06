public class palindrone {

    public static void main(String args[]) {
        int num = 676, rev = 0, r;
        int temp = num;
        while (num != 0) {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("number is pallindrome");
        } else {
            System.out.println("number is not a pallindrome");
        }
    }
}
