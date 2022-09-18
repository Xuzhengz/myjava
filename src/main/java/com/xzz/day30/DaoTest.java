package com.xzz.day30;

import java.util.Iterator;
import java.util.List;

/**
 * @author 徐正洲
 * @date 2022/6/6-19:39
 */
public class DaoTest {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",new User(1,"xuzz"));
        userDAO.save("2",new User(2,"xuzhengzhou"));
        userDAO.update("1",new User(3,"xuzz3"));
        userDAO.delete("2");
        List<User> list = userDAO.list();
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}