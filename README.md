# flights
Teste para Atech

Para rodar este projeto, você vai precisar de:
-> Java 1.8
-> MySQL

Passo 1: Instale e configure o Java na sua máquina;
Passo 2: Baixe esse projeto e importe-o no Eclipse como um projeto Maven. Aguarde o Maven baixar as dependências;
Passo 3: Instale e configure o MySQL na sua máquina;
Passe 4: Crie uma nova base de dados chamada: flights utilizando o comando (create database flight);
Passo 5: Rode os scripts abaixo para criar alguns dados iniciais na aplicação:
Tabela pilot: 
		insert into flight.pilot values(1, 'Ricardo Rogulski');
		insert into flight.pilot values(2, 'José da Silva');
		insert into flight.pilot values(3, 'Carina Sumaia');
		
	Tabela aircraft:
		insert into flight.aircraft values(1, 'ERJ-170', 'PT-ABC');
		insert into flight.aircraft values(2, 'ERJ-190', 'PT-XYZ');
	
	Tabela city: 
		insert into flight.city values(1, 'São Paulo');
		insert into flight.city values(2, 'Campinas');
		insert into flight.city values(3, 'Rio de Janeiro');
		insert into flight.city values(4, 'Salvador');
		insert into flight.city values(5, 'Curitiba');
		insert into flight.city values(6, 'Recife');

	Tabela flight: 
		insert into flight.flight values(1, '14:00', '13:20', 'Onboard', 2, 1, 3, 1); 
		insert into flight.flight values(2, '20:00', '16:00', 'Awaiting', 2, 6, 2, 2); 
		insert into flight.flight values(3, '22:00', '17:00', 'Awaiting', 1, 4, 5, 3); 
