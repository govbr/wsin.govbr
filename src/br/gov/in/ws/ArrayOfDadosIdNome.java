
package br.gov.in.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDadosIdNome complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosIdNome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosIdNome" type="{http://data.xfire.ws.incom}DadosIdNome" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosIdNome", propOrder = {
    "dadosIdNome"
})
public class ArrayOfDadosIdNome {

    @XmlElement(name = "DadosIdNome")
    protected List<DadosIdNome> dadosIdNome;

    /**
     * Gets the value of the dadosIdNome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosIdNome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosIdNome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosIdNome }
     * 
     * 
     */
    public List<DadosIdNome> getDadosIdNome() {
        if (dadosIdNome == null) {
            dadosIdNome = new ArrayList<DadosIdNome>();
        }
        return this.dadosIdNome;
    }

}
