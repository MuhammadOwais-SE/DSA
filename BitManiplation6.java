package DSA;

public class BitManiplation6 {
        public static void main(String[] args) {
            System.out.print("bitManuplation in java");
        }
}
    //   public static int setIthbit(int n, int i){
    //         // if(getIthbit(n, i) == 1){
    //         //     return 0;
    //         // } else{
    //         //     return 1;
    //         // }
    //          int bitMask = 1<<i;
    //           return n | bitMask;
    //     }  

    //     public static int clearIthbit(int n,int i){
    //         int bitMask = ~(1<<i);
    //         return n & bitMask;

    //     }
    //    public static int getIthbit(int n, int i){
    //      int bitMask = 1<<i;
    //      if( (n & bitMask) == 1){
    //         return 1;
    //      }else{
    //         return 0;
    //      }
    //    }
    //     public static int updateIthbit(int n, int i, int newbit){
    //         n = clearIthbit(n, i);
    //         int bitMask = newbit<<i;
    //         return n | bitMask;
    //     }
    //     public static int clearLastIthbits(int n, int i){
    //         int bitMask = (~0)<<i;
    //         return n & bitMask;

    //     }
    //     public static int clearRangeIthbits(int n, int i, int j){
    //         int a = (~0)<<j+1;
    //         int b = (1<<i)-1;
    //         int bitMask = a | b;

    //         return n & bitMask;
    //     }
    //     public static boolean checkPowerTwo(int n){
    //         return (n & n-1) ==0;
    //     }
    //     public static int countSetbit(int n){
    //         int count = 0;
    //         // 1010
    //         while (n>0){
    //             if ((n&1) !=0){
    //                 count++;
    //             }
    //             n= n>>1;
    //         }
    //         return count;
    //     }