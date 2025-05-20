public class Player {
    private String name;
    private int age;
    private String position;
    private String number;

    public Player(String name, int age, String position, String number) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.number = number;
    }

    @Override
    public int hashCode() {
        final int MULTIPLIER = 7;
        int hash = 1;
        for (int i = 0; i < number.length(); i++) {
            hash = hash * MULTIPLIER + number.charAt(i);
        }
        return hash;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + ", " + position + ", " + number + "}";
    }
}