public class Main {

    public static void main(String[] args) {
        AnimalHouse animalHouse = DatabaseService.loadFromDatabase();
        Menu menu = new Menu();
        menu.start(animalHouse);
    }
}