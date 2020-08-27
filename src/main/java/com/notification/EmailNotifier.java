package com.notification;
    
import org.springframework.stereotype.Component;

import com.model.Customer;
      
@NotificationType(UrgencyLevel.PRIORITY)
@Component
public class EmailNotifier implements Notifier{
	       
	@Override
	public void send(Customer customer, String message) {
		System.out.printf("notificando %s atrav�s do e-mail %s da mensagem %s \n",
				customer.getName(),customer.getEmail(),message);
	}
}
