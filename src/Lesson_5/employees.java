package Lesson_5;

public class employees {

    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public employees(String name, String post, String email, String phone, int salary, int age) {

        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println(name + "  " + post + "  " + email + "  " + phone + "  " + salary + "  " + age);
        System.out.println("");
    }

    public void print() {

        System.out.println(name + "  " + post + "  " + email + "  " + phone + "  " + salary + "  " + age);
    }


}


