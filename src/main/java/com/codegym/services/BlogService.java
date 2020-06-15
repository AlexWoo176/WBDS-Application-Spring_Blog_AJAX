package com.codegym.services;

import com.codegym.models.Blog;
import com.codegym.models.Category;

public interface BlogService extends GeneralService<Blog> {
    Iterable<Blog> findAllByCategory(Category category);

    Iterable<Blog> findByNameBlogContaining(String nameBlog);
}
