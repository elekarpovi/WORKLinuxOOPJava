abstract class PackAnimals extends Animal{
    static protected Integer typeCount = 0;
    protected PackAnimals(String name, String birthDay, String commands) {
        super(name,birthDay,commands);
        typeCount++;
    }
}
