package Animals;

public abstract class Bird extends Animals{

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }
    public void eat() {
        System.out.println("Питаюсь растительной пищей, насекомыми, рыбой");
    }
}
