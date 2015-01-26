
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RespostaConsultaTodosMotivosIsencao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RespostaConsultaTodosMotivosIsencao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errointerno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motivoIsencao" type="{http://data.xfire.ws.incom}ArrayOfDadosIdNome"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaConsultaTodosMotivosIsencao", propOrder = {
    "errointerno",
    "motivoIsencao"
})
public class RespostaConsultaTodosMotivosIsencao {

    @XmlElement(required = true)
    protected String errointerno;
    @XmlElement(required = true)
    protected ArrayOfDadosIdNome motivoIsencao;

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
     * Obtém o valor da propriedade motivoIsencao.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDadosIdNome }
     *     
     */
    public ArrayOfDadosIdNome getMotivoIsencao() {
        return motivoIsencao;
    }

    /**
     * Define o valor da propriedade motivoIsencao.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDadosIdNome }
     *     
     */
    public void setMotivoIsencao(ArrayOfDadosIdNome value) {
        this.motivoIsencao = value;
    }

}
