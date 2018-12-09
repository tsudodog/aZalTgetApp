package handlers;

import dao.ProductDAO;
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

@RunWith(PowerMockRunner.class)
@PrepareForTest(RedSkyAPI.class)
public class GetProductHandlerTest {

    private ProductDAO mockProductDAO;

    @Before
    public void setUp(){
        mockProductDAO = mock(ProductDAO.class);
        PowerMockito.mockStatic(RedSkyAPI.class);

    }

    @Test
    public void testGetResponseHandlerWithIDThatReturnsNoResults(){
        // information from request
        final String testProductID = "22222";
        Map<String, String> valueMap = new TreeMap<>();
        valueMap.put(":productid", testProductID);

        PowerMockito.when(RedSkyAPI.getProductByProductID(testProductID)).thenReturn(new Product());
        when(mockProductDAO.findProductByProductID(testProductID)).thenReturn(null);

        GetProductHandler getProductHandler = new GetProductHandler(mockProductDAO);

        Answer testAnswer = getProductHandler.process("", valueMap);
        assertEquals(200, testAnswer.getCode());
        assertEquals("{\"name\":\"\",\"current_price\":{\"value\":0.0,\"currencyCode\":\"USD\"}}", testAnswer.getBody());
        assertEquals(Answer.APPLICATION_JSON, testAnswer.getContentType());

    }

    @Test
    public void testGetResponsHandlerWithIDThatReturnsAResponse(){
        // information from request
        final String testProductID = "3333";
        final String testProductTitle = "THIS IS A TEST PRODUCT";
        Map<String, String> valueMap = new TreeMap<>();
        valueMap.put(":productid", testProductID);


        Product p = new Product();
        p.getProduct().getItem().getProductDescription().setTitle(testProductTitle);


        PowerMockito.when(RedSkyAPI.getProductByProductID(testProductID)).thenReturn(p);
        when(mockProductDAO.findProductByProductID(testProductID)).thenReturn(null);


        GetProductHandler getProductHandler = new GetProductHandler(mockProductDAO);

        Answer testAnswer = getProductHandler.process("", valueMap);

        assertEquals(200, testAnswer.getCode());
        final String expectedBody = "{\"name\":\"THIS IS A TEST PRODUCT\",\"current_price\":{\"value\":0.0,\"currencyCode\":\"USD\"}}";
        assertEquals(expectedBody, testAnswer.getBody());
        assertEquals(Answer.APPLICATION_JSON, testAnswer.getContentType());
    }

}
