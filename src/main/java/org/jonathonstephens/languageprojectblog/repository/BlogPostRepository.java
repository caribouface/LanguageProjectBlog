package org.jonathonstephens.languageprojectblog.repository;


import org.apache.catalina.User;
import org.jonathonstephens.languageprojectblog.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

}