import dao.ProductDAO;

import java.util.Map;

public class GetProductHandler extends AbstractRequestHandler<String> {

    private ProductDAO productDAO;

    public GetProductHandler(ProductDAO productDAO) {
        super(String.class, productDAO);
    }

    @Override
    protected Answer processImpl(String value, Map<String, String> queryParams) {

        System.out.println(value);
        System.out.println(queryParams.get(":productid"));
        System.out.println(queryParams.get("productid"));

        return null;
    }
}
