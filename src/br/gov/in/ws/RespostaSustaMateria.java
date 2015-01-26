
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RespostaSustaMateria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RespostaSustaMateria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errointerno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validaSustacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaSustaMateria", propOrder = {
    "errointerno",
    "validaSustacao"
})
public class RespostaSustaMateria {

    @XmlElement(required = true)
    protected String errointerno;
    @XmlElement(required = true)
    protected String validaSustacao;

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
     * Obtém o valor da propriedade validaSustacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidaSustacao() {
        return validaSustacao;
    }

    /**
     * Define o valor da propriedade validaSustacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidaSustacao(String value) {
        this.validaSustacao = value;
    }

}
