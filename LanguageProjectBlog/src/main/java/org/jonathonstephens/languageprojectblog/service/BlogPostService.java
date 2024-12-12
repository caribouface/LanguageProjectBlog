package org.jonathonstephens.languageprojectblog.service;

import org.jonathonstephens.languageprojectblog.model.BlogPost;
import java.util.List;
import java.util.Optional;

public interface BlogPostService {
    void createBlogPost(BlogPost post); // Defines a method to create a new blog post
    List<BlogPost> getAllBlogPosts(); // Defines a method to retrieve all blog posts

    Optional<BlogPost> getBlogPostById(Long id);

    void updateBlogPost(Long id, BlogPost updatedPost);

    void deleteBlogPost(Long id);
}