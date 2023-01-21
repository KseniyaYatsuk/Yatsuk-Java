package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class TaskThree {

    public List<Integer> taskThree(List<Integer> numbers) {
        return numbers.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
    }
}
