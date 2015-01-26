
package br.gov.in.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDadosMateriaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosMateriaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosMateriaRequest" type="{http://data.xfire.ws.incom}DadosMateriaRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosMateriaRequest", propOrder = {
    "dadosMateriaRequest"
})
public class ArrayOfDadosMateriaRequest {

    @XmlElement(name = "DadosMateriaRequest")
    protected List<DadosMateriaRequest> dadosMateriaRequest;

    /**
     * Gets the value of the dadosMateriaRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosMateriaRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosMateriaRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosMateriaRequest }
     * 
     * 
     */
    public List<DadosMateriaRequest> getDadosMateriaRequest() {
        if (dadosMateriaRequest == null) {
            dadosMateriaRequest = new ArrayList<DadosMateriaRequest>();
        }
        return this.dadosMateriaRequest;
    }

}
