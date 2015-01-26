package br.gov.in.ws;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
 
	@Override
    public boolean handleMessage(SOAPMessageContext smc) {
 
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
 
        if (outboundProperty.booleanValue()) {
 
            SOAPMessage message = smc.getMessage();
            
            try {
            	
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                
                SOAPHeader header = envelope.getHeader();
                
                SOAPElement security =
                        header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
 
                SOAPElement usernameToken =
                        security.addChildElement("UsernameToken", "wsse");
                usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
 
                SOAPElement username =
                        usernameToken.addChildElement("Username", "wsse");
            	
                Properties prop = new Properties();
            	String propFileName = "credentials_wsin.properties";
            	            	
            	InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            	 
            	if (inputStream != null) {
            	prop.load(inputStream);
            	
            	String user = prop.getProperty("wsin.user");
            	username.addTextNode(user);
                 
                SOAPElement password =
                        usernameToken.addChildElement("Password", "wsse");
                password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
                
                String pass = prop.getProperty("wsin.pass");
            	
                password.addTextNode(pass);
 
                //Salva as mudanças na mensagem
                message.saveChanges();
         
            	} else {
            		throw new FileNotFoundException("arquivo de propriedade '" + propFileName + "' não encontrado no classpath");
            	}
            	
            } catch (Exception e) {
                e.printStackTrace();
            }
 
        }       

        return outboundProperty;
    }
 
    public Set<QName> getHeaders() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return null;
    }
 
    public boolean handleFault(SOAPMessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }
 
    public void close(MessageContext context) {
    //throw new UnsupportedOperationException("Not supported yet.");
    }
}