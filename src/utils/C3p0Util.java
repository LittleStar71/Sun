package utils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.beanutils.BeanUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

//单例模式，饿汉式改版C3p0
public class C3p0Util
{
    //加载四大配置参数,ds包含了4大参数信息
    private static DataSource ds = new ComboPooledDataSource();
    public  static DataSource getDs() {
        return ds;
    }
    //将servlet中request请求中所有的参数一次性装到map中，然后封装到javabean中
    public static <T> T toBean(Class<T> c, Map map){
        try {
            T t = c.newInstance();
            BeanUtils.populate(t, map);
            return t;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

   /* public static void main(String[] args) throws SQLException {
        DataSource ds=new ComboPooledDataSource();
        Connection con=ds.getConnection();
    }*/
}

