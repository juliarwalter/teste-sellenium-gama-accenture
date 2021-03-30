# language: pt

Funcionalidade: Acessar o site da Tricentis e preencher todos os campos da aba Enter Vehicle Data, Enter Insurant Data, Enter Product Data, Select Price Oprtion e Send Quote  
  
  Cenario: Peencher campos da aba Enter Insurant Data
	Dado que digito First Name "Carlos"
	E que digito Last Name "Silva"
	E preencho o campo Date of Birth "07/23/1992"
	E informo o Gender: Male
	E preencho o campo Street Address "Av. A"
	E seleciono a opcao: Brasil
	E preencho o campo Zip Code "12345678"
	E preencho a City "São Paulo"
	E que clico na opcao Occupation: Employee
	E informo os Hoobies
	E preencho o Website: "www.carlosweb.com.br"
	Entao clico em Next