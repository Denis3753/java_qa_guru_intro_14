package guru.qa;

public class Human {

    String name;
    int age;
    Car car;


    public Human(String name, int age, Car car){

            if(age < 18){
                throw new IllegalArgumentException("Вам ещё рано водить автомобиль.");
            }

            this.name = name;
            this.age = age;
            this.car = car;
    }

    public void info(){
        System.out.println("Привет!\nМеня зовут " + name + ", мне " + age + " лет\n" + "У меня " + car.infoCar());
    }

}
