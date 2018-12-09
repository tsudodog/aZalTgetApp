package handlers;

public class Answer {

    public static final String APPLICATION_JSON = "application/json";
    public static final String TEXT_PLAIN = "text/plain";
    private int code;
    private String body;
    private String contentType;


    public Answer(int code, String body, String contentType) {
        this.code = code;
        this.body = body;
        this.contentType = contentType;
    }

    public Answer(int code) {
        this.code = code;
        this.body = "";
        this.contentType = TEXT_PLAIN;
    }


    public String getBody() {
        return body;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        if (code != answer.code) return false;
        if (body != null ? !body.equals(answer.body) : answer.body != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getBody();
    }


    public static Answer ok(String body) {
        return new Answer(200, body, TEXT_PLAIN);
    }
}