public class Quote {
    private long id;
    private String content;
    private String originalAuthor;
    private String submitter;

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOriginalAuthor(String originalAuthor) {
        this.originalAuthor = originalAuthor;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }
}
