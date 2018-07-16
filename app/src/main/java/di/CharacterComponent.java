package di;


import javax.inject.Singleton;

import dagger.Component;
import view.activity.CharacterActivity;

@Singleton
@Component(modules = CharacterModule.class)
public interface CharacterComponent {
//TODO: queda indicar donde se va a inyectar el componente
void inject(CharacterActivity characterActivity);
}


