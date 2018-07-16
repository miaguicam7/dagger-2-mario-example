package data;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import model.Character;

public class CharacterRepository implements  Repository {

    private List<Character> characters;

    @Inject
    public CharacterRepository(DataSource dataSource){
        this.characters = dataSource.provideCharacterList();
    }

    @Override
    public Observable<List<Character>> getAll() {
        final int seconds = 2000;
        return Observable.just(characters).delay(seconds, TimeUnit.MILLISECONDS);
    }
}
