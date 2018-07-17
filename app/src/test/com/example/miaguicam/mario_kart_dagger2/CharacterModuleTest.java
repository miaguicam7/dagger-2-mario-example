package example.miaguicam.mario_kart_dagger2.di;

import dagger.Module;
import dagger.Provides;
import example.miaguicam.mario_kart_dagger2.data.CharacterRepository;
import example.miaguicam.mario_kart_dagger2.data.DataSource;
import example.miaguicam.mario_kart_dagger2.data.FakeDataSource;
import example.miaguicam.mario_kart_dagger2.data.Repository;

@Module
public class CharacterModule {

    @Provides
    DataSource provideCharacterDataSource() {
        return new FakeDataSource();
    }

    @Provides
    Repository provideCharacterRepository(DataSource dataSource) {
        return new CharacterRepository(dataSource);
    }
}
