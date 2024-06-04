import java.util.Scanner;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        IntStream.range(0, b).forEach(i -> {
            String row = IntStream.range(0, a)
                                  .mapToObj(j -> "*")
                                  .reduce("", (s1, s2) -> s1 + s2);
            System.out.println(row);
        });
    }
}