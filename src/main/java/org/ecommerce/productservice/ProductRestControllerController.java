package org.ecommerce.productservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.productservice.dto.*;
import org.ecommerce.web.admin.controllers.rest.ProductRestController;

@RestController
@RequestMapping("/productRestController")
public class ProductRestControllerController {
    @Autowired
    private ProductRestController productRestController;

    @PostMapping(value = "/review", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductRestControllerReviewOutDTO> review(@RequestBody ProductRestControllerReviewInDTO in) {
        ProductRestControllerReviewOutDTO ret = new ProductRestControllerReviewOutDTO();
        ret.setRetVal(productRestController.review(in.getId()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductRestControllerAllOutDTO> all(@RequestBody ProductRestControllerAllInDTO in) {
        ProductRestControllerAllOutDTO ret = new ProductRestControllerAllOutDTO();
        ret.setRetVal(productRestController.all(in.getInput()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/reviews", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductRestControllerReviewsOutDTO> reviews(@RequestBody ProductRestControllerReviewsInDTO in) {
        ProductRestControllerReviewsOutDTO ret = new ProductRestControllerReviewsOutDTO();
        ret.setRetVal(productRestController.reviews(in.getId(), in.getInput()));
        return ResponseEntity.ok(ret);
    }

}