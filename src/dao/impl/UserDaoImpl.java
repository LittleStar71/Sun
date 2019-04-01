package dao.impl;
import dao.IUserDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pojo.User;
import utils.C3p0Util;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public int login(User user) {
        QueryRunner qr=new QueryRunner(C3p0Util.getDs());
        try {
            List<User> list = qr.query("select * from user where username=? and password=?", new BeanListHandler<User>(User.class), user.getUsername(), user.getPassword());
            return list.size();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
