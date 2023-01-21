import tasks.TaskOne;
import tasks.TaskThree;
import tasks.TaskTwo;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new TaskOne(), new TaskTwo(), new TaskThree());
        controller.start();
    }
}
