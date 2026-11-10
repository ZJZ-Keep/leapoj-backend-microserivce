package com.zjz.leapojbackendquesionservice.controller.inner;

import com.zjz.leapojbackendmodel.entity.Question;
import com.zjz.leapojbackendmodel.entity.QuestionSubmit;
import com.zjz.leapojbackendquesionservice.service.QuestionService;
import com.zjz.leapojbackendquesionservice.service.QuestionSubmitService;
import com.zjz.leapojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;
    /**
     * 根据id获取题目提交信息
     */
    @GetMapping("/getById/questionSubmitId")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") Long questionSubmitId){
        return questionSubmitService.getById(questionSubmitId);
    };


    /**
     * 根据id获取题目信息
     */
    @GetMapping("/getById/question")
    public Question getQuestionById(@RequestParam("questionId") Long questionId){
        return questionService.getById(questionId);
    };

    /**
     * 根据id更新题目提交信息
     */
    @PostMapping("/question_submit/update")
    public boolean updateById(@RequestParam("questionSubmitUpdate") QuestionSubmit questionSubmit){
        return questionSubmitService.updateById(questionSubmit);
    };
}
