package vn.framgia.phamhung.demomvp.data.source.local;

import vn.framgia.phamhung.demomvp.data.model.User;
import vn.framgia.phamhung.demomvp.data.source.DataSource;

public class LocalSource implements DataSource.Local {
    private static LocalSource sLocalSource;
    private String mName = "hung";
    private String mPass = "1234";

    public static synchronized LocalSource getsInstance() {
        if (sLocalSource == null) {
            sLocalSource = new LocalSource();
        }
        return sLocalSource;
    }

    @Override
    public User getData() {
        User user = new User();
        user.setName(mName);
        user.setPass(mPass);
        return user;
    }

}
