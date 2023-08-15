package edu.poly.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.dao.AccountDAO;
import edu.poly.entity.Account;


@Service
public class UserService {
    
    @Autowired
    private AccountDAO userRepository;

    public boolean isUserExist(String mand) {
        return userRepository.existsByMand(mand);
    }

    public void createAccount(Account account) {
        // thực hiện các công việc liên quan đến lưu trữ người dùng trong cơ sở dữ liệu, chẳng hạn như mã hóa mật khẩu
        // ví dụ: userRepository.save(user);
    	userRepository.save(account);
    }
}