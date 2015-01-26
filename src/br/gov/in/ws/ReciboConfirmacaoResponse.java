
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReciboConfirmacaoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReciboConfirmacaoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDMateria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDOficio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReciboConfirmacaoResponse", propOrder = {
    "idMateria",
    "idOficio"
})
public class ReciboConfirmacaoResponse {

    @XmlElement(name = "IDMateria")
    protected int idMateria;
    @XmlElement(name = "IDOficio")
    protected int idOficio;

    /**
     * Obtém o valor da propriedade idMateria.
     * 
     */
    public int getIDMateria() {
        return idMateria;
    }

    /**
     * Define o valor da propriedade idMateria.
     * 
     */
    public void setIDMateria(int value) {
        this.idMateria = value;
    }

    /**
     * Obtém o valor da propriedade idOficio.
     * 
     */
    public int getIDOficio() {
        return idOficio;
    }

    /**
     * Define o valor da propriedade idOficio.
     * 
     */
    public void setIDOficio(int value) {
        this.idOficio = value;
    }

}
