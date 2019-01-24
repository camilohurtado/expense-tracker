/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracker.expense.app.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tracker.expense.app.model.document.User;
import tracker.expense.app.model.repository.UserMongoRepository;
import tracker.expense.app.service.intf.IUserService;

/**
 *
 * @author camilo.hurtado
 */

@Service
public class UserService implements IUserService{
    
    @Autowired
    public UserMongoRepository userMongoRepo;
    
    @Override
    public List<User> getAllUsers() {
        return userMongoRepo.findAll();
    }

    @Override
    public boolean addUpdateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUserById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
