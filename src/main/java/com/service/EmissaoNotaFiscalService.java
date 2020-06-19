package com.service;

import com.model.Customer;
import com.model.Product;
import com.notification.EmailNotifier;
  
public class EmissaoNotaFiscalService {
	
	     
	public void emit(Customer customer,Product product) {
		
		EmailNotifier notificador = new EmailNotifier();
		notificador.send(customer, "Nota fiscal do produto" 
							+ product.getName()+ " foi emitido");
	}
}
