package com.zjz.leapojbackendjudgeservice.judge;

import com.zjz.leapojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.zjz.leapojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.zjz.leapojbackendjudgeservice.judge.strategy.JudgeContext;
import com.zjz.leapojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.zjz.leapojbackendmodel.codesandbox.JudgeInfo;
import com.zjz.leapojbackendmodel.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
