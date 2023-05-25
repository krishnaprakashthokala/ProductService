package org.ecommerce.productservice.dto;

import org.ecommerce.persistence.projection.ReviewDetail;

public class ProductRestControllerReviewOutDTO {
    private ReviewDetail retVal;
    
    
    public ReviewDetail getRetVal() {
        return retVal;
    }

    public void setRetVal(ReviewDetail retVal) {
        this.retVal = retVal;
    }
    
}