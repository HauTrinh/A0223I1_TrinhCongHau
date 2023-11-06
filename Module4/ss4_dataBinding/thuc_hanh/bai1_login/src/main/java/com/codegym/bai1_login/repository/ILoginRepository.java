package com.codegym.bai1_login.repository;

import com.codegym.bai1_login.model.Login;
import com.codegym.bai1_login.model.User;

public interface ILoginRepository {
    User checkLogin(Login login);
}
