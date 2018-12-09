package handlers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dao.ProductDAO;
import myRetail.MyRetailProduct;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import redsky.Product;
import redsky.RedSkyAPI;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatcher.*;


@RunWith(PowerMockRunner.class)
@PrepareForTest(RedSkyAPI.class)
public class PutProductHandlerTest {
    private ProductDAO mockProductDAO;


    JsonObject goodJsonObject;
    public final String goodJsonObjectString = "{\n" +
            "\t\"currentPrice\" : {\n" +
            "\t\t\"value\" : 222.23,\n" +
            "\t\t\"currencyCode\" : \"EUR\"\n" +
            "\t}\n" +
            "}";
    @Before
    public void setUp(){
        mockProductDAO = mock(ProductDAO.class);
        PowerMockito.mockStatic(RedSkyAPI.class);
        Gson gson = new Gson();
        goodJsonObject = gson.fromJson(goodJsonObjectString, JsonObject.class);

    }

    @Test
    public void testPutWithABadNonNumericID(){
        final String testProductID = "2222BAD";
        Map<String, String> valueMap = new TreeMap<>();
        valueMap.put(":productid", testProductID);

        PutProductHandler putProductHandler = new PutProductHandler(mockProductDAO);
        Answer testAnswer = putProductHandler.process(null, valueMap);
        assertEquals(500, testAnswer.getCode());
    }





    @Test
    public void testPutWithPutRequest(){
        final String testProductID = "2222";
        Map<String, String> valueMap = new TreeMap<>();
        valueMap.put(":productid", testProductID);

        // need to validate that the id is added to the object passed to the DB
        Gson gson = new Gson();
        JsonObject testJsonObject = gson.fromJson(goodJsonObjectString, JsonObject.class);
        testJsonObject.addProperty("itemID", testProductID);
        MyRetailProduct mrp = gson.fromJson(testJsonObject, MyRetailProduct.class);

        PutProductHandler putProductHandler = new PutProductHandler(mockProductDAO);

        Answer testAnswer = putProductHandler.process(goodJsonObject, valueMap);



        assertEquals(200, testAnswer.getCode());
        System.out.println(testAnswer.getBody());
        final String expectedBody = "update to 2222 was successful!";
        assertEquals(expectedBody, testAnswer.getBody());
        assertEquals(Answer.TEXT_PLAIN, testAnswer.getContentType());

    }
}
