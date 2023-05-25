package org.ecommerce.productservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.productservice.dto.*;
import org.ecommerce.web.services.impl.ProductServiceImpl;

@RestController
@RequestMapping("/productServiceImpl")
public class ProductServiceImplController {
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @PostMapping(value = "/getNewArrivals", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductServiceImplGetNewArrivalsOutDTO> getNewArrivals(@RequestBody ProductServiceImplGetNewArrivalsInDTO in) {
        ProductServiceImplGetNewArrivalsOutDTO ret = new ProductServiceImplGetNewArrivalsOutDTO();
        ret.setRetVal(productServiceImpl.getNewArrivals());
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/getNewProducts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductServiceImplGetNewProductsOutDTO> getNewProducts(@RequestBody ProductServiceImplGetNewProductsInDTO in) {
        ProductServiceImplGetNewProductsOutDTO ret = new ProductServiceImplGetNewProductsOutDTO();
        ret.setRetVal(productServiceImpl.getNewProducts());
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/getNewFeedbacks", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductServiceImplGetNewFeedbacksOutDTO> getNewFeedbacks(@RequestBody ProductServiceImplGetNewFeedbacksInDTO in) {
        ProductServiceImplGetNewFeedbacksOutDTO ret = new ProductServiceImplGetNewFeedbacksOutDTO();
        ret.setRetVal(productServiceImpl.getNewFeedbacks());
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/getThreeFeaturedProducts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductServiceImplGetThreeFeaturedProductsOutDTO> getThreeFeaturedProducts(@RequestBody ProductServiceImplGetThreeFeaturedProductsInDTO in) {
        ProductServiceImplGetThreeFeaturedProductsOutDTO ret = new ProductServiceImplGetThreeFeaturedProductsOutDTO();
        ret.setRetVal(productServiceImpl.getThreeFeaturedProducts());
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/getTwoBestsellersProducts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductServiceImplGetTwoBestsellersProductsOutDTO> getTwoBestsellersProducts(@RequestBody ProductServiceImplGetTwoBestsellersProductsInDTO in) {
        ProductServiceImplGetTwoBestsellersProductsOutDTO ret = new ProductServiceImplGetTwoBestsellersProductsOutDTO();
        ret.setRetVal(productServiceImpl.getTwoBestsellersProducts());
        return ResponseEntity.ok(ret);
    }

}