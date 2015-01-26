
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RespostaConsultaAcompanhamentoOficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RespostaConsultaAcompanhamentoOficio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acompanhamentoOficio" type="{http://data.xfire.ws.incom}DadosAcompanhamentoOficio"/>
 *         &lt;element name="errointerno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoIdOficio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaConsultaAcompanhamentoOficio", propOrder = {
    "acompanhamentoOficio",
    "errointerno",
    "validacaoIdOficio"
})
public class RespostaConsultaAcompanhamentoOficio {

    @XmlElement(required = true)
    protected DadosAcompanhamentoOficio acompanhamentoOficio;
    @XmlElement(required = true)
    protected String errointerno;
    @XmlElement(required = true)
    protected String validacaoIdOficio;

    /**
     * Obtém o valor da propriedade acompanhamentoOficio.
     * 
     * @return
     *     possible object is
     *     {@link DadosAcompanhamentoOficio }
     *     
     */
    public DadosAcompanhamentoOficio getAcompanhamentoOficio() {
        return acompanhamentoOficio;
    }

    /**
     * Define o valor da propriedade acompanhamentoOficio.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosAcompanhamentoOficio }
     *     
     */
    public void setAcompanhamentoOficio(DadosAcompanhamentoOficio value) {
        this.acompanhamentoOficio = value;
    }

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
     * Obtém o valor da propriedade validacaoIdOficio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoIdOficio() {
        return validacaoIdOficio;
    }

    /**
     * Define o valor da propriedade validacaoIdOficio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoIdOficio(String value) {
        this.validacaoIdOficio = value;
    }

}
