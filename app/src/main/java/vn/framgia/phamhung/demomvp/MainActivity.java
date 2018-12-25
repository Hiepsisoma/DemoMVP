package vn.framgia.phamhung.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import vn.framgia.phamhung.demomvp.Presenter.ILoginPresenter;
import vn.framgia.phamhung.demomvp.Presenter.LoginPresenter;
import vn.framgia.phamhung.demomvp.View.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {
    EditText edt_email, edt_password;
    Button btnLogin;
    ILoginPresenter mILoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_email = findViewById(R.id.text_email);
        edt_password = findViewById(R.id.text_password);
        btnLogin = findViewById(R.id.button_ok);
        mILoginPresenter = new LoginPresenter(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mILoginPresenter.onLogin(edt_email.getText().toString(),edt_password.getText().toString());
            }
        });
    }
    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
    //Tesst
}
