
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosOficioConfirmacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosOficioConfirmacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDTransacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataPublicacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="empenho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorJornal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="identificadorTipoPagamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="materia" type="{http://data.xfire.ws.incom}ArrayOfDadosMateriaRequest"/>
 *         &lt;element name="motivoIsencao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosOficioConfirmacao", propOrder = {
    "cpf",
    "idTransacao",
    "ug",
    "dataPublicacao",
    "empenho",
    "identificadorJornal",
    "identificadorTipoPagamento",
    "materia",
    "motivoIsencao"
})
public class DadosOficioConfirmacao {

    @XmlElement(name = "CPF", required = true)
    protected String cpf;
    @XmlElement(name = "IDTransacao", required = true)
    protected String idTransacao;
    @XmlElement(name = "UG", required = true)
    protected String ug;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPublicacao;
    @XmlElement(required = true)
    protected String empenho;
    protected int identificadorJornal;
    protected int identificadorTipoPagamento;
    @XmlElement(required = true)
    protected ArrayOfDadosMateriaRequest materia;
    protected int motivoIsencao;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade idTransacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTransacao() {
        return idTransacao;
    }

    /**
     * Define o valor da propriedade idTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTransacao(String value) {
        this.idTransacao = value;
    }

    /**
     * Obtém o valor da propriedade ug.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUG() {
        return ug;
    }

    /**
     * Define o valor da propriedade ug.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUG(String value) {
        this.ug = value;
    }

    /**
     * Obtém o valor da propriedade dataPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * Define o valor da propriedade dataPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPublicacao(XMLGregorianCalendar value) {
        this.dataPublicacao = value;
    }

    /**
     * Obtém o valor da propriedade empenho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpenho() {
        return empenho;
    }

    /**
     * Define o valor da propriedade empenho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpenho(String value) {
        this.empenho = value;
    }

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

    /**
     * Obtém o valor da propriedade identificadorTipoPagamento.
     * 
     */
    public int getIdentificadorTipoPagamento() {
        return identificadorTipoPagamento;
    }

    /**
     * Define o valor da propriedade identificadorTipoPagamento.
     * 
     */
    public void setIdentificadorTipoPagamento(int value) {
        this.identificadorTipoPagamento = value;
    }

    /**
     * Obtém o valor da propriedade materia.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDadosMateriaRequest }
     *     
     */
    public ArrayOfDadosMateriaRequest getMateria() {
        return materia;
    }

    /**
     * Define o valor da propriedade materia.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDadosMateriaRequest }
     *     
     */
    public void setMateria(ArrayOfDadosMateriaRequest value) {
        this.materia = value;
    }

    /**
     * Obtém o valor da propriedade motivoIsencao.
     * 
     */
    public int getMotivoIsencao() {
        return motivoIsencao;
    }

    /**
     * Define o valor da propriedade motivoIsencao.
     * 
     */
    public void setMotivoIsencao(int value) {
        this.motivoIsencao = value;
    }

}
