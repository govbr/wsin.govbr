
package br.gov.in.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDadosFeriado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosFeriado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosFeriado" type="{http://data.xfire.ws.incom}DadosFeriado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosFeriado", propOrder = {
    "dadosFeriado"
})
public class ArrayOfDadosFeriado {

    @XmlElement(name = "DadosFeriado")
    protected List<DadosFeriado> dadosFeriado;

    /**
     * Gets the value of the dadosFeriado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosFeriado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosFeriado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosFeriado }
     * 
     * 
     */
    public List<DadosFeriado> getDadosFeriado() {
        if (dadosFeriado == null) {
            dadosFeriado = new ArrayList<DadosFeriado>();
        }
        return this.dadosFeriado;
    }

}
