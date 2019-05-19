package com.hushunjian.gradle.mybatis.controller;

import com.hushunjian.gradle.mybatis.domain.MeetingManage;
import com.hushunjian.gradle.mybatis.service.MeetingManageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hushunjian
 */
@RequestMapping("meetingManage")
@RestController(value = "meetingManage")
public class MeetingManageController extends BaseController {

    @Autowired
    private MeetingManageService meetingManageService;

    @ResponseBody
    @GetMapping("findById")
    @ApiOperation(value = "findById")
    public Object findById(@RequestParam Long id){
        MeetingManage meetingManage = meetingManageService.findById(id);
        return success(meetingManage);
    }
}
