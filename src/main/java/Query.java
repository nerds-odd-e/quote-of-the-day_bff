import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {
    public Quote getQuoteOfTheDay(){
        Quote quote = new Quote();
        quote.setContent("It sucks");
        quote.setOriginalAuthor("Mike Li");
        quote.setSubmitter("Jackson Zhang");
        return quote;
    }
}
