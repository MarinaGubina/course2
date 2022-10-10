package Animals;

public abstract class Animals {
    private String name;
    private int age;
    private String livingEnvironment;

    public Animals(String name, int age, String livingEnvironment) {
        if(isNullOrEmpty(name)){
            this.name = "Животное";
        }
        else {this.name = name;}
        this.age = age;
        if(isNullOrEmpty(livingEnvironment)){
            this.livingEnvironment = "Среда проживания не указана";
        }
        else {this.livingEnvironment = livingEnvironment;}
    }

    public String getName() {
        return name;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=0 && age > getAge()){
        this.age = age;}
    }

    public static boolean isNullOrEmpty(String val){
        return val == null || val.isEmpty() || val.isBlank();
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("Сплю.");
    };
    public abstract void go();

    @Override
    public String toString() {
        return "Animals - " +
                "название ='" + name + '\'' +
                ", возраст=" + age +
                ", среда обитания='" + livingEnvironment + '\'';
    }
}
