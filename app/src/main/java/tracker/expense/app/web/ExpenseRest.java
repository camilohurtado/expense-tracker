/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracker.expense.app.web;

import tracker.expense.app.service.intf.IExpenseService;
import tracker.expense.app.model.document.Track;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import tracker.expense.app.model.document.User;

/**
 *
 * @author camilo.hurtado
 */

@RestController
@RequestMapping("/expenses")
public class ExpenseRest {
    
    @Autowired
    public IExpenseService expenseService;
    
    @GetMapping()
    public List<Track> getAllExpenses(){
        
        return expenseService.getAllExpenses();
    }
    
    
    @PostMapping()
    @PutMapping()
    public void addExpense(@RequestBody Track expense){
        
        boolean add = expenseService.addUpdateExpense(expense);
        
        //add logging
        
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Track> getExpenseByValue(@PathVariable(name = "id") String id){
    
        return new ResponseEntity<>(expenseService.getExpenseById(id), HttpStatus.ACCEPTED);
    
    }    
    
    
}


