import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.web.client.RestTemplate;

public class Query implements GraphQLQueryResolver {
    public Quote getQuoteOfTheDay(){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://backend:8080/quotes/today", Quote.class);
        return quote;
    }
}
