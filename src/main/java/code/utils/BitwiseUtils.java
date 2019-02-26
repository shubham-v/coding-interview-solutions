package code.utils;

public class BitwiseUtils {

    public static int NOT ( int n ) {
        return ~n;
    }

    public static int AND ( int a, int b ) {
        return a & b;
    }

    public static int OR(int a, int b) {
        return a | b;
    }

    public static int XOR(int a, int b) {
        return a ^ b;
    }

    public static int onesComplement ( int n ) {
        return ~n;
    }

    public static int twosComplement(int n) {
        return onesComplement(n) + 1;
    }

    public static boolean isBitSet ( int n, int ithBit ) {
        return ( n & ( 1 << ithBit ) ) == 1;
    }

    public static boolean isOdd ( int n ) {
        return ( n & 1 ) == 1;
    }

    public static boolean isEven ( int n ) {
        return ( n & 1 ) == 0;
    }

    public static int leftShift ( int n ) {
        return leftShiftByK(n, 1);
    }

    public static int rightShift ( int n ) {
        return rightShiftByK(n, 1);
    }

    public static int leftShiftByK ( int n, int k ) {
        return n << k;
    }

    public static int rightShiftByK ( int n, int k ) {
        return n >> k;
    }

    public static int unsigndRightShift ( int n ) {
        return unsignedRightShiftByK ( n, 1 );
    }

    public static int unsignedRightShiftByK ( int n, int k ) {
        return n >>> k;
    }

    public static boolean isPowerOfTwo ( int n ) {
        return n != 0 && ( ( n & ( n - 1 ) ) == 0);
    }

    public static int countOfSetBits ( int n ) {
        int count = 0;
        while( n > 0 ) {
            n = n & ( n-1 );
            count++;
        }
        return count;
    }

    public static int ithBitSetNumber ( int n, int i ) {
        return n | (1 << i);
    }

    public static int rightMostOneNumber ( int n) {
        return n & twosComplement(n);
    }

    public static long setAllRightBits ( long N ) {

        N = N | ( N >> 1 );
        N = N | ( N >> 2 );
        N = N | ( N >> 4 );
        N = N | ( N >> 8 );

        return N;
    }

    public static long largestPowerOf2LesserThan(long N) {
        setAllRightBits(N);
        return ( N + 1 ) >> 1;
    }

    private static boolean isZero(String s) {
        return "0".equals(s);
    }

    private static boolean isOne(String s) {
        return "1".equals(s);
    }

    private static boolean isZero(int b) { return 0 == b; }

    private static boolean isOne(int b) {
        return 1 == b;
    }

}
