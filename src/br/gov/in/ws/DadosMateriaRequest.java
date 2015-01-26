
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DadosMateriaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosMateriaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conteudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorNorma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="siorgMateria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosMateriaRequest", propOrder = {
    "nup",
    "conteudo",
    "identificadorNorma",
    "siorgMateria"
})
public class DadosMateriaRequest {

    @XmlElement(name = "NUP", required = true)
    protected String nup;
    @XmlElement(required = true)
    protected String conteudo;
    protected int identificadorNorma;
    protected int siorgMateria;

    /**
     * Obtém o valor da propriedade nup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUP() {
        return nup;
    }

    /**
     * Define o valor da propriedade nup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUP(String value) {
        this.nup = value;
    }

    /**
     * Obtém o valor da propriedade conteudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Define o valor da propriedade conteudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConteudo(String value) {
        this.conteudo = value;
    }

    /**
     * Obtém o valor da propriedade identificadorNorma.
     * 
     */
    public int getIdentificadorNorma() {
        return identificadorNorma;
    }

    /**
     * Define o valor da propriedade identificadorNorma.
     * 
     */
    public void setIdentificadorNorma(int value) {
        this.identificadorNorma = value;
    }

    /**
     * Obtém o valor da propriedade siorgMateria.
     * 
     */
    public int getSiorgMateria() {
        return siorgMateria;
    }

    /**
     * Define o valor da propriedade siorgMateria.
     * 
     */
    public void setSiorgMateria(int value) {
        this.siorgMateria = value;
    }

}
