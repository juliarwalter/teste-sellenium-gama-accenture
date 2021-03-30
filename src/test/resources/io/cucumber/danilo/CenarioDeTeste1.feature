# language: pt

Funcionalidade: Acessar o site da Tricentis e preencher todos os campos da aba Enter Vehicle Data, Enter Insurant Data, Enter Product Data, Select Price Oprtion e Send Quote

  Cenario: Peencher campos da aba Enter Vehicle Data
	Quando acesso o site da Tricentis
	Dado que clico na opcao make 
	E seleciono a opcao "Audi"
	E preencho o campo Engine Performance [kW]: "22"
	E informo a Date of Manufacture: "07/23/2019"
	E clico na opcao Number of Seats 
	E seleciono a opcao "5"	
	E clico na opcao Fuel Type
	E seleciono a opcao "Eletric Power"
	E informo a List Price [$]: "110398"
	E informo a License Plate Number: "ABC 123"
	E informo a Annual Mileage [mi]: "1500"
	Entao devo clicar em "Next"
