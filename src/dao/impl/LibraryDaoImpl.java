package dao.impl;

import dao.ILibraryDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pojo.Library;
import utils.C3p0Util;

import java.util.List;

public class LibraryDaoImpl implements ILibraryDao {
    @Override
    public List<Library> selectAll()
    {
            QueryRunner qr = new QueryRunner(C3p0Util.getDs());
            try
            {
                return qr.query("select * from library",new BeanListHandler<Library>(Library.class));
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
    }
}
