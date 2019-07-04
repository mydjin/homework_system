package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AccountService {
    /**
     * 新增账户
     * @param account
     * @return
     */
    int addAccount(Account account);

    /**
     * 修改密码
     * @param account
     * @return
     */
    int updatePassword(Account account);

    /**
     * 按ID查找账户
     * @param id
     * @return
     */
    Account findAccountById(Integer id);

    /**
     * 查找所有用户
     * @return
     */
    List<Account> getAllAccounts();
}