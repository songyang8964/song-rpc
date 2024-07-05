package com.song.provider;

import com.song.common.entity.User;
import com.song.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("user name"+user.getName());
        return user;
    }


}
