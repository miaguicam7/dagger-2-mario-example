package view.presenter;

import java.util.List;

public class CharacterPresenter extends Presenter<CharacterPresenter.View>{










    public interface View extends Presenter.View {

        void showCharacters(List<Character> characters);

        void hideLoading();
    }
}
