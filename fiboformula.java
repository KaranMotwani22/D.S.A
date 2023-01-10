public class fiboformula {
    public static void main(String[] args) {
        System.out.println(fiboFormulae(5));
    }

    static int fibo(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
    static int fiboFormulae(int n){
        // just for demo, use long instead
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}

