public interface DatabaseService {
    
    static AnimalHouse loadFromDatabase() {
        try {
            AnimalHouse animalHouse = new AnimalHouse();
            AnimalHouse.fillAnimalHouse(animalHouse);
            System.out.println("База данных питомника загружена.");
            return animalHouse;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Не удалось загрузить базу данных.");
            return new AnimalHouse();
        }
    }

    static void saveToDatabase(AnimalHouse animalHouse) {
        System.out.println("База данных питомника сохранена.");
    }
}
