package org.ecommerce.productservice.dto;

import org.ecommerce.web.models.datatables.DataTableReviewInput;

public class ProductRestControllerReviewsInDTO {
    private Long id;
    private DataTableReviewInput input;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public DataTableReviewInput getInput() {
        return input;
    }

    public void setInput(DataTableReviewInput input) {
        this.input = input;
    }
    
}