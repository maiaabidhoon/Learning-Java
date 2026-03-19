package Day06;

class Student {
    private int age;
    private String name;

    public void setAge(int e) {
        age = e;
    }

    public int getAge() {
        return age;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

}

public class encapsulation {
    public static void main(String[] args) {

        Student stu = new Student();

        stu.setAge(21);
        stu.setName("Aabid Husain");

        System.out.println(stu.getAge());
        System.out.println(stu.getName());

    }
}