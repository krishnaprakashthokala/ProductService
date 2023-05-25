package org.ecommerce.productservice.dto;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.ecommerce.persistence.models.Review;

public class ProductRestControllerReviewsOutDTO {
    private DataTablesOutput<Review> retVal;
    
    
    public DataTablesOutput<Review> getRetVal() {
        return retVal;
    }

    public void setRetVal(DataTablesOutput<Review> retVal) {
        this.retVal = retVal;
    }
    
}