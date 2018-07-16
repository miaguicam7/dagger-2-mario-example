package service;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import view.presenter.CharacterPresenter;

abstract class GenericObservable<T> {

    private final CompositeDisposable compositeDisposable;

    GenericObservable() {
        compositeDisposable = new CompositeDisposable();
    }

    public void execute(DisposableObserver<T> disposableObserver) {
        final Observable<T> observable = this.buildUseCaseObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        DisposableObserver observer = observable.subscribeWith(disposableObserver);
        compositeDisposable.add(observer);
    }

    public void dispose() {
        if (!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    abstract Observable<T> buildUseCaseObservable();
}