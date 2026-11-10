package com.zjz.leapojbackenduserservice.controller.inner;

import com.zjz.leapojbackendmodel.entity.User;
import com.zjz.leapojbackendserviceclient.service.UserFeignClient;
import com.zjz.leapojbackenduserservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/inner")
public class UserInnerController implements UserFeignClient {

    @Resource
    private UserService userService;

    /**
     * 根据 id 获取用户
     *
     * @param userId
     * @return
     */
    @GetMapping("/get/id")
    public User getById(@RequestParam("userId") Long userId){
        return userService.getById(userId);
    };

    /**
     * 根据 id 列表获取用户列表
     *
     * @param ids
     * @return
     */
    @GetMapping("/list/ids")
    public List<User> listByIds(@RequestParam("idList") Set<Long> ids){
        return userService.listByIds(ids);
    };


}
