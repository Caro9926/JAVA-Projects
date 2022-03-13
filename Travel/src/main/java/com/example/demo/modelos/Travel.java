package com.example.demo.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="travels")
public class Travel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 5, max = 200, message = "Expense name must be at least 5 characters long")
    private String expense; //Puedo colocar los mensajes para que se restrinjan 
    @NotNull
    @Size(min = 5, max = 200, message = "Vendor name must be at least 5 characters long")
    private String vendor;
    @NotNull
    @Size(min = 10, max = 500, message = "Description name must be at least 10 characters long")
    private String description;
    @NotNull
    @Min(5)
    private Double amount;
    // Esto no permitirá que la columna createdAt se actualice después de la creación
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    public Travel() {  //No te olvides de colocar esto
    }


	public Travel(Long id, @NotNull @Size(min = 5, max = 200) String expense,
			@NotNull @Size(min = 5, max = 200) String vendor, @NotNull @Size(min = 10, max = 500) String description,
			@NotNull @Min(5) Double amount, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.expense = expense;
		this.vendor = vendor;
		this.description = description;
		this.amount = amount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getExpense() {
		return expense;
	}


	public void setExpense(String expense) {
		this.expense = expense;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
	 @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	 @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }

}
