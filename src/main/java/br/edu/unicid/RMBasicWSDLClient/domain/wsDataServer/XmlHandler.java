package br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer;


import java.io.StringReader;
import java.io.StringWriter;
 
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.annotation.DomHandler;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
 
public class XmlHandler implements DomHandler<String, StreamResult> {
 
    private static final String BIO_START_TAG = "<xml>";
    private static final String BIO_END_TAG = "</xml>";
 
    private StringWriter xmlWriter = new StringWriter(); 
 
    public StreamResult createUnmarshaller(ValidationEventHandler errorHandler) {
        return new StreamResult(xmlWriter);
    }
 
    public String getElement(StreamResult rt) {
        String xml = rt.getWriter().toString();
        int beginIndex = xml.indexOf(BIO_START_TAG) + BIO_START_TAG.length();
        int endIndex = xml.indexOf(BIO_END_TAG);
        return xml.substring(beginIndex, endIndex);
    }
 
    public Source marshal(String n, ValidationEventHandler errorHandler) {
        try {
            String xml = BIO_START_TAG + n.trim() + BIO_END_TAG;
            StringReader xmlReader = new StringReader(xml);
            return new StreamSource(xmlReader);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
 
}
