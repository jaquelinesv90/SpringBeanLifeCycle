package com.main;

import com.model.Customer;
import com.notification.Notifier;
import com.notification.SmsNotifier;
import com.service.CustomerActivationService;

public class Main {
	
	public static void main(String args[]) {
		Customer cliente1 = new Customer("Joao","joao@email.com","78879879");
		Customer cliente2 = new Customer("Maria","maria@email.com","9008888");
		
		Notifier notificador = new SmsNotifier();
		
		CustomerActivationService ativacao = new CustomerActivationService(notificador);
		ativacao.ativar(cliente1);
		ativacao.ativar(cliente2);
	}
}
