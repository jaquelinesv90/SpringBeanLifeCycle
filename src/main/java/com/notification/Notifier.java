package com.notification;

import com.model.Customer;


public interface Notifier {

		void send(Customer customer,String message);
		
}
