
package br.gov.in.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDadosMateriaCompletaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosMateriaCompletaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosMateriaCompletaResponse" type="{http://data.xfire.ws.incom}DadosMateriaCompletaResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosMateriaCompletaResponse", propOrder = {
    "dadosMateriaCompletaResponse"
})
public class ArrayOfDadosMateriaCompletaResponse {

    @XmlElement(name = "DadosMateriaCompletaResponse")
    protected List<DadosMateriaCompletaResponse> dadosMateriaCompletaResponse;

    /**
     * Gets the value of the dadosMateriaCompletaResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosMateriaCompletaResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosMateriaCompletaResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosMateriaCompletaResponse }
     * 
     * 
     */
    public List<DadosMateriaCompletaResponse> getDadosMateriaCompletaResponse() {
        if (dadosMateriaCompletaResponse == null) {
            dadosMateriaCompletaResponse = new ArrayList<DadosMateriaCompletaResponse>();
        }
        return this.dadosMateriaCompletaResponse;
    }

}
