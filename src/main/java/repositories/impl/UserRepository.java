package repositories.impl;

import domain.User;
import repositories.Repository;

import java.util.List;

public class UserRepository implements Repository<UserRepository> {

    private User user;

    @Override
    public void add(UserRepository item) {
        throw new UnsupportedOperationException("THis method is not supported yet.");
    }

    @Override
    public List<UserRepository> getItemList() {
        throw new UnsupportedOperationException("THis method is not supported yet.");
    }

    @Override
    public boolean remove(UserRepository item) {
        throw new UnsupportedOperationException("THis method is not supported yet.");
    }

    @Override
    public User findById(String libraryNumber) {
        return new User("Daniel",
                "dnasciment@tw.com",
                "Operários Street, n 03",
                "99888-7766",
                "xxx-xxxx",
                123456
        );
    }
}
