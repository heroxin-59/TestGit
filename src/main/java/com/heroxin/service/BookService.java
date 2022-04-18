package com.heroxin.service;

import com.heroxin.pojo.Books;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Heroxin
 * @create 2022-03-27-19:53
 * @Description:
 */
public interface BookService {

    //    增加一本书
    public void insertBook(Books book);

    //    删除一本书
    public void deleteBook(int id);

    //    修改一本书
    public void updateBook(Books books);

    //    查询一本书
    public Books findBookById(int id);

    //    查询所有书
    public List<Books> findAll();

}
