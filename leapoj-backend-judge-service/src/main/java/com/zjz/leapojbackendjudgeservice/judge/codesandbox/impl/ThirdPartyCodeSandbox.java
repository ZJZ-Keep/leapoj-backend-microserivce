package com.zjz.leapojbackendjudgeservice.judge.codesandbox.impl;

import com.zjz.leapojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.zjz.leapojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.zjz.leapojbackendmodel.codesandbox.ExecuteCodeResponse;



/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
