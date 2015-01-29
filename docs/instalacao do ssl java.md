# Problemas ao se conectar devido a falta de certificado SSL

O certificado ICP-Brasil não é instalado por default nos browsers e nos Sistemas Operacionais.[1][1] Portanto é necessário instalar manualmente o certificado do ambiente de homologação e produção do serviço do WSIN.govbr.

Para o ambiente Java podemos seguir os seguintes passos:

## 1. Instalar o InstallCert.java 

Abrir um terminal e digitar:
```
mkdir InstallCert
cd InstallCert
wget http://opentox.ntua.gr/files/InstallCert.zip
unzip InstallCert
```
## 2. Compilar o InstallCert

No terminal:
```
javac InstallCert
```
## 3. Executar o InstallCert

No terminal para o de homologação:
```
java InstallCert homologwsincom.in.gov.br:443
```

Ou para o de produção:
```
java InstallCert wsincom.in.gov.br:443
```

Escolhendo a opção __1__ quando perguntado se deve adicionar o certificado.
Com isso vai ser criado um arquivo chamado __jssecacerts__ com os certificados.

## 4. Copiar arquivo __jssecacerts__

>Atenção: se já possuir um arquivo jssecacerts não sobrescreva o mesmo. Adicione essa nova entrada no seu >arquivo já existente fazendo um backup antes de qualquer modificação no arquivo.

No terminal:
```
cp jssecacerts $JAVA_HOME\jre\lib\security
```

Esse passo-a-passo foi adaptado do [post de mkyong](http://www.mkyong.com/webservices/jax-ws/suncertpathbuilderexception-unable-to-find-valid-certification-path-to-requested-target/)

[1]: https://bugzilla.mozilla.org/show_bug.cgi?id=438825 "Add CA Root certificate (Brazil's National PKI)"
