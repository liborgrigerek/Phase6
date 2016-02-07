package cz.morosystems.phase6.dao;

import java.util.List;

import cz.morosystems.phase6.entity.AccountEntity;
import cz.morosystems.phase6.entity.BookEntity;
import cz.morosystems.phase6.entity.UserEntity;

public interface UserDAO {
	public UserEntity getUser(Integer id);
    public List<UserEntity> getAllUsers();
    public void addUser(UserEntity user);
    public void editUser(UserEntity user);
    public void deleteUser(Integer userId);
}