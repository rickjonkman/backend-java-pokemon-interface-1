import java.util.*;

public class PokemonGymOwner extends PokemonTrainer {
    private String name;
    private String town;
    private List<Pokemon> pokemons;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);
        this.town = town;
    }

    @Override
    public String getTown() {
        return town;
    }
}
