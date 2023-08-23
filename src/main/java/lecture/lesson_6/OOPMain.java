package lecture.lesson_6;

public class OOPMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Yura");
        employee.setAge(100);

        Employee another = new Employee();
        another.setName("Yulia");
//        another.setAge(24);

        String name = employee.getName();
        System.out.println(name);

        System.out.println(employee.isOlderThen(120));
        System.out.println(employee.isOlderThen(80));


    }
}
