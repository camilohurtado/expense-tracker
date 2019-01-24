/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracker.expense.app.service.intf;

import java.util.List;
import tracker.expense.app.model.document.Track;

/**
 *
 * @author camilo.hurtado
 */
public interface IExpenseService {
    
    public List<Track> getAllExpenses();
    
    public boolean addUpdateExpense(Track expense);
    
    public Track getExpenseById(String id);
   
    
}
