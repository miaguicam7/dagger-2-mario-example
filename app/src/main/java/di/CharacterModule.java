package di;

import dagger.Module;
import dagger.Provides;
import data.CharacterRepository;
import data.DataSource;
import data.FakeDataSource;
import data.Repository;

@Module
public class CharacterModule {

    @Provides
    DataSource provideCharacterDataSource(){
        return new FakeDataSource();
    }

    @Provides
    Repository provideCharacterRepository(){
        return new CharacterRepository();
    }
}
