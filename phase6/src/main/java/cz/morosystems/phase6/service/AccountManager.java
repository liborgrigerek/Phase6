package cz.morosystems.phase6.service;

import java.util.List;

import cz.morosystems.phase6.entity.AccountEntity;
import cz.morosystems.phase6.entity.UserEntity;

public interface AccountManager {
	public AccountEntity getAccount(Integer accountId);
    public List<AccountEntity> getAllAccounts(Integer userId);
    public void addAccount(AccountEntity account);
    public void editAccount(AccountEntity account);
    public void deleteAccount(Integer accountId);
}
