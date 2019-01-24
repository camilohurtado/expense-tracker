/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracker.expense.app.service.impl;

import tracker.expense.app.model.document.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tracker.expense.app.model.repository.ExpenseMongoRepository;
import java.util.List;
import tracker.expense.app.service.intf.IExpenseService;

/**
 *
 * @author camilo.hurtado
 */
@Service
public class ExpenseService implements IExpenseService {

    @Autowired
    public ExpenseMongoRepository expenseMongoRepo;

    /**
     * <h3>Obtener todos los gastos</h3>
     * <p>
     * Se obtienen todos los gastos</p>
     *
     * @return
     */
    @Override
    public List<Track> getAllExpenses() {

        return expenseMongoRepo.findAll();

    }

    @Override
    public boolean addUpdateExpense(Track expense) {

        if (expense != null) {

            expenseMongoRepo.save(expense);
            return true;
        }

        return false;
    }

    @Override
    public Track getExpenseById(String id) {
        
        return expenseMongoRepo.findById(id).get();
    }
    
    
    
}
