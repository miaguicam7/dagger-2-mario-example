package service;

import javax.inject.Inject;

import data.Repository;
import io.reactivex.Observable;

public class CharacterService extends GenericObservable{

    private Repository repository;

    @Inject
    public CharacterService(Repository repository){
        this.repository = repository;
    }

    @Override
    Observable buildUseCaseObservable() {
        return repository.getAll();
    }
}
