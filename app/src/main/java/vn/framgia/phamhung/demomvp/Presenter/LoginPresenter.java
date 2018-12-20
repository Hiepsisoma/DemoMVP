package vn.framgia.phamhung.demomvp.Presenter;

import vn.framgia.phamhung.demomvp.Model.User;
import vn.framgia.phamhung.demomvp.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {
    ILoginView mILoginView;

    public LoginPresenter(ILoginView ILoginView) {
        mILoginView = ILoginView;
    }

    @Override

    public void onLogin(String email, String password) {
        User user = new User(email,password);
        boolean isLoginSuccess = user.isVailiData();
        if(isLoginSuccess==true)
            mILoginView.onLoginResult("Login Success!");
        else
            mILoginView.onLoginResult("Login Error!");
    }
}
