import Utils.StringUtils;
import constants.Messages;
import tasks.TaskOne;
import tasks.TaskThree;
import tasks.TaskTwo;

import java.util.List;
import java.util.Scanner;

public class Controller {

    private TaskOne taskOne;
    private TaskTwo taskTwo;
    private TaskThree taskThree;

    private Scanner scanner;

    public Controller(TaskOne taskOne, TaskTwo taskTwo, TaskThree taskThree) {
        this.taskOne = taskOne;
        this.taskTwo = taskTwo;
        this.taskThree = taskThree;
    }

    public void start() {
        while (true) {
            try {
                int num = Integer.parseInt(readParameters(Messages.MAIN_MESSAGE));
                switch (num) {
                    case (1):
                        int number = Integer.parseInt(readParameters(Messages.MESSAGE_ONE));
                        System.out.println(taskOne.taskOne(number));
                        break;
                    case (2):
                        String name = readParameters(Messages.MESSAGE_TWO);
                        System.out.println(taskTwo.taskTwo(name));
                        break;
                    case (3):
                        List<Integer> numbers = StringUtils.convertStringToIntList(readParameters(Messages.MESSAGE_TREE), " ");
                        System.out.println(taskThree.taskThree(numbers));
                        break;
                    case (4):
                        return;
                    default:
                        System.out.println("Введите 1, 2, 3 или 4");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели некорректный символ");
            }
        }
    }

    private String readParameters(String message) {
        System.out.println(message);
        System.out.print("-->");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
