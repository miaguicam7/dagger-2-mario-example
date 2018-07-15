package data;

import java.util.List;

import model.Character;

public interface DataSource {
    List<Character> provideCharacterList();
}
