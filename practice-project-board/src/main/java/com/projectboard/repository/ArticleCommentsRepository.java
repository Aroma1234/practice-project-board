package com.projectboard.repository;

import com.projectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentsRepository extends JpaRepository<ArticleComment, Long> {
}
