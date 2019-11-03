# TesteGazin
Pequena aplicação com persistência e recuperação de um filme.

### Instalações necessarias:
* <a href="https://www.mysql.com/">Mysql</a>
* <a href="https://www.getpostman.com/">Postman</a>
* <a href="https://www.oracle.com/technetwork/java/javase/downloads/index.html/">Java SE 11</a>

### Execução:

* Baixe <a href="https://drive.google.com/open?id=1sF-06uNknJ2g2u2WG1lHQdxBdmCOYtcC">SNAPSHOT.jar</a> e<br>
Execute arquivo para iniciar servidor como processo; <br>
* Execute <b>Postman</b>:<br>
Vai em File -> Import -> <b>Filmes.postman_collection.json</b><br>
As pastas são coleções das respectivas tabelas do BD, e cada pasta contém requisições, dentro deles contem:<br>
** Botão: <b>GET</b> e <b>POST</b> pra fazer operação de busca e inserção.<br>
** Campo de Requisição da URL: <b>localhosthttp://localhost:8080/api/nomedatabela</b><br>

* Utilizando Postman botão <b>GET</b>:<br>
Clique na requisição <b>tabelaGET</b>, exemplo: ProdutorGET;<br>
Clique no <b>Botão GET</b>, insira API <b>localhosthttp://localhost:8080/api/Produtor</b> e então <b>SEND</b><br>

* Utilizando Postman botão <b>POST</b>:<br>
Clique na requisição <b>tabelaPOST</b>, exemplo: ProdutorPOST<br>
insira no Campo de Requisição API: <b>localhosthttp://localhost:8080/api/Produtor</b><br>
Selecione <b>Body</b> depois em <b>raw</b> abaixo<br>
Na Opção <b>TEXT</b> selecione <b>JSON</b><br>
insira comando Json com nome do <b>"Campo": "Valor"</b>, exemplo abaixo:<br>
  {
        "nome": "Will",
        "email": "Will1@gmail.com",
        "telefone": "4498789792"
   }
   
* clique <b>SEND</b><br>

### Pastas:

* A pasta <b>Script_JSON</b> possui os comandos para colocar em execução das API's.
* A Pasta <b>Postman</b> contem arquivo <b>Filmes.postman_collection.json</b> para fazer import no PostMan.
* A Pasta <b>Script_TabelasBD</b> contem os scripts SQL para banco MYSQL.
