import Transport.Car;
import Transport.Train;
import Transport.Bus;
import Transport.Transport;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Grande",1.7,"желтый",2015,
                "Россия","МКПП","седан","N123MP459",5,150);
        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"чёрный",
                2020,"Германия","АКПП","седан","N123MP849",5,150);
        Car car3 = new Car("BMW","Z8",3.0,"чёрный",
                2021,"Германия","МКПП","седан","F678MP459",5,140);
        Car car4 = new Car("Kia","Sportage 4 поколение",2.4,"красный",
                2018,"Южная Корея", "МКПП","седан","M321MP129",5,160);
        Car car5 = new Car("Hyundai","Avante",1.6,"оранжевый",
                2016,"Южная Корея","АКПП","седан","Y789UU123",5,140);
        System.out.println(car1);
        car1.refill();
        System.out.println(car2);
        car2.refill();
        System.out.println(car3);
        car3.refill();
        System.out.println(car4);
        car4.refill();
        System.out.println(car5);
        car5.refill();
        System.out.println();

        Train train1 = new Train("Ласточка","B-901",2011,"Россия",
                null,301,3500,null, "Белорусский вокзал",
                "станция Минск-Пассажирский", 11);
        Train train2 = new Train("Ленинград","D-125",2019,"Россия",
                null,270,1700,null, "Ленинградский вокзал",
                "станция Ленинград-Пассажирский", 8);
        System.out.println(train1);
        train1.refill();
        System.out.println(train2);
        train2.refill();
        System.out.println();

        Bus bus1 = new Bus("KIA","F-32",2015,"Южная Корея",
                "желтый",100);
        Bus bus2 = new Bus("ЛИАЗ","В-234",2010,"Россия",
                "белый",90);
        Bus bus3 = new Bus("MAN","Lions's City",2017,"Германия",
                "голубой",120);
        System.out.println(bus1);
        bus1.refill();
        System.out.println(bus2);
        bus2.refill();
        System.out.println(bus3);
        bus3.refill();
    }


}