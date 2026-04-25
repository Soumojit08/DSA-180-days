package Week_3_Revision;


class Sol {
    public void pascalTriangleOne(int n, int r){
        //formula nCr
//        int n = row-1, r = col-1;
//        int x = n-r;
//        int nFact = factorial(n);
//        int rFact = factorial(r);
//        int xFact = factorial(x);
//        int ans = nFact / (rFact * xFact);
//        System.out.println(ans);

        //simple
        n = n - 1;
        r = r - 1;
        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res / (i+1);
        }

        System.out.println(res);
    }

    private static int factorial(int num){
        if (num==0) return 1;
        return  num * factorial(num-1);
    }
}

public class PascalTriangle {
    public static void main(String[] args) {
        Sol obj = new Sol();
        obj.pascalTriangleOne(5, 3);
    }
}
