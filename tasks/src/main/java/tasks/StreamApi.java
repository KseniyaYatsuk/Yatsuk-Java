package tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public List<Integer> convertNegativeNumbers(List<Integer> numbers) {
        return numbers.stream().map(Math::abs).collect(Collectors.toList());
    }

    public List<Integer> convertNumbers(List<Integer> numbers) {
        return numbers.stream().map(s -> s % 2 == 0 ? s * 100 : s - 100).collect(Collectors.toList());
    }

    public List<String> getLastNamesStartWithA(List<String> lastNames) {
        return lastNames.stream().filter(s -> s.split("")[0].equals("А")).collect(Collectors.toList());
    }

    public boolean isPopular(String path) {
        boolean result;
        try {
            result = Files.lines(Paths.get(path)).anyMatch(s -> s.contains("isPopular") & s.contains("false"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public int getSumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(s -> s % 2 != 0).mapToInt(s -> s).sum();
    }
}
