# jms-test
Projeto simples para testes sobre JMS (Java Message Service)
<br />

#Documentação oficial
https://docs.oracle.com/javaee/7/tutorial/partmessaging.htm#GFIRP3
<br />

#Instruções para testar o projeto:
<br />

Antes de executar qualquer exemplo é necessario:
<br />

1 - Criar os objetos administrativos de JMS (factory e destination).
	1.1 - Isto deve ser feito utilizando o arquivo glassfish-resource.xml existente na pasta src/main/resources
	da seguinte forma:
		1.1.1 - Inicialize o servidor de aplicação glassfish
		1.1.2 - Atraves da linha de um terminal (linha de comando) acesse a pasta bin do servidor de aplicação 
		e execute o comando: ./asadmin add-resources glassfish-resource.xml (indicando o arquivo com seu caminho absoluto).
		  

2 - Realizar o deploy da aplicação em servidor de aplicação que implemente a especificação javaEE 7.
