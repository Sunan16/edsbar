package com.sunan.systemStoreDesk.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.data.ProductVO;
import com.sunan.systemStoreDesk.exceptions.ResourceNotFoundException;
import com.sunan.systemStoreDesk.mapper.Mapper;
import com.sunan.systemStoreDesk.models.Product;
import com.sunan.systemStoreDesk.repositories.CategoryRepository;
import com.sunan.systemStoreDesk.repositories.ProductRepository;

@Service
public class ProductService {
    
    private Logger logger = Logger.getLogger(ProductService.class.getName());

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<ProductVO> findAll(){
        
        logger.info("Find all products");

        return Mapper.parseListObjects(productRepository.findAll(), ProductVO.class);

    }

    public ProductVO findById(Long id){

        logger.info("Beginning of the process of finding product ID: " + id);

        var entity = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID (Product)"));

        logger.info("Success in the process of finding product ID: " + id);

        return Mapper.parseObject(entity, ProductVO.class);

    }

    public ProductVO create(ProductVO product){

        logger.info("Beginning of the process of creating a product");

        if(product.getIdCategory() == null){
            throw new ResourceNotFoundException("Category is null, you need to enter it to register the product!");
        }

        var categoryEntity = categoryRepository.findById(product.getIdCategory()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID (Category) to associate with the product"));

        var entity = Mapper.parseObject(product, Product.class);

        entity.setCategory(categoryEntity);

        var vo = Mapper.parseObject(productRepository.save(entity), ProductVO.class);

        logger.info("Success in the process of creating a new product!");

        return vo;

    }

    public ProductVO update(ProductVO product){

        logger.info("Beginning of the process of updating a product ID: " + product.getId());

        var entity = productRepository.findById(product.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID (Product)"));

        entity.setCategory(categoryRepository.findById(product.getIdCategory()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID (Category)")));
        entity.setDescription(product.getDescription());
        entity.setImgUrl(product.getImgUrl());
        entity.setName(product.getName());
        entity.setPrice(product.getPrice());
        entity.setPriority(product.getPriority());
        entity.setSize(product.getSize());
        entity.setStock(product.getStock());

        var vo = Mapper.parseObject(productRepository.save(entity), ProductVO.class);

        logger.info("Success in the process of updating a product!");

        return vo;

    }

    public void delete(Long id){
        
        logger.info("Beginning of the process of deleting product ID: " + id);

        var entity = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID (Product)"));

        productRepository.delete(entity);

        logger.info("Success in the process of deleting a product!");

    }

}
