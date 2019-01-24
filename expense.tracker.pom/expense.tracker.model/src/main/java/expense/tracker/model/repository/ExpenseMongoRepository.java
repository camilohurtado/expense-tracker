/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense.tracker.model.repository;

import expense.tracker.model.entity.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author camilo.hurtado
 */
public interface ExpenseMongoRepository extends MongoRepository<Expense, Long>{
//public interface ExpenseMongoRepository{    
    
}
