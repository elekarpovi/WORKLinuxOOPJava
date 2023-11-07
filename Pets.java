abstract class Pets extends Animal {
    static protected Integer typeCount = 0;
    protected Pets(String name, String birthDay, String commands) {
        super(name,birthDay,commands);
        typeCount++;
    }
}
