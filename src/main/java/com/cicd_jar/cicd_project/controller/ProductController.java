package com.cicd_jar.cicd_project.controller;

import com.cicd_jar.cicd_project.model.entity.ProductEntity;
import com.cicd_jar.cicd_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * packageName : com.cicd_jar.cicd_project.controller
 * fileName    : ProductController
 * author      : jaejun
 * date        : 2024-10-18
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-18         jaejun
 */
@Controller  // @RestController 대신 @Controller 사용
public class ProductController {

    @Autowired
    private ProductService productService;

    // 제품 목록을 렌더링하여 Thymeleaf 템플릿으로 반환
    @GetMapping("/products")
    public String getAllProducts(Model model) {
        List<ProductEntity> products = productService.getAllProducts();
        model.addAttribute("products", products);  // 데이터를 모델에 추가
        return "product-list";  // Thymeleaf 템플릿 파일 이름 (product-list.html)
    }

    // 특정 제품을 렌더링하여 상세 페이지로 반환
    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable Long id, Model model) {
        ProductEntity product = productService.getProductById(id).orElse(null);
        model.addAttribute("product", product);  // 데이터를 모델에 추가
        return "product-detail";  // Thymeleaf 템플릿 파일 이름 (product-detail.html)
    }

    // 새로운 제품을 추가하고, 리스트 페이지로 리다이렉트
    @PostMapping("/products")
    public String createProduct(@RequestBody ProductEntity product, Model model) {
        productService.createProduct(product);
        return "redirect:/products";  // 제품 생성 후 다시 목록 페이지로 리다이렉트
    }

    // 특정 제품 업데이트 (간단한 예시로 보여줌)
    @PostMapping("/products/update/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody ProductEntity productDetails, Model model) {
        productService.updateProduct(id, productDetails);
        return "redirect:/products";  // 업데이트 후 리스트 페이지로 리다이렉트
    }

    // 제품 삭제 후 제품 목록 페이지로 리다이렉트
    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/products";  // 삭제 후 리스트 페이지로 리다이렉트
    }
}
