package Animals;

public class Main {
    public static void main(String[] args) {
        Herbivorous gazelle = new Herbivorous("Газель",2,"саванны",
                70,"растительная пища");
        Herbivorous giraffe = new Herbivorous("Жираф",6,"равнины",
                50,"растительная пища");
        Herbivorous horse = new Herbivorous("Лошадь",5,"повсеместно",
                40,"растительная пища");
        horse.grazing();
        horse.go();
        horse.setAge(7);
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        System.out.println();

        Predator hyena = new Predator("Гиена",1,"территории Африки и юго-западной Азии",
                60,"мясо");
        Predator tiger= new Predator("Тигр",3,
                "тропические леса, полупустыни, болотистые местности, каменистые сопки, предгорья и" +
                        " горные районы, тайга",
                        55,"мясо");
        Predator bear= new Predator("Медведь",5,"леса",
                50,"мясо");
        bear.hunting();
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        System.out.println();

        Amphibians frog = new Amphibians("Лягушка", 1, "пресноводные водоёмы");
        Amphibians snake = new Amphibians("Уж", 1, "водоёмы и прибрежные территории");
        snake.eat();
        System.out.println(frog);
        System.out.println(snake);

        System.out.println();

        NonFlying peacock = new NonFlying("Павлин", 2,
                "леса и саванны на полуострове Индостан и на острове Цейлон","не летает");
        NonFlying penguin = new NonFlying("Пингвин", 4,
                "открытое море с холодным течением","не летает");
        NonFlying dodoBird = new NonFlying("Птица додо", 0,
                "вымерли","не летает");
        penguin.go();
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);

        Flying seagull = new Flying("Чайка",1, "вблизи морей","летает");
        Flying albatross = new Flying("Альбатрос",2,
                "ледяные воды Антарктиды и вообще все Южное полушарие","летает");
        Flying falcon = new Flying("Сокол",1, "почти везде","летает");
        seagull.go();
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}
