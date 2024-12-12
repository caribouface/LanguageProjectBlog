package org.jonathonstephens.languageprojectblog.controller;

import org.jonathonstephens.languageprojectblog.model.BlogPost;
import org.jonathonstephens.languageprojectblog.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        List<BlogPost> posts = blogPostService.getAllBlogPosts();
        for (BlogPost post : posts) {
            String editUrl = "/posts/" + post.getId() + "/edit";
            model.addAttribute("editUrl", editUrl); // Add this line
        }
        model.addAttribute("posts", posts);
        model.addAttribute("newPost", new BlogPost());
        return "blog";
    }

    @PostMapping("/posts")
    public String createPost(@ModelAttribute BlogPost post) {
        blogPostService.createBlogPost(post);
        return "redirect:/blog";
    }

    @GetMapping("/posts/{id}")
    public String viewPost(@PathVariable Long id, Model model) {
        Optional<BlogPost> post = blogPostService.getBlogPostById(id);
        if (post.isPresent()) {
            model.addAttribute("post", post.get());
            return "blogpost"; // Updated view name
        } else {
            return "error";
        }
    }

    @GetMapping("/posts/{id}/edit")
    public String editPost(@PathVariable Long id, Model model) {
        Optional<BlogPost> post = blogPostService.getBlogPostById(id);
        if (post.isPresent()) {
            model.addAttribute("post", post.get());
            return "edit_post"; // View for editing the post
        } else {
            return "error";
        }
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable Long id, @ModelAttribute BlogPost updatedPost) {
        blogPostService.updateBlogPost(id, updatedPost);
        return "redirect:/posts/" + id; // Redirect to the updated post
    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable Long id) {
        blogPostService.deleteBlogPost(id);
        return "redirect:/blog"; // Redirect to the blog post list
    }
}
