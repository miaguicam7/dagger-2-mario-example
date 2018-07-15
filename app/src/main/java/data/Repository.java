package data;

import java.util.List;

import io.reactivex.Observable;
import model.Character;

public interface Repository {
    Observable<List<Character>> getAll();
}
