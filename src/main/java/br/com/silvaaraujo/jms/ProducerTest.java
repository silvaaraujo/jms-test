package br.com.silvaaraujo.jms;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;

@Singleton
@Startup
public class ProducerTest {

	@Resource(lookup="jms/testJmsFactory")
	private ConnectionFactory factory;
	
	@Resource(lookup="jms/testJmsQueue")
	private Queue queue;
	
	@PostConstruct
	public void produzirMensagem() {
		
		//Um recurso muito legal adicionado no javase7 - try-with-resources
		//https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		try (JMSContext context = this.factory.createContext();) {
			
			JMSProducer producer = context.createProducer();
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Enviando mensagem ["+i+"]");
				producer.send(this.queue, "Message ["+i+"]");
			}
		}
	}
	
}