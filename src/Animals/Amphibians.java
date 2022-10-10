package Animals;

public class Amphibians extends Animals{

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Питаюсь живыми существами.");
    }

    @Override
    public void go() {
        System.out.println("Могу перемещаться в воде и по суше.");
    }

    public void hunting(){
        System.out.println("Получаю пищу с помощью охоты");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
