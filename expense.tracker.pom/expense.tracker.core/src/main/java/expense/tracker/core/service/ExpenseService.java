/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense.tracker.core.service;

import expense.tracker.model.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import expense.tracker.model.repository.ExpenseMongoRepository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author camilo.hurtado
 */
@Service
public class ExpenseService {
    
    @Autowired
    public ExpenseMongoRepository expenseMongoRepo;
    
    
    /**
     * <h3>Obtener todos los gastos</h3>
     * <p>Se obtienen todos los gastos</p>
     * @return 
     */
    public List<Expense> getAllExpenses(){
        
        return expenseMongoRepo.findAll();
    
    }
    
    public boolean addExpense(Expense expense){
        
        if(expense != null){
            
            if(!expenseMongoRepo.existsById(expense.getId())){

                expenseMongoRepo.save(expense);
                return true;
            }
            
        }
        
        return false;
    }
    
    
}
