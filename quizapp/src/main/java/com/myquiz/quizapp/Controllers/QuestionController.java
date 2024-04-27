package com.myquiz.quizapp.Controllers;

import com.myquiz.quizapp.Models.Question;
import com.myquiz.quizapp.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public List<Question> getAllQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }
}
