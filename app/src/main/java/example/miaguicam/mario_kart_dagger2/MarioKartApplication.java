package example.miaguicam.mario_kart_dagger2;

import android.app.Application;

import example.miaguicam.mario_kart_dagger2.di.CharacterComponent;
import example.miaguicam.mario_kart_dagger2.di.CharacterModule;
import example.miaguicam.mario_kart_dagger2.di.DaggerCharacterComponent;


public class MarioKartApplication extends Application {

  private CharacterComponent charactersComponent;

  @Override public void onCreate() {
    super.onCreate();

    charactersComponent = DaggerCharacterComponent.builder().characterModule(new CharacterModule()).build();
  }

  public CharacterComponent getCharactersComponent() {
    return charactersComponent;
  }
}
