package ua.lviv.lga.lesson22.task02;


public class Application2 {
    public static void main(String[] args) {
        Create create = (name, age, growth) -> new Example(name, age, growth);
        Example example = create.create("Anna", 27, 166);

        System.out.println(example);


    }
}
