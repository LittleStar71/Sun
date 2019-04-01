package service.impl;

import dao.IUserDao;
import dao.impl.UserDaoImpl;
import pojo.User;
import service.IUserService;

public class UserServiceImpl implements IUserService {
    IUserDao dao=new UserDaoImpl();
    @Override
    public int login(User user) {
        return dao.login(user);
    }
}
