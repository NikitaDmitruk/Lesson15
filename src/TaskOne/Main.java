package TaskOne;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> digits = new LinkedHashSet<>();
        LinkedList<String> filteredDigits = new LinkedList();
        System.out.printf("Введите числа в одну строку:");
        Matcher digit = Pattern.compile("\\d+").matcher(scanner.nextLine());
        while (digit.find()) {
            digits.add(digit.group());
        }
        filteredDigits.addAll(digits);
        for (String element : filteredDigits) {
            if (element.equals(filteredDigits.getLast())) {
                System.out.print(element + " ");
            } else {
                System.out.print(element + ", ");
            }
        }
    }
}
