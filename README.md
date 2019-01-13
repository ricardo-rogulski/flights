# flights
Teste para Atech. Aplicação para exibição dos vôos de uma empresa aérea.

## Escopo desse projeto: 
Aplicação Spring + JPA que disponibiliza um serviço REST para consulta e criação de vôos de uma empresa aérea.

## Pré-requisitos:
- Java 1.8 instalado e configurado;
- MySQL instalado e configurado.

## Passo 1: 
Crie uma nova pasta e clone o projeto dentro dela;

## Passo 2: 
Importe o projeto no Eclipse como um projeto Maven. Aguarde o Maven baixar todas as dependências;

## Passe 3: 
No MySQL, crie uma nova base de dados chamada: "flight";

## Passo 4: 
Inicie a aplicação no Eclipse, a partir do arquivo "FlightsApplication" (esta ação irá criar as tabelas no MySQL);

## Passo 5: 
No MySQL, execute os scripts abaixo para criar alguns dados iniciais na aplicação:

	Tabela pilot: 
		insert into flight.pilot values(1, 'Ricardo Rogulski');
		insert into flight.pilot values(2, 'Paulo Francisco');
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
		insert into flight.city values(7, 'Manaus');

	Tabela flight: 
		insert into flight.flight (id, aircraft_id, pilot_id, departure_city_id, arrival_city_id, departure_time, arrival_time, status) values(1, 2, 1, 1, 3, '11h00', '12h00', 'Onboard'); 
		insert into flight.flight (id, aircraft_id, pilot_id, departure_city_id, arrival_city_id, departure_time, arrival_time, status) values(2, 2, 1, 3, 1, '14h00', '15h00', 'Awaiting'); 
		insert into flight.flight (id, aircraft_id, pilot_id, departure_city_id, arrival_city_id, departure_time, arrival_time, status) values(3, 1, 2, 2, 4, '08h20', '10h30', 'Delayed'); 
		insert into flight.flight (id, aircraft_id, pilot_id, departure_city_id, arrival_city_id, departure_time, arrival_time, status) values(4, 1, 2, 4, 2, '15h40', '17h50', 'Awaiting'); 
		insert into flight.flight (id, aircraft_id, pilot_id, departure_city_id, arrival_city_id, departure_time, arrival_time, status) values(5, 2, 3, 5, 6, '08h10', '11h40', 'In progress'); 
		insert into flight.flight (id, aircraft_id, pilot_id, departure_city_id, arrival_city_id, departure_time, arrival_time, status) values(6, 2, 3, 6, 5, '13h20', '16h50', 'Awaiting'); 
		insert into flight.flight (id, aircraft_id, pilot_id, departure_city_id, arrival_city_id, departure_time, arrival_time, status) values(7, 2, 1, 1, 7, '07h10', '11h20', 'In progress'); 
		insert into flight.flight (id, aircraft_id, pilot_id, departure_city_id, arrival_city_id, departure_time, arrival_time, status) values(8, 2, 1, 7, 1, '14h50', '19h10', 'Delayed'); 
 

## Passo 7: 
Com a ferramenta POSTMAN você já pode verificar o serviço em funcionamento. 
- Tente acessar a url http://localhost:8080/flight com o método GET e verá os vôos cadastrados.

Agora vá siga as instruções do projeto flights-frontend para rodar a view do projeto :)

### Próximos passos / evloluções desse projeto: 
- Implementar testes automatizados;
- Disponibilizar os serviços REST também para as outras entidades (Pilot, Aircraft e City);



