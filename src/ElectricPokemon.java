import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "Electric";
    List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
    }

    List<String> getAttacks() {
        return attacks;
    }
}
