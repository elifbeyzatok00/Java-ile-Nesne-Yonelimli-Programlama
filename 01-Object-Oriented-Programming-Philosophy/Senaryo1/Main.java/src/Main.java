public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // ='in sağında new Car() ile RAM'de bir yer ayırdık, yeni nesne oluşturduk, memory allocate edildi yani bellek tahsisi yapıldı.
        // ='in solunda ise car değişkeni ile bu nesneye referans verdik.
        // car yerine başka isim de verebilirdik. Ama Car car yazdık çünkü bu best practise'dir. Yani birden fazla alternatifi olsa da daha çok bu kullanılır. 
        // burada önemli olan en baştaki Car yazısı. Bu nesnenin Car sınıfından oluşturulduğunu gösterir.

        Car car2 = new Car();

        car.brand = "Ford";
        car2.brand = "Renault";
        // car ve car2 nesnelerinin brand özelliklerine değer atadık. Bunu yaparken nokta (.) ile eriştik.

        car.model = "Focus";
        car2.model = "Megane";

        car.color = "Black";
        car2.color = "Grey";

        car.price = 120000;
        car2.price = 100000;

        // 2 farklı nesne oluşturduk (car ve car2), bunlar için RAM'de alan ayırdık ve bu nesnelerin özelliklerine değer atadık.

        car.printStates();
        car2.printStates();


        car.speed=100; // initial speed
        car2.speed=130; // initial speed

        car.speedUp(50); //150
        car2.speedUp(70); //200

        System.out.println("Car speed: " + car.speed);
        System.out.println("Car2 speed: " + car2.speed);


        car.speedDown(60);
        car2.speedDown(20);

        System.out.println("Car speed: " + car.speed); //90
        System.out.println("Car2 speed: " + car2.speed); //180
    }
}
