package com.tfswufe.ssm.mapper;

import com.tfswufe.ssm.pojo.Bill;
import com.tfswufe.ssm.pojo.User;

import java.util.ArrayList;

public interface UserMapper {
    public ArrayList<User> getAllUser();

    public String getCountBySex();

    public ArrayList<User> getUserById(int id);

    public ArrayList<Bill> getBillById(int id);

    public ArrayList<Bill> getBillByNotice(String notice);

    public User getUserByNameAndPwd(User user);
}
