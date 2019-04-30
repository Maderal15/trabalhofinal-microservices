# Trabalho de Microservices


# Documento
```sh
http://localhost:8080/swagger-ui.html

 POST 
  http://localhost:8080/transactions\
  http://localhost:8090/transactions\
 { 
	"timestamp": 2447952675125,
	"amount": 2700.10 
  }

GET
  http://localhost:8080/statistics
  http://localhost:8090/statistics

```
# Build do docker
```sh
docker build -t danilo/trabalhofinal .
```
# Executar essas duas instancias 

```sh
docker run -p 8080:8080 -t danilo/trabalhofinal
docker run -p 8090:8080 -t danilo/trabalhofinal
```
