import java.util.ArrayList;
import java.util.List;

public class AnimalHouse {
    public List<Animal> animalList;

    public AnimalHouse() {
        this.animalList = new ArrayList<>();
    }

    public void add(Animal animal) {
        this.animalList.add(animal);
    }

    public static void fillAnimalHouse(AnimalHouse animalHouse) {
        animalHouse.add(new Dog("Fido", "2020-01-01", "Sit Stay Fetch"));
        animalHouse.add(new Cat("Whiskers",	"2019-05-15",	"Sit Pounce"));
        animalHouse.add(new Hamster("Hammy", "2021-03-10", "Roll Hide"));
        animalHouse.add(new Dog("Buddy", "2018-12-10", "Sit Paw Bark"));
        animalHouse.add(new Cat("Smudge", "2020-02-20", "Sit Pounce Scratch"));
        animalHouse.add(new Hamster("Peanut", "2021-08-01", "Roll Spin"));
        animalHouse.add(new Dog("Bella", "2019-11-11", "Sit Stay Roll"));
        animalHouse.add(new Cat("Oliver", "2020-06-30", "Meow Scratch Jump"));
        animalHouse.add(new Horse("Thunder", "2015-07-21", "Trot Canter Gallop"));
        animalHouse.add(new Camel("Sandy", "2016-11-03", "Walk Carry Load"));
        animalHouse.add(new Donkey("Eeyore", "2017-09-18", "Walk Carry Load Bray"));
        animalHouse.add(new Horse("Storm", "2014-05-05", "Trot Canter"));
        animalHouse.add(new Camel("Dune", "2018-12-12", "Walk Sit"));
        animalHouse.add(new Donkey("Burro", "2019-01-23", "Walk Bray Kick"));
        animalHouse.add(new Horse("Blaze", "2016-02-29", "Trot Jump Gallop"));
        animalHouse.add(new Camel("Sahara", "2015-08-14", "Walk Run"));
    }
}
