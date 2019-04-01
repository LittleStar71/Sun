package dao;

import pojo.Library;

import java.util.List;

public interface ILibraryDao {
    List<Library> selectAll();

}
