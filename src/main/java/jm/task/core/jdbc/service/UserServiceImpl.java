package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserDaoJDBCImpl JDBC = new UserDaoJDBCImpl();

    @Override
    public void createUsersTable() {
        JDBC.createUsersTable();
    }
    @Override
    public void dropUsersTable() {
        JDBC.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        JDBC.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        JDBC.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return JDBC.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        JDBC.cleanUsersTable();
    }
}
