package org.ecommerce.productservice.dto;

import org.springframework.ui.Model;

public class ProductControllerEditInDTO {
    private Long productId;
    private Model model;
    
    
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
}