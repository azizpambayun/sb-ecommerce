package com.ecommerce.sbecommerce.service;

import com.ecommerce.sbecommerce.model.Category;
import com.ecommerce.sbecommerce.payload.CategoryDTO;
import com.ecommerce.sbecommerce.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);

    CategoryDTO deleteCategory(Long categoryId);

}
