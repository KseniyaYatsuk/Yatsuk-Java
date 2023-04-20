import tasks.Code;
import tasks.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static Code code = new Code();
    private static StreamApi streamApi = new StreamApi();

    public static void main(String[] args) {
        System.out.println(code.reverseString("Никогда не ошибается тот, кто ничего не делает"));
        System.out.println(code.reverseStringWithoutMethodsOfString("Никогда не ошибается тот, кто ничего не делает"));
        System.out.println(code.getCountOfWorlds("Упади семь раз и восемь раз поднимись"));
        System.out.println(code.replaceSymbols("Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.",
                "*", "а"));
        System.out.println(code.deleteSymbols("Работать нужно не 12 часов, а головой!", "!"));
        System.out.println(code.countOfSymbol("Работать нужно не 12 часов, а головой!", "в"));
        code.stringWithSeparator("Работать нужно не 12 часов, а головой!", " ", 3);
        System.out.println(code.isStringPalindrome("Аргентина манит негра"));
        System.out.println(code.getFibonacciNumber(1));
        System.out.println(code.isAnagram("обезьянство", "светобоязнь"));
        System.out.println(code.isAnagram("кропание", "пионерка"));
        System.out.println(code.isAnagram("нитратомер", "терминатор"));
        System.out.println(code.getFactorial(3));
        System.out.println(code.convertNumber(10));

        List<Integer> ints = new ArrayList<>(Arrays.asList(1, -3, -10, 20));
        System.out.println(streamApi.convertNegativeNumbers(ints));
        System.out.println(streamApi.convertNumbers(ints));
        List<String> lastNames = new ArrayList<>((Arrays.asList("Иванов", "Ананько", "Акулов")));
        System.out.println(streamApi.getLastNamesStartWithA(lastNames));
        System.out.println(streamApi.isPopular("src/main/resources/SomeFile.json"));
        System.out.println(streamApi.getSumOfOddNumbers(ints));
    }
}
