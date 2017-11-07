package get.friends.with.modules;

import com.redhat.foo.bar.Car;
import com.redhat.foo.bar.Color;
import com.redhat.foo.bar.Skoda;
import com.redhat.foo.ear.Gender;
import com.redhat.foo.ear.Person;

public class Main {
    public static void main(String... args) {
        Person elon = new Person("Melon Usk", Gender.Trigender);
        elon.addCar(new Skoda(Color.BLACK, 300_000));
        elon.addCar(new Skoda(Color.ORANGE, 350_000));
        Car c = new Skoda(Color.GREEN, 400_500);
        c.printInfo();
    }    
}
