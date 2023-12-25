package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UsersDao;
import web.model.User;
import java.util.List;


@Service
public class UsersServiceImp implements UserService {

    @Autowired
    private UsersDao userDao;

    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    public User saveUser(User user) {
        return userDao.saveUser(user);
    }


    @Transactional
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Transactional
    public User deleteUser(User user) {
        return userDao.deleteUser(user);
    }


    @Transactional
    public User getUser(int count) {
        return userDao.getUser(count);
    }
}
