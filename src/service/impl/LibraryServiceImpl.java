package service.impl;

import dao.ILibraryDao;
import dao.impl.LibraryDaoImpl;
import pojo.Library;
import service.ILibraryService;

import java.util.List;

public class LibraryServiceImpl implements ILibraryService {
    ILibraryDao dao=new LibraryDaoImpl();
    @Override
    public List<Library> selectAll() {
        return dao.selectAll();
    }
}
