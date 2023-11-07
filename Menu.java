import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public Menu() {

    }

    public void start(AnimalHouse animalHouse) {
        printMenu();
        while (true) {
            System.out.print("Выберите пункт меню: ");
            switch (sc.nextLine()) {
                
                case "1" -> printAnimalList(animalHouse);
                
                case "2" -> createNewAnimal(animalHouse);
                
                case "3" -> {
                    System.out.print("Введите id животного: ");
                    Animal animal = findAnimalById(animalHouse, sc.nextLine());
                    if (animal == null) {
                        System.out.println("Животное с таким id не найдено.");
                    } else {
                        System.out.println(animal.name + " знает команды: " + animal.commands);
                    }
                }
                
                case "4" -> {
                    System.out.print("Введите id животного: ");
                    Animal animal = findAnimalById(animalHouse, sc.nextLine());
                    if (animal == null) {
                        System.out.println("Животное с таким id не найдено.");
                    } else {
                        System.out.print("Введите новую команду для " + animal.name + ": ");
                        animal.commands = animal.commands + " " + sc.nextLine();
                        System.out.println("Команда добавлена.");
                    }
                }
                
                case "5" -> printAnimalsCounters();
                
                case "0" -> {
                    System.out.println("Завершение работы.");
                    DatabaseService.saveToDatabase(animalHouse);
                    System.exit(0);
                }
                case "help" -> printMenu();
                default -> System.out.println("Неверный ввод");
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
        1 - Список всех животных
        2 - Добавление животного
        3 - Список команд животного
        4 - Добавление команды животному
        5 - Количество животных по видам
        0 - Выход
        help - Вывести меню""");        
                
    }

    private static void printAnimalList(AnimalHouse animalHouse) {
        for (Animal animal : animalHouse.animalList) {
            System.out.println(animal);
        }
    }

    private static void printAnimalsCounters() {
        System.out.println("Всего животных в питомнике: " + Animal.animalCount + "\n" +
                "Домашних животных: " + Pets.typeCount + "\n" + "Кошек: " + Cat.classCounter + "\n" +
                "Собак: " + Dog.classCounter + "\n" + "Хомячков: " + Hamster.classCounter + "\n" +
                "Вьючных животных: " + PackAnimals.typeCount + "\n" + "Лошадей: " + Horse.classCounter + "\n" +
                "Верблюдов: " + Camel.classCounter + "\n" + "Ослов: " + Donkey.classCounter);
    }

    private static Animal findAnimalById(AnimalHouse animalHouse, String id) {
        for (Animal animal : animalHouse.animalList) {
            if (animal.id.equals(id)) return animal;
        }
        return null;
    }

    private void createNewAnimal(AnimalHouse animalHouse) {

        while (true) {
            System.out.println("""
            1 - Собака
            2 - Кошка
            3 - Хомяк
            4 - Лошадь
            5 - Верблюд
            6 - Осёл
            0 - Выход""");
                    
            System.out.print("Выберите вид животного: ");
            switch (sc.nextLine()) {
                
                case "0" -> {
                    System.out.println("Операция прервана.");
                    return;
                }
                
                case "1" -> {
                    animalHouse.add(new Dog(createName(), createYear() + "-" + createMonth() + "-" +
                            createDay(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                
                case "2" -> {
                    animalHouse.add(new Cat(createName(), createYear() + "-" + createMonth() + "-" +
                            createDay(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                
                case "3" -> {
                    animalHouse.add(new Hamster(createName(), createYear() + "-" + createMonth() + "-" +
                            createDay(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                
                case "4" -> {
                    animalHouse.add(new Horse(createName(), createYear() + "-" + createMonth() + "-" +
                            createDay(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                
                case "5" -> {
                    animalHouse.add(new Camel(createName(), createYear() + "-" + createMonth() + "-" +
                            createDay(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                
                case "6" -> {
                    animalHouse.add(new Donkey(createName(), createYear() + "-" + createMonth() + "-" +
                            createDay(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                default -> System.out.println("Неверный ввод");
            }
        }
    }

    private String createName() {
        System.out.print("Введите имя нового животного: ");
        return sc.nextLine();
    }

    private String createYear() {
        System.out.print("Введите год рождения нового животного: ");
        return sc.nextLine();
    }

    private String createMonth() {
        System.out.print("Введите месяц рождения нового животного: ");
        return sc.nextLine();
    }

    private String createDay() {
        System.out.print("Введите день рождения нового животного: ");
        return sc.nextLine();
    }

    private String createCommands() {
        System.out.print("Введите список команд нового животного через пробел: ");
        return sc.nextLine();
    }
}
