package lecture.lesson_6;

public class Employee {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName (String newName) {
        name = newName;
    }
    public int getAge() {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public boolean isOlderThen (int thershold) {
        return getAge() > thershold;
    }
}
