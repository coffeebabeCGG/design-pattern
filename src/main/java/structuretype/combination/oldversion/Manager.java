package structuretype.combination.oldversion;

import java.util.List;

public class Manager {

    private String position;

    private String job;

    private List<Manager> managerList;

    private List<Employee> employeeList;


    public Manager(String position, String job) {
        this.position = position;
        this.job = job;
    }

    public void addManager(Manager manager) {
        this.managerList.add(manager);
    }

    public void removeManager(Manager  manager) {
        this.managerList.remove(manager);
    }

    public void addEmployer(Employee employee) {
        this.employeeList.add(employee);
    }

    public void removeEmpolyer(Employee employee) {
        this.employeeList.remove(employee);
    }

    public void work() {
        System.out.println("i am " + position + " work is " + job);
    }

    public void check() {
        work();
        for (Manager manager : managerList) {
            manager.check();
        }

        for (Employee employee : employeeList) {
            employee.work();
        }
    }


}
