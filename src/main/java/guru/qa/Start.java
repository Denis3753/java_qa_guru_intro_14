package guru.qa;

public class Start {
    public static void main(String[] args) {

        try {
            Human olga = new Human("Ольга",28,new Car("BMW","красный",2015));
            olga.info();
        } catch (IllegalArgumentException e) {
            System.err.print(e.getMessage());
        }

    }

}
