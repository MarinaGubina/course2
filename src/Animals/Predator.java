package Animals;

public class Predator extends Mammals{
    private String typeOfFood;

    public Predator(String name, int age, String livingEnvironment, double speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        if(isNullOrEmpty(typeOfFood)){
            this.typeOfFood = "Не указан";
        }
        else{this.typeOfFood = typeOfFood;}
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public void eat() {
        System.out.println("Питаюсь " + getTypeOfFood());
    }
    public void hunting(){
        System.out.println("Получаю пищу с помощью охоты");
    }
    @Override
    public String toString() {
        return super.toString() +
                ", тип пищи ='" + typeOfFood;
    }
}
