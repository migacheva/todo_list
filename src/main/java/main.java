import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> list_task = new ArrayList<>();
//        String task_name = "";
        String help_text = "Вам доступны следующие команды: \n " +
                "all/help - все доступные команды \n " +
                "add - добавление новой задачи \n " +
                "print - получение списка задач \n " +
                "toggle - переключение состояния задачи на противоположное \n " +
                "quit - завершение работы программы \n " +
                "bonus - безопасно получить хорошее настроение \n";
        Scanner in = new Scanner(System.in);
        for (; ;) {
            System.out.println("Введите команду: ");
            String cmd = in.nextLine();
            System.out.printf("Вы ввели команду: %s \n", cmd);
            if (cmd.equals("all") | cmd.equals("help")) {
                System.out.print(help_text);
            }
            if (cmd.equals("add")) {
                System.out.print("Введите название задачи:  ");
                String task_name = in.nextLine();
                if (!(task_name.equals("") | task_name.equals(" ") | task_name.equals("\n")))
                    list_task.add("[-] " + task_name);
                else{
                    System.out.println("Вводить пустые строки, пробелы, перенос строки и обижать котяток нельзя.");
                }
            }
            if (cmd.equals("print")) {
                if (!(cmd.equals("print [all]"))) {
                    System.out.println("Список всех текущих задач: ");
                    for (String s : list_task) {
                        System.out.println(s);
                    }
                } else {
                    System.out.println("Список всех текущих задач: ");
                    for (String s : list_task) {
                        System.out.println(s);
                    }
                }
            }
            if (cmd.equals("toggle")) {
                if (task_name.equals("")){
                    System.out.println("Не найдено ни одной задачи");
                }
                else{
                    String state = task_name.indexOf("[");
                    task_name = task_name.replace("[-]", "[v]");

                }
            }
            if (cmd.equals("bonus")) {
                System.out.print("Минутка добра: \n Ты классный, у тебя все получится! ");
            }
            if (cmd.equals("quit")) {
                System.out.print("До свидания!");
                break;
            }
            if (!(cmd.equals("all") | cmd.equals("help") |
                    cmd.equals("add") | cmd.equals("print") | cmd.equals("toggle") |
                    cmd.equals("quit") | cmd.equals("bonus")))
            {
                    System.out.println("Такой команды нет, попробуйте ввести all или help");
                }
        }
        in.close();
    }
}