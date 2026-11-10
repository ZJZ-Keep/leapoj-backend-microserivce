package com.zjz.leapojbackendserviceclient.service;

import com.zjz.leapojbackendmodel.entity.Question;
import com.zjz.leapojbackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author 李鱼皮
* @description 针对表【question(题目)】的数据库操作Service
* @createDate 2023-08-07 20:58:00
*/
@FeignClient(name = "leapoj-backend-question-service", path = "/api/question/inner")
public interface QuestionFeignClient {

    /**
     * 根据id获取题目提交信息
     */
    @GetMapping("/getById/questionSubmitId")
    QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") Long questionSubmitId);


    /**
     * 根据id获取题目信息
     */
    @GetMapping("/getById/question")
    Question getQuestionById(@RequestParam("questionId") Long questionId);

    /**
     * 根据id更新题目提交信息
     */
    @PostMapping("/question_submit/update")
    boolean updateById(@RequestParam("questionSubmitUpdate") QuestionSubmit questionSubmit);
}
