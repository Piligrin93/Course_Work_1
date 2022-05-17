package ru.skypro;

public class Main {

    private static Employee[] employee = new Employee[10]; // поле класса

    public static void listEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static int sumSalaryEmployee(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Фонд оплаты труда для всех сотрудников = " + sum);
        return sum;

    }

    public static int minSalary(Employee[] employees) {
        int minSalary = employee[0].getSalary();
        String minName = employee[0].getFullName();

        for (int i = 0; i < employee.length; i++) {
            if (minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
                minName = employee[i].getFullName();
            }
        }
        System.out.println("Сотрудник с самой минимальной зарплатой получает - " + minName + " - " + minSalary);
        return minSalary;

    }

    public static int maxSalary(Employee[] employees) {
        int maxSalary = employee[0].getSalary();
        String maxName = employee[0].getFullName();
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
                maxName = employee[i].getFullName();
            }
        }
        System.out.println("Сотрудник с самой большой зарплатой получает - " + maxName + " - " + maxSalary);
        return maxSalary;

    }

    public static int midSalary(Employee[] employees) {
        int sum = 0;
        int midSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
            midSalary = sum / employee.length;
        }
        System.out.println("Средняя зарплата всех сотрудников " + midSalary);
        return midSalary;
    }

    public static void allEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Сотрудник ФИО - " + employee[i].getFullName());
        }
    }

    public static void main(String[] args) {

        employee[0] = new Employee("Калашников Родион Тимурович", 4, 72000);
        employee[1] = new Employee("Семёнов Матвей Данилович", 2, 54000);
        employee[2] = new Employee("Богданов Эльдар Ярославович", 1, 38000);
        employee[3] = new Employee("Федосеев Игнатий Михаилович", 5, 47000);
        employee[4] = new Employee("Хохлов Кондрат Андреевич", 5, 87000);
        employee[5] = new Employee("Шарова Лея Платоновна", 1, 85000);
        employee[6] = new Employee("Зимина Зарина Мироновна", 3, 34000);
        employee[7] = new Employee("Козлова Ирина Пётровна", 2, 77000);
        employee[8] = new Employee("Носова Ясмина Валерьяновна", 5, 47000);
        employee[9] = new Employee("Мельникова Мериса Романовна", 1, 81000);

        listEmployee();
        sumSalaryEmployee(employee);
        minSalary(employee);
        maxSalary(employee);
        midSalary(employee);
        allEmployee();
    }
}
