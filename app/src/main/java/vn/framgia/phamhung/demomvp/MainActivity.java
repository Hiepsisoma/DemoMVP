package vn.framgia.phamhung.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Set;

import vn.framgia.phamhung.demomvp.home.Contract;
import vn.framgia.phamhung.demomvp.home.Presenter;

public class MainActivity extends AppCompatActivity implements Contract.View, View.OnClickListener {
    private EditText mEditTextName, mEditTextPassword;
    private Button mButtonLogin;
    private Presenter mPresenter = new Presenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.setView(this);
        mEditTextName = findViewById(R.id.text_email);
        mEditTextPassword = findViewById(R.id.text_password);
        mButtonLogin = findViewById(R.id.button_ok);
        mButtonLogin.setOnClickListener(this);
    }

    @Override
    public void onLoginFailure(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_ok:
                mPresenter.onLogin(mEditTextName.getText().toString(),
                        mEditTextPassword.getText().toString());
                break;
            default:
                break;
        }
    }
}
