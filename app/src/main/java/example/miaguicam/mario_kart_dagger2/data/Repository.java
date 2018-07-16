package example.miaguicam.mario_kart_dagger2.data;

import java.util.List;

import io.reactivex.Observable;
import example.miaguicam.mario_kart_dagger2.model.Character;

public interface Repository {
    Observable<List<Character>> getAll();
}
