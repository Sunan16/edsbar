package com.sunan.systemStoreDesk.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.data.CategoryVO;
import com.sunan.systemStoreDesk.exceptions.ResourceNotFoundException;
import com.sunan.systemStoreDesk.mapper.Mapper;
import com.sunan.systemStoreDesk.models.Category;
import com.sunan.systemStoreDesk.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    private Logger logger = Logger.getLogger(CategoryService.class.getName());

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryVO> findAll(){
        
        logger.info("Find all categorys");

        return Mapper.parseListObjects(categoryRepository.findAll(), CategoryVO.class);

    }

    public CategoryVO findById(Long id){

        logger.info("Beginning of the process of finding category ID: " + id);

        var entity = categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID (Category)"));

        logger.info("Success in the process of finding category ID: " + id);

        return Mapper.parseObject(entity, CategoryVO.class);

    }

    public CategoryVO create(CategoryVO category){

        logger.info("Beginning of the process of creating a category");

        var entity = Mapper.parseObject(category, Category.class);

        var vo = Mapper.parseObject(categoryRepository.save(entity), CategoryVO.class);

        logger.info("Success in the process of creating a new category!");

        return vo;

    }

    public CategoryVO update(CategoryVO category){

        logger.info("Beginning of the process of updating a category ID: " + category.getId());

        var entity = categoryRepository.findById(category.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID (Category)"));

        entity.setDescription(category.getDescription());
        entity.setName(category.getName());

        var vo = Mapper.parseObject(categoryRepository.save(entity), CategoryVO.class);

        logger.info("Success in the process of updating a category!");

        return vo;

    }

    public void delete(Long id){
        
        logger.info("Beginning of the process of deleting category ID: " + id);

        var entity = categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID (Category)"));

        categoryRepository.delete(entity);

        logger.info("Success in the process of deleting a category!");

    }

}
