/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracker.expense.app.service.intf;

import java.util.List;
import tracker.expense.app.model.document.User;

/**
 *
 * @author camilo.hurtado
 */
public interface IUserService {
    
    public List<User> getAllUsers();
    
    public boolean addUpdateUser(User user);
    
    public User getUserById(String id);
}
