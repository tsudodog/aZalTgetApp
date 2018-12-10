package handlers;

import com.google.gson.Gson;
import dao.ProductDAO;
import spark.Request;
import spark.Response;
import spark.Route;
import java.util.Map;


/**
 * The AbstractRequestHandler is designed to implement the Route interface, allowing it to
 * function in place of the lambda functions frequenlty found in smaller Spark applications.
 * This makes the behaviour extremely easy to test as the handle method calls the process method
 * which in turn calles the actual implementation. Making the Request Handler function with generics
 * allows this abstract class to handle multiple types of data and different formats.
 * @param <V>
 */
public abstract class AbstractRequestHandler<V> implements RequestHandler<V>, Route {
    private Class<V> valueClass;
    private ProductDAO productDAO;

    private static final int HTTP_BAD_REQUEST = 400;

    public AbstractRequestHandler(Class<V> valueCalss, ProductDAO productDAO){
        this.valueClass = valueCalss;
        this.productDAO = productDAO;
    }

    private static boolean shouldReturnHtml(Request request){
        String accept = request.headers("Accept");
        return accept != null && accept.contains("text/html");
    }

    @Override
    public Answer process(V value, Map<String, String> urlParams) {
        return processImpl(value, urlParams);
    }


    protected abstract Answer processImpl(V value, Map<String, String> queryParams);

    @Override
    public Object handle(Request request, Response response) throws Exception {
        Gson gson = new Gson();
        V value = gson.fromJson(request.body(), valueClass);
        Map<String, String> urlParams = request.params();
        Answer answer = process(value, urlParams);
        response.status(answer.getCode());
        response.type(answer.getContentType());
        response.body(answer.getBody());
        return answer;
    }


}
