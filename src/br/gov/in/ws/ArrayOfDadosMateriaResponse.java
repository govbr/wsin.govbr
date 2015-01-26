
package br.gov.in.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDadosMateriaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosMateriaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosMateriaResponse" type="{http://data.xfire.ws.incom}DadosMateriaResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosMateriaResponse", propOrder = {
    "dadosMateriaResponse"
})
public class ArrayOfDadosMateriaResponse {

    @XmlElement(name = "DadosMateriaResponse")
    protected List<DadosMateriaResponse> dadosMateriaResponse;

    /**
     * Gets the value of the dadosMateriaResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosMateriaResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosMateriaResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosMateriaResponse }
     * 
     * 
     */
    public List<DadosMateriaResponse> getDadosMateriaResponse() {
        if (dadosMateriaResponse == null) {
            dadosMateriaResponse = new ArrayList<DadosMateriaResponse>();
        }
        return this.dadosMateriaResponse;
    }

}
