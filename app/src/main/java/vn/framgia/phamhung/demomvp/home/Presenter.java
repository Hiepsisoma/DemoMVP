package vn.framgia.phamhung.demomvp.home;

import vn.framgia.phamhung.demomvp.data.model.User;
import vn.framgia.phamhung.demomvp.data.repository.Repository;

public class Presenter implements Contract.Presenter {

    private Repository mRepository;
    private Contract.View mView;
    private static Presenter sPresenter;

    public static synchronized Presenter getInstance() {
        if (sPresenter == null) {
            sPresenter = new Presenter();
        }
        return sPresenter;
    }

    public Presenter() {
        mRepository = Repository.getsInstance();
    }

    @Override
    public void onLogin(String email, String password) {
        User user = new User(email, password);
        if (mRepository.getData().getName().equals(user.getName())
                && mRepository.getData().getPass().equals(user.getPass())) {
            mView.onLoginSuccess("Login Success!");
        } else {
            mView.onLoginFailure("Login Error!");
        }
    }

    public void setView(Contract.View view) {
        mView = view;
    }

}
