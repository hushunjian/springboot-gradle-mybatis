package com.hushunjian.gradle.mybatis.service;


import com.hushunjian.gradle.mybatis.domain.MeetingManage;
import com.hushunjian.gradle.mybatis.mapper.MeetingManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author hushunjian
 */
@Service
public class MeetingManageService {

    @Autowired
    private MeetingManageMapper meetingManageMapper;

    public MeetingManage findById(Long id) {
        return meetingManageMapper.selectByPrimaryKey(id);
    }
}
