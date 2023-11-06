package com.codegym.bai1_login.repository;

import com.codegym.bai1_login.model.Login;
import com.codegym.bai1_login.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LoginRepository implements  ILoginRepository{
    private static List<User> userList = new ArrayList<>();
    static  {
        userList.add(new User("john","123456","John","john@codegym.vn",10));
        userList.add(new User("bill","123456","Bill","bill@codegym.vn",15));
        userList.add(new User("mike","123456","Mike","mike@codegym.vn",15));

    }
    @Override
    public User checkLogin(Login login) {
        for (User u: userList) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
