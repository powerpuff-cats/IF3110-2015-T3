
package AnswerWS;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AnswerWS", targetNamespace = "http://controllers/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnswerWS {


    /**
     * 
     * @param uId
     * @param qId
     * @param content
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addNewAnswer", targetNamespace = "http://controllers/", className = "AnswerWS.AddNewAnswer")
    @ResponseWrapper(localName = "addNewAnswerResponse", targetNamespace = "http://controllers/", className = "AnswerWS.AddNewAnswerResponse")
    @Action(input = "http://controllers/AnswerWS/addNewAnswerRequest", output = "http://controllers/AnswerWS/addNewAnswerResponse")
    public int addNewAnswer(
        @WebParam(name = "u_id", targetNamespace = "")
        int uId,
        @WebParam(name = "content", targetNamespace = "")
        String content,
        @WebParam(name = "q_id", targetNamespace = "")
        int qId);

    /**
     * 
     * @param uId
     * @param aId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "voteAnswer", targetNamespace = "http://controllers/", className = "AnswerWS.VoteAnswer")
    @ResponseWrapper(localName = "voteAnswerResponse", targetNamespace = "http://controllers/", className = "AnswerWS.VoteAnswerResponse")
    @Action(input = "http://controllers/AnswerWS/voteAnswerRequest", output = "http://controllers/AnswerWS/voteAnswerResponse")
    public String voteAnswer(
        @WebParam(name = "a_id", targetNamespace = "")
        int aId,
        @WebParam(name = "u_id", targetNamespace = "")
        int uId);

    /**
     * 
     * @param uId
     * @param aId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "devoteAnswer", targetNamespace = "http://controllers/", className = "AnswerWS.DevoteAnswer")
    @ResponseWrapper(localName = "devoteAnswerResponse", targetNamespace = "http://controllers/", className = "AnswerWS.DevoteAnswerResponse")
    @Action(input = "http://controllers/AnswerWS/devoteAnswerRequest", output = "http://controllers/AnswerWS/devoteAnswerResponse")
    public String devoteAnswer(
        @WebParam(name = "a_id", targetNamespace = "")
        int aId,
        @WebParam(name = "u_id", targetNamespace = "")
        int uId);

    /**
     * 
     * @param qId
     * @return
     *     returns java.util.List<AnswerWS.Answer>
     */
    @WebMethod
    @WebResult(name = "Answer", targetNamespace = "")
    @RequestWrapper(localName = "getAnswerByQId", targetNamespace = "http://controllers/", className = "AnswerWS.GetAnswerByQId")
    @ResponseWrapper(localName = "getAnswerByQIdResponse", targetNamespace = "http://controllers/", className = "AnswerWS.GetAnswerByQIdResponse")
    @Action(input = "http://controllers/AnswerWS/getAnswerByQIdRequest", output = "http://controllers/AnswerWS/getAnswerByQIdResponse")
    public List<Answer> getAnswerByQId(
        @WebParam(name = "q_id", targetNamespace = "")
        int qId);

}