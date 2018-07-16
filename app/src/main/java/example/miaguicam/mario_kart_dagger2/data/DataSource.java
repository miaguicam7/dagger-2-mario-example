package example.miaguicam.mario_kart_dagger2.data;

import java.util.List;

import example.miaguicam.mario_kart_dagger2.model.Character;

public interface DataSource {
    List<Character> provideCharacterList();
}
