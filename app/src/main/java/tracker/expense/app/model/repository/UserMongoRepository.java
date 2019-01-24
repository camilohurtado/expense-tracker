/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracker.expense.app.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tracker.expense.app.model.document.User;

/**
 *
 * @author camilo.hurtado
 */
public interface UserMongoRepository extends MongoRepository<User, String>{
    
}
