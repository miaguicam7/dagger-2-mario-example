package example.miaguicam.mario_kart_dagger2.view.activity;

import android.support.v4.view.ViewPager;
import android.widget.ProgressBar;

import com.example.miaguicam.mario_kart_dagger2.R;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import example.miaguicam.mario_kart_dagger2.MarioKartApplication;
import example.miaguicam.mario_kart_dagger2.view.presenter.CharacterPresenter;

public class CharacterActivity extends BaseActivity implements CharacterPresenter.View{

    private final static int ELEVATION_DP = 2;

    @BindView(R.id.view_pager)
    ViewPager pager;
    @BindView(R.id.progress_detail)
    ProgressBar detailProgress;

    @Inject
    CharacterPresenter presenter;

    @Override
    protected int getLayoutResID() {

        return R.layout.activity_characters;
    }

    @Override protected void onPrepareActivity() {
        super.onPrepareActivity();
        initializeDagger();
        presenter.setView(this);
        presenter.initialize();
    }

    private void initializeDagger() {
        MarioKartApplication app = (MarioKartApplication) getApplication();
        app.getCharactersComponent().inject(this);
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
