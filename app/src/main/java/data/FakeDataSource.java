package data;


import java.util.LinkedList;
import java.util.List;

import model.Abilities;
import model.Character;

public class FakeDataSource implements DataSource {

    private final List<Character> characters;

    public FakeDataSource() {
        this.characters = new LinkedList<>();
    }

    @Override public List<Character> provideCharacterList() {
        //addCharacter(getMarioBros());

        return this.characters;
    }



    private void addCharacter(Character character) {
        this.characters.add(character);
    }
}
