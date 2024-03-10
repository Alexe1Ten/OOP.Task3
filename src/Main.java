import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList movies = new MyLinkedList();

        movies.addFirst("Маска");
        movies.addFirst("Матрица");
        movies.addFirst("Я, снова я и Ирэн");
        movies.addFirst("Зеленая миля");
        
        for (String movie : movies) {
            System.out.println(movie);
        }

        Employee worker1 = new Employee("Иван", 25, 35000);
        Employee worker2 = new Employee("Петр", 30, 40000);
        Employee worker3 = new Employee("Евгений", 45, 50000);
        Employee worker4 = new Employee("Петр", 23, 33000);

        if (worker1.compareTo(worker2) == 1) {
            System.out.format("Возраст %s больше возраста %s", worker1.getName(), worker2.getName());
        } else {
            System.out.format("Возраст %s меньше возраста %s", worker1.getName(), worker2.getName());
        }

        System.out.println();

        ArrayList<Employee> listWorker = new ArrayList<>(List.of(worker1,worker2,worker3,worker4));

        Collections.sort(listWorker, new EmployeeSalaryComparator());

        for (Employee employee : listWorker) {
            System.out.println(employee);
        }

    }
}
