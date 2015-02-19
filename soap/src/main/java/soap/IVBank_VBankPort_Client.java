
package soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-02-19T15:43:20.794+01:00
 * Generated source version: 2.5.1
 * 
 */
public final class IVBank_VBankPort_Client {

    private static final QName SERVICE_NAME = new QName("http://vbank.hfu.de/", "VBankService");

    private IVBank_VBankPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = VBankService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        VBankService ss = new VBankService(wsdlURL, SERVICE_NAME);
        IVBank port = ss.getVBankPort();  
        
        {
        System.out.println("Invoking getCreditRate...");
        double _getCreditRate_arg0 = 0.0;
        int _getCreditRate_arg1 = 0;
        java.lang.String _getCreditRate_arg2 = "";
        java.lang.Double _getCreditRate__return = port.getCreditRate(_getCreditRate_arg0, _getCreditRate_arg1, _getCreditRate_arg2);
        System.out.println("getCreditRate.result=" + _getCreditRate__return);


        }

        System.exit(0);
    }

}
