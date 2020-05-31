package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Customer;
import com.notification.NotificationType;
import com.notification.Notifier;
import com.notification.UrgencyLevel;

@Component
public class CustomerActivationService {
	
	@NotificationType(UrgencyLevel.NORMAL)
	@Autowired
	private Notifier notifier;
	
	public CustomerActivationService(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void ativar(Customer customer) {
		customer.activate();
		
		this.notifier.send(customer,": Seu cadastro no sistema est� ativo!");
	}
}
