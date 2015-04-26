# jms-test
Projeto simples para testes sobre JMS (Java Message Service)
<br />

#Documentação oficial
https://docs.oracle.com/javaee/7/tutorial/partmessaging.htm#GFIRP3
<br />

#Instruções para testar o projeto
<br />

Antes de executar qualquer exemplo é necessario:
<br />

1 - Criar os objetos administrativos de JMS (factory e destination) utilizando o arquivo glassfish-resource.xml existente na pasta src/main/resources. 
<br />
<lu>
	<li>1.1 - Inicialize o servidor de aplicação glassfish.</li>
	<li>1.2 - Em um terminal (linha de comando) acesse a pasta bin do servidor de aplicação
		e execute o comando:<b> ./asadmin add-resources glassfish-resource.xml </b>(indicando o arquivo com seu caminho absoluto).</li>
</lu>

2 - Realizar o deploy da aplicação em servidor de aplicação que implemente a especificação javaEE 7.
