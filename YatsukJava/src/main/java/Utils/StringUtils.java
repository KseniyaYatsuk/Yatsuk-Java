package Utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    public static List<Integer> convertStringToIntList(String str, String separator) {
        return Arrays.stream(str.split(separator)).map(Integer::parseInt).collect(Collectors.toList());
    }
}
