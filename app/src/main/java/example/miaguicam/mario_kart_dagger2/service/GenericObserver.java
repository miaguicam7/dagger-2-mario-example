package example.miaguicam.mario_kart_dagger2.service;

import io.reactivex.observers.DisposableObserver;

public class GenericObserver<T> extends DisposableObserver<T> {
    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
