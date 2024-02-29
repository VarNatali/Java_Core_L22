package ua.lviv.lga.lesson22.task02;

public class Example {
    private String name;
    private int age;
    private int growth;


    public Example(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Викликали конструктор з 2-ма параметрами");
    }

    public Example(String name, int age, int growth) {
        this(name, age);
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrowth() {
        return growth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }


    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                '}';
    }
}
