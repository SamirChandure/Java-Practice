import java.util.Scanner;

public class Problem_103 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The String: ");
        String str = sc.nextLine();

        StringBuilder visited = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (visited.indexOf(String.valueOf(ch)) == -1) {

                int count = 0;

                for (int j = 0; j < str.length(); j++) {

                    if (ch == str.charAt(j)) {
                        count++;
                    }
                }

                System.out.println(ch + " → " + count);

                visited.append(ch);
            }
        }

        sc.close();
    }
}