package Animals;

public abstract class Mammals extends Animals {
    private double speed;

    public Mammals(String name, int age, String livingEnvironment, double speed) {
        super(name, age, livingEnvironment);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void walk(){
        System.out.println("Гуляю.");
    };

    @Override
    public void go() {
        System.out.println("Перемещаюсь со скоростью : " + getSpeed() + " км/ч.");
    }

    @Override
    public String toString() {
        return super.toString() + ", скорость передвижения=" + speed;
    }
}
