# WSIN.govbr

Biblioteca para acessar o webservice da Imprensa Nacional para publicação e acompanhamento de envio de matérias para o Diário Oficial da União conforme [documentação do webservice](http://catalogo.governoeletronico.gov.br/). Essa biblioteca foi compilada para Java 7.
Para mais informações sobre essa biblioteca veja a [documentação de uso](http://govbr.github.io/wsin.govbr).


# Exemplo de uso da biblioteca

A biblioteca deve estar no classpath da sua aplicação e deve existir um arquivo chamado __credentials_wsin.properties__ com seu usuário e senha para acessar o sistema.

## Exemplo simples

Com o jar na raiz execute o seguinte código no terminal:

		> java -cp wsin_govbr_1.0.0.jar:.:example/ example.Principal

Onde o Principal.java que está dentro da pasta _example_ é:

```java
package example;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import br.gov.in.ws.ArrayOfDadosOrgao;
import br.gov.in.ws.DadosOrgao;
import br.gov.in.ws.RespostaConsultaTodosOrgaosPermitidos;
import br.gov.in.ws.ServicoIN;
import br.gov.in.ws.ServicoINPortType;

public class Principal {

    public static void main( String[] args) {
        try {
			new Principal().callWebService();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    private void callWebService() throws DatatypeConfigurationException, IOException {

        ServicoIN servicoIN = new ServicoIN(new URL("https://homologwsincom.in.gov.br/services/servicoIN?wsdl"));
        
        ServicoINPortType servicoINPortType = servicoIN.getServicoINHttpPort();
        
        RespostaConsultaTodosOrgaosPermitidos respostaConsultaTodosOrgaosPermitidos = servicoINPortType.consultaTodosOrgaosPermitidos();
        
        ArrayOfDadosOrgao arrayOfDadosOrgao = respostaConsultaTodosOrgaosPermitidos.getOrgao();
        
        List<DadosOrgao> arrayListDadosOrgao =  arrayOfDadosOrgao.getDadosOrgao();
        
        for (DadosOrgao dadosOrgao : arrayListDadosOrgao) {
			System.out.print("Nome: "+dadosOrgao.getNomeOrgao()+" - ");
			System.out.println("IDSiorg: "+dadosOrgao.getIdentificadorSIORG());
		}
   }
}
```

Dentro da pasta _example_ possui um arquivo chamado de credentials_wsin.properties que contem duas propriedades:

```
#User - Substitua pelo login e senha correto.
wsin.user=_meu_usuario_
wsin.pass=_senha_do_usuario_
```

O programa irá listar todos os órgãos permitidos para acesso ao diário oficial da união.

## Exemplo de envio de matéria

```java
	    DadosOficioPreview dados = new DadosOficioPreview();
        
        GregorianCalendar gregcalendar = new GregorianCalendar();
        ArrayOfDadosMateriaRequest arrayOfDadosMateriaRequest = new ArrayOfDadosMateriaRequest();
        
        DadosMateriaRequest dadosMateriaRequest = new DadosMateriaRequest();
        
        dadosMateriaRequest.setConteudo("{\\rtf1\\ansi\\deff0{\\fonttbl{\\f0 Times New Roman;}}{##ATO EXTRATO DE CONV\\u202?NIO\\par}{Esp\\u233?cie: Conv\\u234?nio N\\u186? 900511/2011. N\\u186? Processo: 23628073161201373. Convenentes: ASSOCIACAO DAS OBRAS PAVONIANAS DE ASSISTENCIAConcedente : MINISTERIO DO PLANEJAMENTO, ORCAMENTO E GESTAO, Unidade Gestora: 201013, Gest\\u227?o: 00001. Convenente : ASSOCIACAO DAS OBRAS PAVONIANAS DE ASSISTENCIA, CNPJ n\\u186? 62382395000604. Homologa\\u231?\\u227?o de Comprovantes de Execu\\u231?\\u227?o. Valor Total: R$ 100.000,00, Valor de Contrapartida: R$ 10.000,00, Valor a ser transferido ou descentralizado no exerc\\u237?cio em curso : R$ 90.000,00, Vig\\u234?ncia: 26/12/2011 a 26/12/2012. Data de Assinatura: 26/12/2011. Signat\\u225?rios: Concedente : CONCEDENTE PESSOA, CPF n\\u186? 111.111.111-11, Convenente : CONVENENTE PESSOA, CPF n\\u186? 999.999.999-99, \\par}}");
        dadosMateriaRequest.setNUP("23628073161201373");
        dadosMateriaRequest.setIdentificadorNorma(104);
        dadosMateriaRequest.setSiorgMateria(3236);
        
        arrayOfDadosMateriaRequest.getDadosMateriaRequest().add(dadosMateriaRequest);
        
        dados.setCPF("11111111111");
        dados.setDataPublicacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregcalendar));
        dados.setMateria(arrayOfDadosMateriaRequest);
        dados.setIdentificadorJornal(1);
        dados.setUG("2256");
        dados.setEmpenho("2015NE000123");
        dados.setIdentificadorTipoPagamento(89);
        
        
        
        ValidacaoPreview validacaoPreview = servicoINPortType.oficioPreview(dados);
        
        ArrayOfDadosMateriaResponse arrayOfDadosMateriaResponse = validacaoPreview.getPublicacaoPreview();
        List<DadosMateriaResponse> dadosMateriaResponses = arrayOfDadosMateriaResponse.getDadosMateriaResponse();
        String pdf = null;
        for (DadosMateriaResponse dadosMateriaResponse : dadosMateriaResponses) {
        	pdf = dadosMateriaResponse.getPdf();
            Decoder decoder = Base64.getMimeDecoder();
            byte[] decodedBytes = decoder.decode(pdf.getBytes(StandardCharsets.UTF_8));

            File file = new File("preview_materia.pdf");;
            FileOutputStream fop = new FileOutputStream(file);

            fop.write(decodedBytes);
            fop.flush();
            fop.close();

		}

```
O programa irá enviar a matéria e salvar o preview em pdf com o nome __preview_materia.pdf__. Caso a matéria esteja correta deve-se confirmar o envio da matéria:

```java
		servicoINPortType.oficioConfirmacao(dadosOficioConfirmacao);
```

E deve-se preencher os dados de confirmação conforme a documentação no item __4.2. Interface de Confirmação de envio de Ofício__

>Atenção de o RTF deve estar conforme [portaria 268 de 2009 da Imprensa Nacional](http://portal.in.gov.br/servicos/legislacao-de-publicacao/portaria-no-268.pdf)

