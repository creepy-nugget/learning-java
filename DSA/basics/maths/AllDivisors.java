import java.util.*;
class AllDivisors {
    public List<Integer> getDivisors(int N) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                res.add(i);
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        AllDivisors sol = new AllDivisors();
        int N = 36;
        List<Integer> result = sol.getDivisors(N);
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
