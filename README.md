# jms-test
Projeto simples para testes sobre JMS (Java Message Service)

#Documentação e/ou tutorial oficial:
https://docs.oracle.com/javaee/7/tutorial/partmessaging.htm#GFIRP3

#API JAVAEE7
http://docs.oracle.com/javaee/7/api/

#Instruções para testar o projeto

Antes de executar qualquer exemplo é necessario:

1 - Criar os objetos administrativos de JMS (factory e destination) utilizando o arquivo glassfish-resource.xml existente na pasta src/main/resources. 
<br />
<lu>
	<li>1.1 - Inicialize o servidor de aplicação glassfish.</li>
	<li>1.2 - Em um terminal (linha de comando) acesse a pasta bin do servidor de aplicação
		e execute o comando:<b> ./asadmin add-resources glassfish-resource.xml </b>(indicando o arquivo com seu caminho absoluto).</li>
</lu>

2 - Implantar a aplicação no servidor de aplicação Glassfish4 ou superior.
3 - Abrir o navegador de internet de sua preferencia e acessar a seguinte URL: 
<b>http://localhost:8080/jms-test-0.0.1-SNAPSHOT/messageGen</b>
<b>Obs:</b> É possível alterar no momento do deploy o nome do contexto que será exposto, 
e alterando o contexto deve-se alterar também a URL de consumo do serviço acima descrita.

4 - Após o acesso da URL descrita acima serão enviadas e consumidas 100 mensagens.

