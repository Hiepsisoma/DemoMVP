package vn.framgia.phamhung.demomvp.data.repository;

import android.support.annotation.NonNull;

import vn.framgia.phamhung.demomvp.data.model.User;
import vn.framgia.phamhung.demomvp.data.source.DataSource;
import vn.framgia.phamhung.demomvp.data.source.local.LocalSource;

public class Repository implements DataSource.Local, DataSource.Remote {
    private static Repository sRepository;
    private DataSource.Local mLocalSource;

    public static synchronized Repository getsInstance() {
        if (sRepository == null) {
            sRepository = new Repository();
        }
        return sRepository;
    }

    public Repository() {
        mLocalSource = LocalSource.getsInstance();
    }

    @Override
    public User getData() {
        return mLocalSource.getData();
    }
}
