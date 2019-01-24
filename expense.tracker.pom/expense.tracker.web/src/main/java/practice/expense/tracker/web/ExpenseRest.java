/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.expense.tracker.web;

import expense.tracker.core.service.ExpenseService;
import expense.tracker.model.entity.Expense;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camilo.hurtado
 */

@RestController
@RequestMapping("/expenses")
public class ExpenseRest {
    
    @Autowired
    public ExpenseService expenseService;
    
    @GetMapping()
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }
    
    @PutMapping()
    public void addExpense(@RequestBody Expense expense){
        
        boolean add = expenseService.addExpense(expense);
        
        if(add){
            
            
        }
        
    }
    
        
    
    
}



