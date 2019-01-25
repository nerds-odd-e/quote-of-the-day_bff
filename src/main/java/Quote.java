import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    public String id;
    public String Quote;
    public String Author;
    public String Contributor;
    public String Location;
    public String Date;
    public String Language;
    public String ContributionDate;
}
