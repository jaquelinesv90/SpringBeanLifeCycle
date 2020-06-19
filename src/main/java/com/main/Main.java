package com.main;

import com.model.Customer;
import com.notification.Notifier;
import com.notification.SmsNotifier;
import com.service.CustomerActivationService;

/*
* Verificar a classe CustomerActivationService para informações
*/  


public class Main {  
	
	public static void main(String args[]) {
		Customer cliente1 = new Customer("Joao","joao@email.com","78879879");
		Customer cliente2 = new Customer("Maria","maria@email.com","9008888");
		
		Notifier notificador = new SmsNotifier();
		
		CustomerActivationService ativacao = new CustomerActivationService();
		ativacao.ativar(cliente1);
		ativacao.ativar(cliente2);
	}
}
