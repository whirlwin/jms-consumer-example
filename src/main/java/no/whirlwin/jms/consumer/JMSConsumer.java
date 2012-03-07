package no.whirlwin.jms.consumer;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * 
 * @author whirlwin
 *
 */
@MessageDriven(mappedName = "jms/JMSConsumer")
public class JMSConsumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println("foobsa");
    }
}