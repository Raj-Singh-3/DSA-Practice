import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String s = sc.nextLine();
            int target = Integer.parseInt(s);
            boolean found = false;

            // Only valid split is a + b = split parts of s
            // Try all possible splits of s into a and b
            for (int i = 1; i < 4; i++) { // split between 1st to 3rd character
                String aStr = s.substring(0, i);
                String bStr = s.substring(i);

                int a = Integer.parseInt(aStr);
                int b = Integer.parseInt(bStr);
                int sum = a + b;

                if (sum * sum == target) {
                    System.out.println(a + " " + b);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("-1");
            }
        }

        sc.close();
    }
}
