public static int fib(int n) {
    if (n == 0)
        return 0;
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int c = a + b;
        a = b;
        b = c;
    }
    return b;
}

public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
        System.out.println("fib(" + i + ") is " + fib(i));
    }
}
