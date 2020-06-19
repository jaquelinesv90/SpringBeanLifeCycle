package com.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Customer;
import com.notification.NotificationType;
import com.notification.Notifier;
import com.notification.UrgencyLevel;
/**
 ciclo de vida são as fases desde a existencia deste bean(surgimento)
 da instancia deste bean, até onde ele deixa de existir no container.
 tem 3 fases: inicialização, uso, destruição;
 
 Podemos implementar métodos de callback(chamada) dos ciclos de vida,
 esses métodos nós declaramos e eles são chamados pelo próprio container
 quando passa por alguma fase do ciclo.

 Quando você usa injeção de dependência baseada em setter, o método
 init torna possível executar a inicialização: o método especificado 
 será chamado depois que todos os seter forem chamados.

 nos métodos de injeção baseados em setter, os métodos serão chamados na seguinte ordem:
 - construtor padrão
 - os setters correspondentes a cada <propriedade> do bean
 - o método init, e especificado  nos métodos de injeção baseados em construtores,
 os métodos serão chamados na seguinte ordem:
 - o construtor correspondente
 - o método init, se especificado.
 
 
 neste projeto existem 3 formas de implementar o callback
 1 - utilizando os métodos init e destroy e suas anotações
 2 - criando uma classe de configuração com @bean no metodo
 3 - adicionar implements InitializingBean-DisposableBean e implementar o 
 metodo afterPropertiesSet
 
*/
//@Component
public class CustomerActivationService implements InitializingBean, DisposableBean {
	  
	@NotificationType(UrgencyLevel.NORMAL)
	@Autowired
	private Notifier notifier;
	
	
	//metodos de callback
	//@PostConstruct
	public void init() {
		System.out.println("INIT");
	}
	//@PreDestroy
	public void destroy() {
		System.out.println("PRE DESTROY");
	}
	
	
	public void ativar(Customer customer) {
		customer.activate();
		
		this.notifier.send(customer,": Seu cadastro no sistema est� ativo!");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
