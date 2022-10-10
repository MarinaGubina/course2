package Animals;

public class Flying extends Bird{
    private String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if(isNullOrEmpty(typeOfMovement)){
            this.typeOfMovement = "Не указан";
        }
        else {this.typeOfMovement = typeOfMovement;}
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public void go() {
        System.out.println(getTypeOfMovement());
    }
    @Override
    public String toString() {
        return super.toString() +
                ", тип передвижения ='" + typeOfMovement;
    }
}
