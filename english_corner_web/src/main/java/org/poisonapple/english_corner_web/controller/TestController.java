package org.poisonapple.english_corner_web.controller;

import org.poisonapple.english_corner_model.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @Author: 17Wang
 * @Date: 13:59 2019/2/23
 */
@RestController
public class TestController {
    @Autowired
    private TestDao testDao;

    @GetMapping("/")
    public String test(){
        return testDao.printTest();
    }
}
