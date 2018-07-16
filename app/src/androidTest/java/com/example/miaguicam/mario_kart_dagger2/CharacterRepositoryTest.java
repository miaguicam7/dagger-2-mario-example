package com.example.miaguicam.mario_kart_dagger2;


import android.support.test.runner.AndroidJUnit4;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import example.miaguicam.mario_kart_dagger2.data.CharacterRepository;
import example.miaguicam.mario_kart_dagger2.data.DataSource;
import example.miaguicam.mario_kart_dagger2.data.FakeDataSource;
import example.miaguicam.mario_kart_dagger2.data.Repository;

@RunWith(AndroidJUnit4.class)
public class CharacterRepositoryTest {
    DataSource dataSource;
    Repository repository;

    @Before
    public void setupTest(){
        dataSource = new FakeDataSource();
        repository = new CharacterRepository(dataSource);
    }


    @Test
    public void getAllCharacter(){

        //TODO: queda llamar al observable e inyectar las depdendencias con mockito
       repository.getAll();
    }
}
