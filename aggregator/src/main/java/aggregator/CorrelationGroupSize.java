package aggregator;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
/**
 * Set CorrelationGroupSize when this size of Messages is reached is not necessary to wait for time out.
 * 
 * @author christianhenle
 *
 */
public class CorrelationGroupSize implements Callable {


	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage muleMessage = eventContext.getMessage();
		//-1 for Default Bank
		Integer availableBankNumber = 2;//Integer.parseInt(muleMessage.getInvocationProperty("bankNumber").toString())-1;
		
		muleMessage.setCorrelationGroupSize(availableBankNumber);
		
		//System.out.println("bankNumber "+muleMessage.getInvocationProperty("bankNumber"));
		
		
		return muleMessage;
	}

}
