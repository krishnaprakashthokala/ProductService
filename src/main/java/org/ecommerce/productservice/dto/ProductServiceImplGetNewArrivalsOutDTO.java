package org.ecommerce.productservice.dto;

import java.util.List;
import org.ecommerce.persistence.models.Product;

public class ProductServiceImplGetNewArrivalsOutDTO {
    private List<Product> retVal;
    
    
    public List<Product> getRetVal() {
        return retVal;
    }

    public void setRetVal(List<Product> retVal) {
        this.retVal = retVal;
    }
    
}