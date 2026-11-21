import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        return name.trim().split(" +").length == 3;
    }

    private static String formatName(String name) {
        var words = name.trim().split(" +");
        sortByLength(words);
        for (int i = 0; i < words.length; i++)
        {
            var upper = words[i].substring(0,1).toUpperCase();
            words[i] = upper + words[i].substring(1);
        }

        return String.join(" ", words);
    }

    private static void sortByLength(String[] words) {
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length - 1; j++)
            {
                if (words[j].length() > words[j + 1].length())
                {
                    var temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
    }
}