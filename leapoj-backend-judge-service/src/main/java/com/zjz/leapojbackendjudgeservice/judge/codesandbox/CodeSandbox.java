package com.zjz.leapojbackendjudgeservice.judge.codesandbox;


import com.zjz.leapojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.zjz.leapojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
