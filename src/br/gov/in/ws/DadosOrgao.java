
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DadosOrgao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosOrgao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorSIORG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="identificadorSIORGPai" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomeOrgao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosOrgao", propOrder = {
    "identificadorSIORG",
    "identificadorSIORGPai",
    "nomeOrgao"
})
public class DadosOrgao {

    protected int identificadorSIORG;
    protected int identificadorSIORGPai;
    @XmlElement(required = true)
    protected String nomeOrgao;

    /**
     * Obtém o valor da propriedade identificadorSIORG.
     * 
     */
    public int getIdentificadorSIORG() {
        return identificadorSIORG;
    }

    /**
     * Define o valor da propriedade identificadorSIORG.
     * 
     */
    public void setIdentificadorSIORG(int value) {
        this.identificadorSIORG = value;
    }

    /**
     * Obtém o valor da propriedade identificadorSIORGPai.
     * 
     */
    public int getIdentificadorSIORGPai() {
        return identificadorSIORGPai;
    }

    /**
     * Define o valor da propriedade identificadorSIORGPai.
     * 
     */
    public void setIdentificadorSIORGPai(int value) {
        this.identificadorSIORGPai = value;
    }

    /**
     * Obtém o valor da propriedade nomeOrgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOrgao() {
        return nomeOrgao;
    }

    /**
     * Define o valor da propriedade nomeOrgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOrgao(String value) {
        this.nomeOrgao = value;
    }

}
