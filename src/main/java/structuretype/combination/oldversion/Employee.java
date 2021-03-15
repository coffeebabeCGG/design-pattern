package structuretype.combination.oldversion;

/**
 * @author cgg
 */
public class Employee {
    private String position;

    private String job;

    public Employee(String position, String job) {
        this.job = job;
        this.position = position;
    }

    public void work() {
        System.out.println("i am " + position + " work is " + job);
    }

}
