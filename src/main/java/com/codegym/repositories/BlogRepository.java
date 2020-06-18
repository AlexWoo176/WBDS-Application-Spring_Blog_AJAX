package com.codegym.repositories;

import com.codegym.models.Blog;
import com.codegym.models.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category category);

    Iterable<Blog> findByNameBlogContaining(String nameBlog);
}