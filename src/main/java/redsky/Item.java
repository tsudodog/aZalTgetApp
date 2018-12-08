
package redsky;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("tcin")
    @Expose
    private String tcin;
    @SerializedName("bundle_components")
    @Expose
    private BundleComponents bundleComponents;
    @SerializedName("dpci")
    @Expose
    private String dpci;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("product_description")
    @Expose
    private ProductDescription productDescription;
    @SerializedName("parent_items")
    @Expose
    private String parentItems;
    @SerializedName("buy_url")
    @Expose
    private String buyUrl;
    @SerializedName("variation")
    @Expose
    private Variation variation;
    @SerializedName("enrichment")
    @Expose
    private Enrichment enrichment;
    @SerializedName("return_method")
    @Expose
    private String returnMethod;
    @SerializedName("handling")
    @Expose
    private Handling handling;
    @SerializedName("recall_compliance")
    @Expose
    private RecallCompliance recallCompliance;
    @SerializedName("tax_category")
    @Expose
    private TaxCategory taxCategory;
    @SerializedName("display_option")
    @Expose
    private DisplayOption displayOption;
    @SerializedName("fulfillment")
    @Expose
    private Fulfillment fulfillment;
    @SerializedName("package_dimensions")
    @Expose
    private PackageDimensions packageDimensions;
    @SerializedName("environmental_segmentation")
    @Expose
    private EnvironmentalSegmentation environmentalSegmentation;
    @SerializedName("manufacturer")
    @Expose
    private Manufacturer manufacturer;
    @SerializedName("product_vendors")
    @Expose
    private List<ProductVendor> productVendors = null;
    @SerializedName("product_classification")
    @Expose
    private ProductClassification productClassification;
    @SerializedName("product_brand")
    @Expose
    private ProductBrand productBrand;
    @SerializedName("item_state")
    @Expose
    private String itemState;
//    @SerializedName("specifications")
    // TODO: these fields are weird and dont have a clear subtype
    // I don't feel they are extremely pertinent to the interview
//    @Expose
//    private List<Object> specifications = null;
//    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("country_of_origin")
    @Expose
    private String countryOfOrigin;
    @SerializedName("relationship_type_code")
    @Expose
    private String relationshipTypeCode;
    @SerializedName("subscription_eligible")
    @Expose
    private Boolean subscriptionEligible;
//    @SerializedName("ribbons")
//    @Expose
//    private List<Object> ribbons = null;
//    @SerializedName("tags")
//    @Expose
//    private List<Object> tags = null;
    @SerializedName("estore_item_status_code")
    @Expose
    private String estoreItemStatusCode;
    @SerializedName("is_proposition_65")
    @Expose
    private Boolean isProposition65;
    @SerializedName("return_policies")
    @Expose
    private ReturnPolicies returnPolicies;
    @SerializedName("gifting_enabled")
    @Expose
    private Boolean giftingEnabled;

    public String getTcin() {
        return tcin;
    }

    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    public BundleComponents getBundleComponents() {
        return bundleComponents;
    }

    public void setBundleComponents(BundleComponents bundleComponents) {
        this.bundleComponents = bundleComponents;
    }

    public String getDpci() {
        return dpci;
    }

    public void setDpci(String dpci) {
        this.dpci = dpci;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public String getParentItems() {
        return parentItems;
    }

    public void setParentItems(String parentItems) {
        this.parentItems = parentItems;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public Variation getVariation() {
        return variation;
    }

    public void setVariation(Variation variation) {
        this.variation = variation;
    }

    public Enrichment getEnrichment() {
        return enrichment;
    }

    public void setEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
    }

    public String getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }

    public Handling getHandling() {
        return handling;
    }

    public void setHandling(Handling handling) {
        this.handling = handling;
    }

    public RecallCompliance getRecallCompliance() {
        return recallCompliance;
    }

    public void setRecallCompliance(RecallCompliance recallCompliance) {
        this.recallCompliance = recallCompliance;
    }

    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    public DisplayOption getDisplayOption() {
        return displayOption;
    }

    public void setDisplayOption(DisplayOption displayOption) {
        this.displayOption = displayOption;
    }

    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    public EnvironmentalSegmentation getEnvironmentalSegmentation() {
        return environmentalSegmentation;
    }

    public void setEnvironmentalSegmentation(EnvironmentalSegmentation environmentalSegmentation) {
        this.environmentalSegmentation = environmentalSegmentation;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<ProductVendor> getProductVendors() {
        return productVendors;
    }

    public void setProductVendors(List<ProductVendor> productVendors) {
        this.productVendors = productVendors;
    }

    public ProductClassification getProductClassification() {
        return productClassification;
    }

    public void setProductClassification(ProductClassification productClassification) {
        this.productClassification = productClassification;
    }

    public ProductBrand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    public String getItemState() {
        return itemState;
    }

    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

//    public List<Object> getSpecifications() {
//        return specifications;
//    }
//
//    public void setSpecifications(List<Object> specifications) {
//        this.specifications = specifications;
//    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    public void setRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    public void setSubscriptionEligible(Boolean subscriptionEligible) {
        this.subscriptionEligible = subscriptionEligible;
    }

//    public List<Object> getRibbons() {
//        return ribbons;
//    }
//
//    public void setRibbons(List<Object> ribbons) {
//        this.ribbons = ribbons;
//    }

//    public List<Object> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<Object> tags) {
//        this.tags = tags;
//    }

    public String getEstoreItemStatusCode() {
        return estoreItemStatusCode;
    }

    public void setEstoreItemStatusCode(String estoreItemStatusCode) {
        this.estoreItemStatusCode = estoreItemStatusCode;
    }

    public Boolean getIsProposition65() {
        return isProposition65;
    }

    public void setIsProposition65(Boolean isProposition65) {
        this.isProposition65 = isProposition65;
    }

    public ReturnPolicies getReturnPolicies() {
        return returnPolicies;
    }

    public void setReturnPolicies(ReturnPolicies returnPolicies) {
        this.returnPolicies = returnPolicies;
    }

    public Boolean getGiftingEnabled() {
        return giftingEnabled;
    }

    public void setGiftingEnabled(Boolean giftingEnabled) {
        this.giftingEnabled = giftingEnabled;
    }

}
