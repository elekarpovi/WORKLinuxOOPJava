public class Donkey extends PackAnimals{
    public static Integer classCounter = 0;
    public Donkey(String name, String birthDay, String commands) {
        super(name, birthDay, commands);
        classCounter++;
        this.type = "Donkey";
    }
}
