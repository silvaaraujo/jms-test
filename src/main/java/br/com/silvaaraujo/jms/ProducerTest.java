package br.com.silvaaraujo.jms;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;

@Stateless
public class ProducerTest {

	@Resource(lookup="jms/testJmsFactory")
	private ConnectionFactory factory;
	
	@Resource(lookup="jms/testJmsQueue")
	private Queue queue;
	
	@PostConstruct
	public void produzirMensagem() {
		
		//Um recurso muito legal adicionado no javase7 - try-with-resources 
		//todo recurso aberto desta forma é fechado automaticamente ao final de sua execucao.
		//https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		try (JMSContext context = this.factory.createContext();) {
			
			JMSProducer producer = context.createProducer();
			
			for (int i = 0; i < 100; i++) {
				
				//Se vc deseja eh possivel especificar um nivel de prioridade, caso nao especifique a prioridade padrao é 4
				//Existem 10 niveis de prioridade: 0 (menor) a 9(maior).
				//https://docs.oracle.com/javaee/7/tutorial/jms-concepts004.htm#BNCFZ
				producer.setPriority(4);
				
				System.out.println("Enviando mensagem ["+i+"]");
				producer.send(this.queue, "Message ["+i+"]");
			}
		}
	}
	
}