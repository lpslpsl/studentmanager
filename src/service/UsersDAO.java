package service;

import entity.UserEntity;

/**
 * Created by li on 2016/8/31.
 */
public interface UsersDAO {
    boolean userLogin(UserEntity userEntity);
}
