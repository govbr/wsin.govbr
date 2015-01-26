
package br.gov.in.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDadosAcompanhamentoMateria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosAcompanhamentoMateria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosAcompanhamentoMateria" type="{http://data.xfire.ws.incom}DadosAcompanhamentoMateria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosAcompanhamentoMateria", propOrder = {
    "dadosAcompanhamentoMateria"
})
public class ArrayOfDadosAcompanhamentoMateria {

    @XmlElement(name = "DadosAcompanhamentoMateria")
    protected List<DadosAcompanhamentoMateria> dadosAcompanhamentoMateria;

    /**
     * Gets the value of the dadosAcompanhamentoMateria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosAcompanhamentoMateria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosAcompanhamentoMateria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosAcompanhamentoMateria }
     * 
     * 
     */
    public List<DadosAcompanhamentoMateria> getDadosAcompanhamentoMateria() {
        if (dadosAcompanhamentoMateria == null) {
            dadosAcompanhamentoMateria = new ArrayList<DadosAcompanhamentoMateria>();
        }
        return this.dadosAcompanhamentoMateria;
    }

}
