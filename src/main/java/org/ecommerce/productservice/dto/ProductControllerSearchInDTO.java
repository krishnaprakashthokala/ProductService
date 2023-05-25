package org.ecommerce.productservice.dto;

import org.ecommerce.web.models.search.SearchProduct;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class ProductControllerSearchInDTO {
    private SearchProduct searchProduct;
    private String query;
    private RedirectAttributes model;
    
    
    public SearchProduct getSearchProduct() {
        return searchProduct;
    }

    public void setSearchProduct(SearchProduct searchProduct) {
        this.searchProduct = searchProduct;
    }
    
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    public RedirectAttributes getModel() {
        return model;
    }

    public void setModel(RedirectAttributes model) {
        this.model = model;
    }
    
}