package example.miaguicam.mario_kart_dagger2.di;


import javax.inject.Singleton;

import dagger.Component;
import example.miaguicam.mario_kart_dagger2.view.activity.CharacterActivity;

@Singleton
@Component(modules = CharacterModule.class)
public interface CharacterComponent {
//TODO: queda indicar donde se va a inyectar el componente
void inject(CharacterActivity characterActivity);
}


