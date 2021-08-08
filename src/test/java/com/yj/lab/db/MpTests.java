//package com.yj.lab.db;
//
//import com.alibaba.fastjson.JSON;
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.lenovo.user.profile.core.model.rdb.entity.primary.ModularExtractGroup;
//import com.lenovo.user.profile.core.model.rdb.mapper.primary.ModularExtractGroupMapper;
//import com.lenovo.user.profile.core.model.viewobject.request.LabelSelectionConditionVo;
//import com.lenovo.user.profile.core.model.viewobject.response.common.UserInfo;
//import com.lenovo.user.profile.core.service.impl.ModularExtractGroupServiceImpl;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MpTests {
//
//    @Autowired
//    private ModularExtractGroupMapper mapper;
//    @Autowired
//    private ModularExtractGroupServiceImpl service;
//
//    @Test
//    public void testSelect() {
//
//        Integer modularId = 2626;
//        ModularExtractGroup modularExtractGroup = mapper.selectById(modularId);
//        log.info(JSON.toJSONString(modularExtractGroup));
//
//    }
//
//
//    @Test
//    public void testWrapper() {
//        LambdaQueryWrapper<ModularExtractGroup> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(ModularExtractGroup::getGroupType, 10);
//        wrapper.eq(ModularExtractGroup::getOperateStatus, 2);
//        wrapper.orderByDesc(ModularExtractGroup::getCreateTime);
//        List<ModularExtractGroup> groups = mapper.selectList(wrapper);
////        List<ModularExtractGroup> groups2 = service.list(wrapper);
//    }
//
//
//    @Test
//    public void testPage() {
//
//        LambdaQueryWrapper<ModularExtractGroup> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(ModularExtractGroup::getGroupType, 10);
//        wrapper.eq(ModularExtractGroup::getOperateStatus, 2);
//
//        Page<ModularExtractGroup> page = new Page<>(1, 2);
//        Page<ModularExtractGroup> pageGroups = mapper.selectPage(page, wrapper);
//
//
//    }
//
//    @Test
//    public void testGetProfileCount() {
//        String json = "{\"@type\":\"com.lenovo.user.profile.core.model.viewobject.request.LabelSelectionConditionVo\",\"buyAndUseCount\":39883,\"buyCount\":931495,\"empty\":false,\"goodsCategory\":{\"name\":\"小新\",\"value\":\"1\"},\"name\":\"小新最近一年\",\"timeDimension\":{\"endTime\":{\"name\":\"结束时间：2021-07-01\",\"value\":\"1625131190486\"},\"startTime\":{\"name\":\"开始时间：2020-07-01\",\"value\":\"1593595190486\"}},\"useCount\":1055857,\"userCount\":931495,\"userDimension\":{\"children\":[],\"name\":\"购买\",\"value\":\"1\"}}";
//        LabelSelectionConditionVo labelSelectionCondition = JSON.parseObject(json,
//                LabelSelectionConditionVo.class);
//
//        ModularExtractGroup modularExtractGroup = service.saveModularExtractGroup(labelSelectionCondition, new UserInfo());
//
//        service.saveProfile(modularExtractGroup);
//    }
//
//
//}
