/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense.tracker.model.entity;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author camilo.hurtado
 */
public class Expense {
    
    @Id
    private Long id;
    private String name;
    private double value;
    private String desc;
    private Date fromDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        return "[ " + this.id + ", " + this.name + ", " + this.desc + ", " + this.value + ", " + this.fromDate + " ]"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
