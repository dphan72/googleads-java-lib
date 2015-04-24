
package com.google.api.ads.adwords.jaxws.v201502.mcm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201502.cm.Selector;


/**
 * 
 *       Service for creating, editing, and deleting labels that can be applied to managed customers.
 *       
 *       <p>This service should only ever return/accept labels that are accessible by the authenticated
 *       user.  Labels created by a manager are not accessible to any customers managed
 *       by this manager.  Only manager customers may create these labels.
 *       
 *       <p>To apply a label to a managed customer, see
 *       {@link com.google.ads.api.services.mcm.customer.ManagedCustomerService#mutateLabel}.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AccountLabelServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201502.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201502.mcm.ObjectFactory.class
})
public interface AccountLabelServiceInterface {


    /**
     * 
     *         Returns a list of labels specified by the selector for the authenticated user.
     *         
     *         @param selector filters the list of labels to return
     *         @return response containing lists of labels that meet all the criteria of the selector
     *         @throws ApiException if a problem occurs fetching the information requested
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201502.mcm.AccountLabelPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.mcm.AccountLabelServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.mcm.AccountLabelServiceInterfacegetResponse")
    public AccountLabelPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502")
        Selector selector)
        throws ApiException
    ;

    /**
     * 
     *         Possible actions:
     *         <ul>
     *         <li> Create a new label - create a new {@link Label} and call mutate with ADD operator
     *         <li> Edit the label name - set the appropriate fields in your {@linkplain Label} and call
     *         mutate with the SET operator. Null fields will be interpreted to mean "no change"
     *         <li> Delete the label - call mutate with REMOVE operator
     *         </ul>
     *         
     *         @param operations list of unique operations to be executed in a single transaction, in the
     *         order specified.
     *         @return the mutated labels, in the same order that they were in as the parameter
     *         @throws ApiException if problems occurs while modifying label information
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201502.mcm.AccountLabelReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.mcm.AccountLabelServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.mcm.AccountLabelServiceInterfacemutateResponse")
    public AccountLabelReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502")
        List<AccountLabelOperation> operations)
        throws ApiException
    ;

}
