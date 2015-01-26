
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificadorJornal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identificadorJornal"
})
@XmlRootElement(name = "ConsultaNormas", namespace = "http://xfire.ws.incom")
public class ConsultaNormas {

    @XmlElement(name = "IdentificadorJornal", namespace = "http://xfire.ws.incom")
    protected int identificadorJornal;

    /**
     * Obtém o valor da propriedade identificadorJornal.
     * 
     */
    public int getIdentificadorJornal() {
        return identificadorJornal;
    }

    /**
     * Define o valor da propriedade identificadorJornal.
     * 
     */
    public void setIdentificadorJornal(int value) {
        this.identificadorJornal = value;
    }

}
