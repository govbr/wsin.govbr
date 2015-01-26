
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RespostaReagendaOficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RespostaReagendaOficio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errointerno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validaReagendamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaReagendaOficio", propOrder = {
    "errointerno",
    "validaReagendamento"
})
public class RespostaReagendaOficio {

    @XmlElement(required = true)
    protected String errointerno;
    @XmlElement(required = true)
    protected String validaReagendamento;

    /**
     * Obtém o valor da propriedade errointerno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrointerno() {
        return errointerno;
    }

    /**
     * Define o valor da propriedade errointerno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrointerno(String value) {
        this.errointerno = value;
    }

    /**
     * Obtém o valor da propriedade validaReagendamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidaReagendamento() {
        return validaReagendamento;
    }

    /**
     * Define o valor da propriedade validaReagendamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidaReagendamento(String value) {
        this.validaReagendamento = value;
    }

}
