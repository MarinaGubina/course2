package Animals;

public class Herbivorous extends Mammals{
    private String typeOfFood;

    public Herbivorous(String name, int age, String livingEnvironment, double speed, String typeOfFood) {
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
    public void grazing(){
        System.out.println("Получаю пищу на пастбище");
    };

    @Override
    public String toString() {
        return super.toString() +
                ", тип пищи ='" + typeOfFood;
    }
}
