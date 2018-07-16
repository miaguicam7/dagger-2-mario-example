package view.presenter;

import java.util.List;

import javax.inject.Inject;

import data.Repository;
import service.CharacterService;
import service.GenericObserver;

public class CharacterPresenter extends Presenter<CharacterPresenter.View>{


    private CharacterService characterService;

    @Inject
    public CharacterPresenter(CharacterService characterService) {
        this.characterService = characterService;
    }


    @SuppressWarnings("unchecked")
    @Override public void initialize() {
        super.initialize();
        this.characterService.execute(new GetCharacterListObserver());
    }

    @Override public void terminate() {
        super.terminate();
        characterService.dispose();
        setView(null);
    }


    private class GetCharacterListObserver extends GenericObserver<List<Character>> {

        @Override public void onComplete() {
            super.onComplete();
            getView().hideLoading();
        }

        @Override public void onError(Throwable e) {
            super.onError(e);
        }

        @Override public void onNext(List<Character> characters) {
            super.onNext(characters);
            getView().showCharacters(characters);
        }
    }


    public interface View extends Presenter.View {

        void showCharacters(List<Character> characters);

        void hideLoading();
    }
}
