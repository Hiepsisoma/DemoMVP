package vn.framgia.phamhung.demomvp.data.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User {
    private String mName;
    private String mPass;

    public User() {
    }

    public User(String name, String pass) {
        mName = name;
        mPass = pass;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPass() {
        return mPass;
    }

    public void setPass(String pass) {
        mPass = pass;
    }
}
