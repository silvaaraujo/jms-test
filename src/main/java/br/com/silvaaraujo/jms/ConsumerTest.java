package br.com.silvaaraujo.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(
	activationConfig = {
		@ActivationConfigProperty(propertyName="destinationLookup", propertyValue="jms/testJmsQueue"),
		@ActivationConfigProperty(propertyName="destinationType", propertyValue="javax.jms.Queue")
	}
)
public class ConsumerTest implements MessageListener {

	@Override
	public void onMessage(Message message) {
		String msg = null;
		try {
			msg = message.getBody(String.class);
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
		System.out.println("*************** CONTEUDO DA MENSAGEM RECEBIDA: " + msg);
	}

}
