# language: pt

Funcionalidade: Acessar o site da Tricentis e preencher todos os campos da aba Enter Vehicle Data, Enter Insurant Data, Enter Product Data, Select Price Oprtion e Send Quote  
  
  Cenario: Peencher campos da aba Select Price Option
	Dado que informo o E-mail: "c@gamil.com"
	E preencho o campo Phone: "12345678"
	E preencho o campo Username: "Carlos"	
	E preencho o campo Password: "CARLOS1234*carlos"
	E confirmo o campo Password: "CARLOS1234*carlos"	
	Entao devo clicar em Send
	E verificar a mensagem: "Sending e-mail success!"