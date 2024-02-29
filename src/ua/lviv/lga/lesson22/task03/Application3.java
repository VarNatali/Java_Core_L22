package ua.lviv.lga.lesson22.task03;

import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {
        Amphibia eat = () -> System.out.println("Я їм");
        Amphibia walk = () -> System.out.println("Я гуляю");
        Amphibia sweam = () -> System.out.println("Я плаваю");
        Amphibia sleep = () -> System.out.println("Я сплю");

        eat.doTmth();
        walk.doTmth();
        sweam.doTmth();
        sleep.doTmth();


    }
}
