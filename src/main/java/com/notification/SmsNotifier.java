package com.notification;

import org.springframework.stereotype.Component;

import com.model.Customer;

@NotificationType(UrgencyLevel.NORMAL)
@Component
public class SmsNotifier implements Notifier{
	 
	@Override
	public void send(Customer customer,String message) {
		System.out.printf("Notificando %s por SMS atrav�s do telefone %s: %s \n",
				customer.getName(), customer.getTelephone(), message);
	}

}
