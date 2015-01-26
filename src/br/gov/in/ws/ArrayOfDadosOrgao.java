
package br.gov.in.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDadosOrgao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosOrgao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosOrgao" type="{http://data.xfire.ws.incom}DadosOrgao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosOrgao", propOrder = {
    "dadosOrgao"
})
public class ArrayOfDadosOrgao {

    @XmlElement(name = "DadosOrgao")
    protected List<DadosOrgao> dadosOrgao;

    /**
     * Gets the value of the dadosOrgao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosOrgao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosOrgao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosOrgao }
     * 
     * 
     */
    public List<DadosOrgao> getDadosOrgao() {
        if (dadosOrgao == null) {
            dadosOrgao = new ArrayList<DadosOrgao>();
        }
        return this.dadosOrgao;
    }

}
