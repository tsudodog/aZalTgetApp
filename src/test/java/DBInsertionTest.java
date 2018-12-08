import com.google.gson.Gson;
import dao.ProductDAOImpl;
import redsky.Product;
import org.junit.Test;
import redsky.RedSkyAPI;

public class DBInsertionTest {

    public static final String testTargetObject = "{\"product\":{\"deep_red_labels\":{\"total_count\":2,\"labels\":[{\"id\":\"twbl94\",\"name\":\"Movies\",\"type\":\"merchandise type\",\"priority\":0,\"count\":1},{\"id\":\"rv3fdu\",\"name\":\"SA\",\"type\":\"relationship type\",\"priority\":0,\"count\":1}]},\"available_to_promise_network\":{\"product_id\":\"13860429\",\"id_type\":\"TCIN\",\"available_to_promise_quantity\":1,\"street_date\":\"2012-01-03T06:00:00.000Z\",\"availability\":\"AVAILABLE\",\"online_available_to_promise_quantity\":1,\"stores_available_to_promise_quantity\":0,\"availability_status\":\"LIMITED_STOCK\",\"multichannel_options\":[],\"is_infinite_inventory\":false,\"loyalty_availability_status\":\"LIMITED_STOCK\",\"loyalty_purchase_start_date_time\":\"1970-01-01T00:00:00.000Z\",\"is_loyalty_purchase_enabled\":false,\"is_out_of_stock_in_all_store_locations\":false,\"is_out_of_stock_in_all_online_locations\":false},\"price\":{\"partNumber\":\"13860429\",\"channelAvailability\":\"0\",\"listPrice\":{\"minPrice\":0.0,\"maxPrice\":0.0,\"price\":12.98,\"formattedPrice\":\"$12.98\",\"priceType\":\"MSRP\",\"null\":false},\"offerPrice\":{\"minPrice\":0.0,\"maxPrice\":0.0,\"price\":7.5,\"formattedPrice\":\"$7.50\",\"priceType\":\"Reg\",\"startDate\":1416816000000,\"endDate\":253402236000000,\"saveDollar\":\"5.48\",\"savePercent\":\"42\",\"eyebrow\":\"\",\"null\":false},\"ppu\":\"\",\"mapPriceFlag\":\"N\"},\"item\":{\"tcin\":\"13860429\",\"bundle_components\":{\"is_assortment\":true,\"is_kit_master\":false,\"is_standard_item\":true,\"is_component\":false},\"dpci\":\"058-10-3553\",\"upc\":\"097368227941\",\"product_description\":{\"title\":\"SpongeBob SquarePants: SpongeBob's Frozen Face-off\",\"bullet_description\":[\"<B>Movie Studio:</B> Nickelodeon\",\"<B>Movie Genre:</B> Kids and Family\",\"<B>Physical Media Format:</B> DVD\",\"<B>Software Format:</B> DVD\"],\"general_description\":\"Dvd SPONGEBOB SQUAREPANTS: SPONGEBOB FROZEN FACE-OFF Movies\"},\"buy_url\":\"https://www.target.com/p/spongebob-squarepants-spongebob-s-frozen-face-off/-/A-13860429\",\"variation\":{},\"enrichment\":{\"images\":[{\"base_url\":\"https://target.scene7.com/is/image/Target/\",\"primary\":\"GUEST_fc4ec9d5-e297-4756-ad79-64139f22785e\",\"content_labels\":[{\"image_url\":\"GUEST_fc4ec9d5-e297-4756-ad79-64139f22785e\"}]}],\"sales_classification_nodes\":[{\"node_id\":\"56enn\"},{\"node_id\":\"5xswu\"},{\"node_id\":\"55j5v\"}]},\"return_method\":\"This item can be returned to any Target store or Target.com.\",\"handling\":{},\"recall_compliance\":{\"is_product_recalled\":false},\"tax_category\":{\"tax_class\":\"G\",\"tax_code_id\":99999,\"tax_code\":\"99999\"},\"display_option\":{\"is_size_chart\":false,\"is_warranty\":false},\"fulfillment\":{\"is_po_box_prohibited\":false},\"package_dimensions\":{\"weight\":\"0.16\",\"weight_unit_of_measure\":\"POUND\",\"width\":\"5.34\",\"depth\":\"7.48\",\"height\":\"0.52\",\"dimension_unit_of_measure\":\"INCH\"},\"environmental_segmentation\":{\"is_lead_disclosure\":false},\"manufacturer\":{},\"product_vendors\":[{\"id\":\"1316256\",\"manufacturer_style\":\"822794\",\"vendor_name\":\"PMOUNT BY UNIVERSAL\"},{\"id\":\"1258738\",\"manufacturer_style\":\"097368227941\",\"vendor_name\":\"BAKER AND TAYLOR\"},{\"id\":\"1979998\",\"manufacturer_style\":\"822794\",\"vendor_name\":\"Universal for PHMD PFS\"}],\"product_classification\":{\"product_type\":\"542\",\"product_type_name\":\"ELECTRONICS\",\"item_type_name\":\"Movies\",\"item_type\":{\"category_type\":\"Item Type: MMBV\",\"type\":300752,\"name\":\"Movies\"}},\"product_brand\":{\"brand\":\"SpongeBob\"},\"item_state\":\"READY_FOR_LAUNCH\",\"specifications\":[],\"attributes\":{\"gift_wrapable\":\"N\",\"has_prop65\":\"N\",\"is_hazmat\":\"N\",\"max_order_qty\":10,\"street_date\":\"2012-01-03\",\"media_format\":\"DVD\",\"merch_class\":\"MOVIES\",\"merch_classid\":58,\"merch_subclass\":10,\"return_method\":\"This item can be returned to any Target store or Target.com.\"},\"country_of_origin\":\"US\",\"relationship_type_code\":\"Stand Alone\",\"subscription_eligible\":false,\"ribbons\":[],\"tags\":[],\"estore_item_status_code\":\"A\",\"is_cart_add_on\":true,\"eligibility_rules\":{\"add_on\":{\"is_active\":true},\"inventory_notification_to_guest_excluded\":{\"is_active\":true}},\"is_proposition_65\":false,\"return_policies\":{\"user\":\"Regular Guest\",\"policyDays\":\"30\",\"guestMessage\":\"This item must be returned within 30 days of the ship date. See return policy for details.\"},\"gifting_enabled\":false}}}";

    @Test
    public void testInsertingAnObjectIntoDB(){
        Gson gson = new Gson();
        Product newProduct = gson.fromJson(testTargetObject, Product.class);
        System.out.println(newProduct.toString());
        ProductDAOImpl productDAO = new ProductDAOImpl();
//        productDAO.addProduct(newProduct);
    }

    @Test
    public void testGetItemByItemID(){
        ProductDAOImpl productDAO = new ProductDAOImpl();
//        Product product = productDAO.findProductByProductID("13860428");
//        System.out.println(product);
    }

    @Test
    public void testGettingItemFromRedSky(){
        Product product = RedSkyAPI.getProductByProductID("13860429");
        System.out.println(product.toString());

    }
}
