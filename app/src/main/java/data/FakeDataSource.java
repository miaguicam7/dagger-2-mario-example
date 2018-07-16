package data;


import com.example.miaguicam.mario_kart_dagger2.R;

import java.util.LinkedList;
import java.util.List;

import model.Abilities;
import model.Character;

public class FakeDataSource implements DataSource {

    private final List<Character> characters;

    public FakeDataSource() {
        this.characters = new LinkedList<>();
    }

    @Override
    public List<Character> provideCharacterList() {
        addCharacter(getMarioBros());
        
        return this.characters;
    }


    private Character getMarioBros() {
        final int accelerate = 100;
        final int steer = 95;
        final int brake = 83;
        final int reverse = 87;
        final int lookBehind = 100;
        final int drift = 100;

        final String id = "1";
        final String name = "Mario Bros";
        final int photo = R.drawable.ic_mario;
        final int cover = R.mipmap.mario;
        final String description =
                "The plumber star of the series. His kart is average across the board. When Mario is controlled by the computer, his main item used is the Star.";
        final Abilities abilities = Abilities.builder()
                .accelerate(String.valueOf(accelerate))
                .brake(String.valueOf(steer))
                .drift(String.valueOf(brake))
                .lookBehind(String.valueOf(reverse))
                .reverse(String.valueOf(lookBehind))
                .steer(String.valueOf(drift))
                .build();

        return Character.builder()
                .id(String.valueOf(id))
                .name(name)
                .photo(photo)
                .cover(cover)
                .description(description)
                .abilities(abilities)
                .build();
    }

    private void addCharacter(Character character) {
        this.characters.add(character);
    }
}
