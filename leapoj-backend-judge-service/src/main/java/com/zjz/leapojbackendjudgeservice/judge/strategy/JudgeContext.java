package com.zjz.leapojbackendjudgeservice.judge.strategy;


import com.zjz.leapojbackendmodel.codesandbox.JudgeInfo;
import com.zjz.leapojbackendmodel.dto.question.JudgeCase;
import com.zjz.leapojbackendmodel.entity.Question;
import com.zjz.leapojbackendmodel.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
