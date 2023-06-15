public abstract class Pokemon {
    private final String name;
    private final int level;
    private final int hp;
    private final String food;

    public Pokemon(String name, int level, int hp, String food) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
    }

}
