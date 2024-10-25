import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //O(1);

        System.out.print("Nhập chuỗi: "); //O(1);
        String string = input.nextLine();  //O(1);

        LinkedList<Character> max = new LinkedList<>();  //O(1);
        for (int i = 0; i < string.length(); i++) {  //O(n);
            LinkedList<Character> list = new LinkedList<>();  //O(1);

            list.add(string.charAt(i));  //O(1);
            for (int j = i + 1; j < string.length(); j++) {  //O(n);

                if (string.charAt(j) > list.getLast()) {  //O(1);

                    list.add(string.charAt(j));  //O(1);
                }
            }

            if (list.size() > max.size()) {  //O(1);

                max.clear();  //O(1);
                max.addAll(list);  //O(1);
            }
            list.clear();   //O(1);
        }

        for (Character ch : max) {  //O(n);
            System.out.print(ch);  //O(1);
        }
        System.out.println();  //O(1);
    }
}

/********************************************
 * Tính toán do phuc tạp của bài toán:
 *
 */