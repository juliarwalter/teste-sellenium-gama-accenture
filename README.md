# [ACCADEMIA ACCENTURE QA] - Projeto QA

![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)


# Desafio da Gama Academy e Accenture 4.0

Júlia Rheinheimer Walter

Objetivo: Implementar os conteúdos abordados sobre testes com API, Devops, metodologias ágeis;

Tecnologias utilizadas: Cucumber + Selenium, Java, Jira.

Resultado: https://youtu.be/u6mwZvqxHao 


# O desafio: uma aplicação de testes com Selenium e Cucumber :computer:
Validação no site da Accenture utilizando Cucumber, Selenium WebDriver em Java.

- [x] Caso de teste 1
 >*Acessar o site da Tricentis e preencher todos os campos da aba Enter Vehicle Data. <br>*
 <br>
 
  **Cenário**: Peencher campos da aba Enter Vehicle Data <br>
	Quando acesso o site da Tricentis: "http://sampleapp.tricentis.com/101/app.php"<br>
	Dado que clico em Automobile <br>
	E clico na opcao Make: Audi <br>
	E preencho o campo Engine Performance [kW]: "22" <br>
	E informo a Date of Manufacture: "07/23/2019" <br>
	E clico na opcao Number of Seats 5	<br>
	E clico na opcao Fuel Type: Eletric Power <br>
	E informo a List Price [$]: "100000" <br>
	E informo a License Plate Number: "ABC 123" <br>
	E informo a Annual Mileage [mi]: "1500" <br>
	Entao devo clicar em Next <br>
  

- [x] Caso de teste 2
 >*Preencher todos os campos da aba Enter Insurant Data. <br>*
 <br>
 
  **Cenário**: Peencher campos da aba Enter Insurant Data <br>
	Dado que digito First Name "Carlos" <br>
	E que digito Last Name "Silva" <br> 
	E preencho o campo Date of Birth "07/23/1992" <br>
	E informo o Gender: Male <br>
	E preencho o campo Street Address "Av. A"  <br>
	E seleciono a opcao: Brasil  <br>
	E preencho o campo Zip Code "12345678"  <br>
	E preencho a City "São Paulo"  <br>
	E que clico na opcao Occupation: Employee  <br>
	E informo os Hoobies  <br>
	E preencho o Website: "www.carlosweb.com.br"  <br>
	Entao clico em Next  <br>
  
  
- [x] Caso de teste 3
 >*Preencher todos os campos da aba Enter Product Data. <br>*
 <br>
 
  **Cenário**: Peencher campos da aba Enter Product Data <br>
	Dado que informo o Start Date: "07/23/2021" <br>
	E que clico na opcao Insurance Sum [$] 35.000.000,00 <br>
	E que clico na opcao Merit Rating: Super Bonus <br>
	E que clico na opcao Damage Insurance: Full Coverage <br>
	E informo o Optional Products: Euro Protection <br>
	E que clico na opcao Courtesy Car: Yes <br>
	Entao clicar no Next <br>


- [x] Caso de teste 4
 >*Preencher todos os campos da aba Select Price Option.<br>*
 <br>
 
  **Cenário** Peencher campos da aba Select Price Option  <br>
	Dado que seleciono a opcao de preco  <br>
	Entao clico no botao Next  <br>
  
  
  - [x] Caso de teste 5  
  >*Preencher todos os campos da aba Select Send Quote.<br>*
 <br>
 
  **Cenário** Peencher campos da aba Select Price Option <br>
	Dado que informo o E-mail: "c@gamil.com" <br>
	E preencho o campo Phone: "12345678" <br>
	E preencho o campo Username: "Carlos"	 <br>
	E preencho o campo Password: "CARLOS1234*carlos" <br>
	E confirmo o campo Password: "CARLOS1234*carlos"	 <br>
	Entao devo clicar em Send <br>
  E verificar a mensagem: "Sending e-mail success!" <br>

--------------------------------------------------------------------

## Tecnologias utilizadas :computer:

:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar :bookmark_tabs:

### Pré requisitos

- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

- Verificar se o JAVA_HOME está configurado em seu computador

- Clone do projeto

```bash
git clone https://github.com/juliarwalter/teste-sellenium-gama-accenture.git
 ```

- Entrando na pasta do projeto
 ```bash
cd teste-sellenium-gama-accenture
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
 
./test.sh

 ```

- Executando teste no Windows
 ```bash

test.bat

 ```
 
 - Os códigos estão configurados para executarem no Microsoft Edge, porém nos comentários (pasta services) tem a opção de selecionar o Chrome (que também está na pasta drive)
 ```bash
 
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
 System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
 browser = new EdgeDriver();

 //System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
 //browser = new ChromeDriver();
 
 ```

--------------------------------------------------------------------
## Estrutura de arquivos :open_file_folder:
<pre>
  driver <br>
      |-- msedgedriver.exe -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- juliarwalter <br>
    |  |  |  |  |  |-- CenarioSteps1.java -- Passos escritos em java com selenium abrindo o browser e preenchenco a aba Enter Vehicle Data <br>
    |  |  |  |  |  |-- CenarioSteps2.java -- Passos escritos em java com selenium abrindo o browser e preenchenco a aba Enter Insurant Data <br>
    |  |  |  |  |  |-- CenarioSteps3.java -- Passos escritos em java com selenium abrindo o browser e preenchenco a aba Enter Product Data <br>
    |  |  |  |  |  |-- CenarioSteps4.java -- Passos escritos em java com selenium abrindo o browser e preenchenco a aba Select Price Option <br>
    |  |  |  |  |  |-- CenarioSteps5.java -- Passos escritos em java com selenium abrindo o browser e preenchenco a aba Send Quote <br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br> 
    |  |  |  |  |  |-- services <br>
    |  |  |  |  |  |  |-- Comando.java <br> -- Arquivo que configura (inicialização e comandos) o Java test <br> 
    |  |-- resources <br>
    |  |  |-- io <br>
    |  |  |  |-- cucumber <br>
    |  |  |  |  |-- juliarwalter <br>
    |  |  |  |  |  |-- CenarioDeTeste1.feature -- Gherkin com os cenários peencher campos da aba Enter Vehicle Data <br>
    |  |  |  |  |  |-- CenarioDeTeste2.feature -- Gherkin com os cenários peencher campos da aba Enter Insurant Data <br>
    |  |  |  |  |  |-- CenarioDeTeste3.feature -- Gherkin com os cenários peencher campos da aba Enter Product Data <br>
    |  |  |  |  |  |-- CenarioDeTeste4.feature -- Gherkin com os cenários peencher campos da aba Price Option <br>
    |  |  |  |  |  |-- CenarioDeTeste5.feature -- Gherkin com os cenários peencher campos da aba Send Quote <br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>
--------------------------------------------------------------------
## Planejamento do projeto :date:

![image](https://user-images.githubusercontent.com/64220340/113086458-080cd200-91b8-11eb-8597-4d6c670e6ea8.png)

