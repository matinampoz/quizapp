package com.myquiz.quizapp.Services;

import com.myquiz.quizapp.DAO.QuestionDAO;
import com.myquiz.quizapp.DAO.QuizDAO;
import com.myquiz.quizapp.Models.Question;
import com.myquiz.quizapp.Models.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDAO quizDAO;
    @Autowired
    QuestionDAO questionDAO;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDAO.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
    }
}
