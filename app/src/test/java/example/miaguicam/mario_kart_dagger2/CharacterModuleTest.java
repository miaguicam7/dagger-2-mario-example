package example.miaguicam.mario_kart_dagger2;

import org.mockito.Mockito;

import javax.xml.transform.Source;

import example.miaguicam.mario_kart_dagger2.data.CharacterRepository;
import example.miaguicam.mario_kart_dagger2.data.DataSource;
import example.miaguicam.mario_kart_dagger2.data.FakeDataSource;
import example.miaguicam.mario_kart_dagger2.data.Repository;
import example.miaguicam.mario_kart_dagger2.di.CharacterModule;


public class CharacterModuleTest extends CharacterModule {

    @Override
    public DataSource provideCharacterDataSource() {
        return Mockito.mock(FakeDataSource.class);
    }

    @Override
    public Repository provideCharacterRepository(DataSource dataSource) {
        return Mockito.mock(CharacterRepository.class);
    }
}
