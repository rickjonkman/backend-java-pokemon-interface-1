import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    List<String> attacks = Arrays.asList("inferno", "PyroBall", "FireLash", "FlameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println();
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }

    List<String> getAttacks() {
        return attacks;
    }
}
