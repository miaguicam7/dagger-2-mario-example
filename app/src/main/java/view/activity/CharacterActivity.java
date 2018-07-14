package view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.miaguicam.mario_kart_dagger2.R;

import java.util.List;

import view.presenter.CharacterPresenter;
import view.presenter.Presenter;

public class CharacterActivity extends BaseActivity implements CharacterPresenter.View{

    @Override
    protected int getLayoutResID() {
        return 0;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void showCharacters(List<Character> characters) {

    }

    @Override
    public void hideLoading() {

    }
}
