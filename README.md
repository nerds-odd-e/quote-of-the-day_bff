# quote-of-the-day_bff

Query 
```
POST http://localhost:8080/quotegraphql

{
	"query":"{getQuoteOfTheDay { content originalAuthor submitter } }"
}
```

Docker
```
docker build . -t bff
docker run -d -p 8080:8080 bff
```