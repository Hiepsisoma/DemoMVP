package vn.framgia.phamhung.demomvp.home;

public interface Contract {
    interface View {
        void onLoginFailure(String message);

        void onLoginSuccess(String message);
    }

    interface Presenter {
        void onLogin(String email, String password);
    }
}
