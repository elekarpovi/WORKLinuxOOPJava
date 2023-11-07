public class Camel extends PackAnimals{
    public static Integer classCounter = 0;
    public Camel(String name, String birthDay, String commands) {
        super(name, birthDay, commands);
        classCounter++;
        this.type = "Camel";
    }
}
