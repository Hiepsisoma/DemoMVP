package vn.framgia.phamhung.demomvp.data.source;

import vn.framgia.phamhung.demomvp.data.model.User;
import vn.framgia.phamhung.demomvp.data.repository.Repository;

public interface DataSource {

    interface Remote {
    }

    interface Local {
        User getData();
    }
}
