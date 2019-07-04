package gxun.soft.homework_system.controller.admin;

import com.alibaba.fastjson.JSONArray;
import gxun.soft.homework_system.component.ToJsonArray;
import gxun.soft.homework_system.domain.MyClass;
import gxun.soft.homework_system.service.MyClassService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClassManageController {

    @Autowired
    private MyClassService myClassService;
    private ToJsonArray toJsonArray = new ToJsonArray();

    @ApiOperation(value = "班级管理")
    @GetMapping("/classList")
    public String classManage(){
        return "admin/classList";
    }

    @ApiOperation(value = "查询所有班级")
    @GetMapping("/findAllClassList")
    public JSONArray getClassList(){
        List<MyClass> myClassList = myClassService.getAllClasses();
        return toJsonArray.classListToJsonArray(myClassList);
    }

}