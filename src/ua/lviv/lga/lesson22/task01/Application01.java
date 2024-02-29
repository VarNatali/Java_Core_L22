package ua.lviv.lga.lesson22.task01;

public class Application01 {
    public static void main(String[] args) {

        Pet cat = () -> System.out.println("Я кіт- Мяууу-Мяууу");
        Pet cow = () -> System.out.println("Я корова- Мууу-Мууу");
        Pet dog = () -> System.out.println("Я пес - Гаууу-Гаууу");

        cat.voice();
        cow.voice();
        dog.voice();
    }

}
