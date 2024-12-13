public class EmployeeBook {
    private final Employee[] employeeBook;
    private int number;


    public int getNumber() {
        return number;
    }

    public EmployeeBook(){
      this.employeeBook = new Employee[10];
}

    public void getList() {
        for (int i = 0; i< number; i++) {
            System.out.println(employeeBook[i].toString());
        }

    }

    public int getSalary() {
         int sum = 0;
        for (int i = 0; i< number; i++) {
            sum+= employeeBook[i].getSalary();
        }
        return sum;
    }

    public String getSalaryMin() {
        int min = employeeBook[0].getSalary();
        String empl = employeeBook[0].getName();
        for (int i = 1; i< number; i++) {
           if(min>employeeBook[i].getSalary()){
               min = employeeBook[i].getSalary();
               empl = employeeBook[i].getName();
           }
        }
        return "Сотрудник с минимальной ЗП: "+empl+", которая составляет - "+min;
    }

    public String getSalaryMax() {
        int max = employeeBook[0].getSalary();
        String empl = employeeBook[0].getName();
        for (int i = 1; i< number; i++) {
            if(max<employeeBook[i].getSalary()){
                max = employeeBook[i].getSalary();
                empl = employeeBook[i].getName();
            }
        }
        return "Сотрудник с максимальной ЗП :"+empl+", которая составляет - "+max;
    }

    public int getSalaryMed() {
        return this.getSalary()/ number;
    }

    public void getListNames() {
        for (int i = 0; i< number; i++) {
            System.out.println(employeeBook[i].getName());
        }

    }

    public void incriaseSalary(int percent) {
        for (int i = 0; i< number; i++) {
           int empl = employeeBook[i].getSalary();
            employeeBook[i].setSalary(empl + empl* percent /100);
        }
    }

    public int getSalaryByDep(int department) {
        int sum = 0;
        for (int i = 0; i< number; i++) {
            if (employeeBook[i].getDepartment() == department) {
                sum += employeeBook[i].getSalary();
            }
        }
        return sum;
    }

    public String getSalaryMinByDep(int department) {
        Employee employee = getAnyEmployeeInDep(department);
        int min = employee.getSalary();
        String name = employee.getName();
        for (int i = 1; i< number; i++) {
            if(min>employeeBook[i].getSalary()&&employeeBook[i].getDepartment() == department){
                min = employeeBook[i].getSalary();
                name = employeeBook[i].getName();
            }
        }
        return "ФИО: "+ name +", ЗП: "+min;
    }

    public String getSalaryMaxByDep(int department) {
        Employee employee = getAnyEmployeeInDep(department);
        int max = employee.getSalary();
        String name = employee.getName();
        for (int i = 1; i< number; i++) {
            if(max<employeeBook[i].getSalary()&&employeeBook[i].getDepartment() == department){
                max = employeeBook[i].getSalary();
                name = employeeBook[i].getName();
            }
        }
        return "ФИО: "+name+", ЗП: "+max;
    }

    public int getSalaryMedByDep(int department){
        int sum = 0;
        int count=0;
        for (int i = 0; i< number; i++) {
            if (employeeBook[i].getDepartment() == department) {
                sum += employeeBook[i].getSalary();
                count++;
            }
        }
        return sum/count;
    }



    public void getListNamesByDep(int departmen) {
        for (int i = 0; i< number; i++) {
            if (employeeBook[i].getDepartment() == departmen) {
                Employee empl = employeeBook[i];
                System.out.println("Id: "+empl.getId()+" ФИО: "+empl.getName()+" ЗП: "+empl.getSalary());
            }
        }

    }

    public void incriaseSalaryInDep(int percent, int department) {
        for (int i = 0; i< number; i++) {
            Employee empl = employeeBook[i];
            if (empl.getDepartment() == department){
                int salary = empl.getSalary();
            employeeBook[i].setSalary(salary + salary* percent /100);
            }
        }
    }

    public void getSalaryLowerThen(int salary) {
            int count = 0;
        for (int i = 0; i< number; i++) {
            Employee empl = employeeBook[i];
            if (empl.getSalary()< salary) {
                System.out.println("Id: "+empl.getId()+" "+empl.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет сотрудника с ЗП ниже указанной.");
        }
    }

    public void getSalaryHigherThen(int salary) {
        int count = 0;
        for (int i = 0; i< number; i++) {
            Employee empl = employeeBook[i];
            if (empl.getSalary()> salary) {
                System.out.println("Id: "+empl.getId()+" "+empl.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет сотрудника с ЗП выше указанной.");
        }
    }



    public boolean addEmployee(String employeeName, int employeeDepartment, int employeeSalary) {


            boolean flag = false;
        for (int i = 0; i <= employeeBook.length-1; i++) {

            if (number >= employeeBook.length) {
                System.out.println("Нет места для сотрудника.");
                return flag;

            }
            if (employeeBook[i] == null) {
                Employee employee = new Employee(employeeName,employeeDepartment,employeeSalary);
                employeeBook[number++] = employee;
                System.out.println("Сотрудник добавлен. "+employee.toString());
                flag = true;
                return flag;
            }
        }
        return flag;
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < number; i++) {

            if (employeeBook[i].getId() == id) {
                System.out.println("Сотрудник "+employeeBook[i]+" удален.");
                System.arraycopy(employeeBook,i+1,employeeBook,i,number-i-1);
                number--;
                employeeBook[number] = null;
                return;
            }
        }
    }




    public void getEmployeeById(int Id) {
        for (int i = 0; i < number; i++){

            if (employeeBook[i].getId() == Id) {
                System.out.println(employeeBook[i].toString());
                break;
            }
            else if (i == number - 1) {
                System.out.println("Сотрудника с таким Id не существует.");
            }
        }
    }

    public void getEmployee(String name) {

        boolean noOne = true;
        for (int i = 0; i < number; i++) {
            if (employeeBook[i].getName().contains(name)) {
                System.out.println(employeeBook[i].toString());
                noOne = false;

            } else if (i == number - 1 && noOne) {
                System.out.println("Сотрудник с таким именем не найден.");
            }
        }
    }


    public int getEmployeeBookLenght(){
        return employeeBook.length;
    }

    public Employee getAnyEmployeeInDep(int department) {
        Employee empl = employeeBook[0];
        for (int i = 0; i < number; i++) {
            if (employeeBook[i].getDepartment() == department) {
                empl = employeeBook[i];
                return empl;
            }
            }
        return empl;
    }





}

