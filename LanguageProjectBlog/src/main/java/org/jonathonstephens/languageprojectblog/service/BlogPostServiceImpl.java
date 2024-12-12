package org.jonathonstephens.languageprojectblog.service;

import org.jonathonstephens.languageprojectblog.model.BlogPost;
import org.jonathonstephens.languageprojectblog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Override
    public void createBlogPost(BlogPost post) {
        post.setCreatedAt(LocalDateTime.now()); // Set creation timestamp
        blogPostRepository.save(post);
    }

    @Override
    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    @Override
    public Optional<BlogPost> getBlogPostById(Long id) {
        return blogPostRepository.findById(id);
    }

    @Override
    public void updateBlogPost(Long id, BlogPost updatedPost) {
        Optional<BlogPost> existingPost = blogPostRepository.findById(id);
        if (existingPost.isPresent()) {
            BlogPost post = existingPost.get();
            post.setTitle(updatedPost.getTitle());
            post.setContent(updatedPost.getContent());
            // You can add more fields to update here if needed
            blogPostRepository.save(post);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Blog post not found with ID: " + id);
        }

    }

    @Override
    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }
}