public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        System.out.println("Отработка метода, добавляющего нового сотрудника:");
        System.out.println();
        System.out.println(employeeBook.addEmployee("Иванов Сергей Андреевич",1,80000));
        employeeBook.addEmployee("Федоров Бенедикт Камбербетчивич",2,93000);
        employeeBook.addEmployee("Каладзе Джесика Альбовна",4,87000);
        employeeBook.addEmployee("Черепанов Бред Питович",3,88000);
        employeeBook.addEmployee("Балабанова Эмбер Хёрдовна",3,99000);
        employeeBook.addEmployee("Кужабердинов Сильвестр Сталоневич", 5,870000);
        employeeBook.addEmployee("Тихонов Джейсон Момоевич",5,106000);
        employeeBook.addEmployee("Ромащенко Брюс Уильевич",2,91000);
        employeeBook.addEmployee("Беляк Максим Галкинович", 1,100000);
        employeeBook.addEmployee("Рапинчук Эмилия Кларковна",5,60000);
        System.out.println();
        System.out.println("Получить список всех сотрудников, со всеми имеющимися по ним данными:");
        System.out.println();
        employeeBook.getList();
        System.out.println();
        System.out.println("Посчитать сумму затрат на ЗП в месяц:");
        System.out.println();
        System.out.println("Сумма затрат на ЗП в месяц: "+employeeBook.getSalary());
        System.out.println();
        System.out.println("Найти сотрудника с минимальной ЗП:");
        System.out.println();
        System.out.println(employeeBook.getSalaryMin());
        System.out.println();
        System.out.println("Найти сотрудника с максимальной ЗП:");
        System.out.println();
        System.out.println(employeeBook.getSalaryMax());
        System.out.println();
        System.out.println("Подсчитать среднее значение зарплат:");
        System.out.println();
        System.out.println("Среднее значение зарплат: "+employeeBook.getSalaryMed());
        System.out.println();
        System.out.println("Распечатать ФИО всех сотрудников:");
        employeeBook.getListNames();
        System.out.println();
        System.out.println("Вызвать изменение зп у всех сотрудников на величину аргумента в % :");
        employeeBook.incriaseSalary(10);
        System.out.println();
        employeeBook.getList();
        System.out.println();
        System.out.println("Получить в качестве параметра номер отдела (1-5) и найти:");
        System.out.println("Сотрудника с минимальной зп: "+employeeBook.getSalaryMinByDep(3));
        System.out.println("Сотрудника с максимальной зп: "+employeeBook.getSalaryMaxByDep(3));
        System.out.println("Сумму затрат на зп по отделу: "+employeeBook.getSalaryByDep(3));
        System.out.println("Среднюю зп по отделу: "+employeeBook.getSalaryMedByDep(3));
        System.out.println("Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.");
        employeeBook.incriaseSalaryInDep(10,3);
        System.out.println("Напечатать всех сотрудников отдела:");
        employeeBook.getListNamesByDep(3);
        System.out.println();
        System.out.println("Получить в качестве параметра число и вывести:");
        System.out.println("Всех сотрудников с зп меньше числа: ");
        employeeBook.getSalaryLowerThen(90000);
        System.out.println();
        System.out.println("Всех сотрудников с зп больше или равно числа: ");
        employeeBook.getSalaryHigherThen(90000);
        System.out.println();
        System.out.println("Метод добавления сотрудника должен вернуть false если свободных мест нет:");
        System.out.println("Наличие свободных мест: "+employeeBook.addEmployee("Рапинчук Эмилия Кларковна",5,60000));
        System.out.println();
        System.out.println("Отработка метода удаления сотрудника:");
        employeeBook.deleteEmployee(1);
        System.out.println();
        System.out.println("Метод для нахождения сотрудника по Id: ");
        employeeBook.getEmployeeById(1);
        System.out.println("Добавим еще 1го сотрудника: "+employeeBook.addEmployee("Быков Вин Дизилевич", 1,100000));
        employeeBook.getList();


















    }
}

