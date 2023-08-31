package DSA;
public class Method1 {
    public static void main(String[] args) {
        System.out.print("Function and Method questions in java");
    }
    
}
  // ------------------converting binary number to decimal
        // public static void binnum(int n){
        // int pow = 0;
        // int dec = 0;
        // int num = n;
        // while(n > 0){
        // int last = n % 10;
        // dec = dec + (last + (int)Math.pow(2, pow));
        // n = n / 10;
        // }
        // System.out.println("The binary number of "+ num +" to decimal is "+ dec);
        // }

        // ---------------- converting decimal number to binary
        // public static void decnum(int n){
        // int pow = 0;
        // int bin = 0;
        // int num = n;
        // while(n > 0){
        // int rem = n % 2;
        // bin = bin + (rem * (int)Math.pow(10, pow));
        // pow++;
        // n = n / 2;
        // }
        // System.out.println("The decime number of "+ num +" of binary is "+bin);
        // }

        // ==============FACTORIAL COEFFICIENT
        // public static int factCoff(int n, int r) {
        // int fact_n = factorial(n);
        // int fact_r = factorial(r);
        // int fact_nmr = factorial(n-r);
        // int coeff = fact_n/ (fact_r * fact_nmr);

        // return coeff;

        // }
// ----------------- Factorial 3! == 6
        // public static int factorial(int n) {
        // int sum = 1;
        // for (int i = 1; i <= n; i++) {
        // sum *= i;
        // }
        // return sum;
        // // System.out.println("The factorial of "+ n + " is " + sum);

        // }

        // -----------Any Number Table 
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++ ){
        // System.out.println(n + " x " + i + " = " + n*i);
        // }

        // ------- check if number is even or odd
        // if (n % 2 == 0){
        // System.out.println("It is an even number: " + n );
        // }else{
        // System.out.println("It is an Odd number and prime number: " + n );
        // }
        // --------------------
        // --------- If the number is prime or not
        // public static boolean isPrime(int n){
        // boolean prime = true;
        // // case coner
        // if(n == 2){
        // return true;
        // }
        // checking if its is a prime number or not
        // for (int i = 2; i <=Math.sqrt(n); i++){
        // if (n % i == 0){
        // return false;
        // }
        // }
        // return true;


        
// ============is it a leap Year or not?
// int num = sc.nextInt();
// if(num%4 == 0 && (num%100 !=0 || num%400 == 0)){
// System.out.print("It is a leap Year");
// }else{
// System.out.print("Not a leap year");
// }

// using switch case to tell us days
// switch(num){
// case 1:
// System.out.print("Today is Monday");
// break;
// case 2:
// System.out.print("Today is Tuseday");
// break;
// case 3:
// System.out.print("Today is Wednesday");
// break;
// case 4:
// System.out.print("Today is Thrusday");
// break;
// case 5:
// System.out.print("Today is Friday");
// break;
// case 6:
// System.out.print("Today is Saturday");
// break;
// case 7:
// System.out.print("Today is Sunday");
// break;
// default:
// System.out.print("Invalid Number");
// }

// True and false question
// int a = 63, b = 36;
// boolean x = (a < b ) ? true : false;
// int y= (a < b ) ? b : a;
// System.out.println(y);
// }

// if and else question
// double temp = 90;
// if (temp > 100){
// System.out.print("you have a fever, your temperature is: " + temp);
// }else if(temp < 100){
// System.out.print("You do not have a fever: "+ temp);
// }else{
// System.out.print("invalid Number");
// }

