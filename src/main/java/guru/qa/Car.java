package guru.qa;

public class Car {

    String mark;
    String color;
    int yearOfRelease;

    public Car(String mark,String color, int yearOfRelease ){
        this.mark = mark;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }

    public String infoCar(){
        return "автомобиль: " + mark  + ", цвет: " + color + ", год выпуска: " + yearOfRelease;
    }


}
