package com.example.question.repository;

import com.example.question.form.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> getQuestionsByFormID(Long formId);
    //Page<Question> getQuestionsByFormID(Long formId, Pageable pageable);
}
