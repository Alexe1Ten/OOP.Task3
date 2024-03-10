public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int solary;

    public Employee(String name, int age, int solary) {
        this.name = name;
        this.age = age;
        this.solary = solary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSolary() {
        return solary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %s, Solary: %s", getName(),getAge(),getSolary());
    }
}
