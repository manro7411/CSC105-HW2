public class Recursion {
    public static void main(String[] args) {
        System.out.println(fac(5));
        System.out.println(exponential(2,10));
        System.out.println(divide(14,7));
        System.out.println(recursiveDivide(20, 6));
        printNto1(10);
        print1toN(10);
    }
    public static int fac(int n){
        if (n == 0) return 1;
        return n * fac(n-1);
    }
    public static int exponential(int a,int b){
        if (b==0) return 1;
        return a * exponential(a,b-1);
    }
    public static int divide(int divident, int divisor){
        // 20 /6 ==> 20-6-6-6 ==> 3 
        // 20 /6 ==> 3 2/6
        int count=0;
        for (count = 0;divident>=divisor; count++) {
            divident -= divisor;
        }
        return count;
        

    }
     public static int recursiveDivide(int divident, int divisor){
         // 3 / 6 ==> 0
         // 15 /6 ==> (15-6)/6 + 1 = (9-6)/6 +1+1 = (3-6)/6 +1+1
         if (divident < divisor) {
             return 0;
         }
         return recursiveDivide(divident-divisor,divisor)+1;
    }
    public static void printNto1(int n){
        if (n > 0) {
        System.out.println(n + " ");
        printNto1(n-1);
        }
    }
    public static void print1toN(int n){
        if (n > 0) {
            print1toN(n-1);
            System.out.println(n + " ");
        }
    }
}