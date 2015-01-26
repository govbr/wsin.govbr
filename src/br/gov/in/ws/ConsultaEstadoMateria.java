
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
 *         &lt;element name="dados" type="{http://data.xfire.ws.incom}DadosConsultaEstadoMateria"/>
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
    "dados"
})
@XmlRootElement(name = "ConsultaEstadoMateria", namespace = "http://xfire.ws.incom")
public class ConsultaEstadoMateria {

    @XmlElement(namespace = "http://xfire.ws.incom", required = true)
    protected DadosConsultaEstadoMateria dados;

    /**
     * Obtém o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosConsultaEstadoMateria }
     *     
     */
    public DadosConsultaEstadoMateria getDados() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosConsultaEstadoMateria }
     *     
     */
    public void setDados(DadosConsultaEstadoMateria value) {
        this.dados = value;
    }

}
