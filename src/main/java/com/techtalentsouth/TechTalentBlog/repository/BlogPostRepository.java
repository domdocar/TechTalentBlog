package com.techtalentsouth.TechTalentBlog.repository;

import org.springframework.data.repository.CrudRepository;

import com.techtalentsouth.TechTalentBlog.model.BlogPostProperties;

public interface BlogPostRepository extends CrudRepository<BlogPostProperties, Long> {

}