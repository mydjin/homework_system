package gxun.soft.homework_system.controller.admin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import gxun.soft.homework_system.component.ToJsonArray;
import gxun.soft.homework_system.domain.MyClass;
import gxun.soft.homework_system.service.MyClassService;
import gxun.soft.homework_system.utils.S;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClassManageController {

    @Autowired
    private MyClassService myClassService;

    @ApiOperation(value = "班级列表")
    @GetMapping("/classList")
    public String getClassList(Model model){
      List<MyClass> myClassList = myClassService.getAllClasses();
        model.addAttribute("myClassList", myClassList);
        return "admin/classList";
//        return myClassList;
    }

    @ApiOperation(value = "班级查询")
    @PostMapping("/findByClassName")
    @ResponseBody
    public List<MyClass> findByClassName(@RequestParam("className")String className, Model model){
        List<MyClass> myClassList = myClassService.findClassByClassName(className);
        model.addAttribute("myClassList", myClassList);
        System.err.println(myClassList);
        return myClassList;
    }

    //跳转到添加页面
    @RequestMapping("/toaddclass")
    public String toaddclass(){
        return "admin/classAdd";
    }

    //添加功能
    @ApiOperation(value = "班级添加")
    @PostMapping("/addClass")
    @ResponseBody
    public Integer addClass(@RequestParam("className")String className,@RequestParam("classId") Integer classId,
                                   MyClass myClass){
//       MyClass myClass = new MyClass();
//        myClass.setClassId(classId);
//        myClass.setClassName(className);
//        System.out.println("MyClass>>>>>>>>" + myClass.toString());
//        myClassService.addClass(myClass);
//        List<MyClass> myClassList = myClassService.getAllClasses();
        System.err.println(myClass);
        return myClassService.addClass(myClass);
    }

    @ApiOperation(value = "班级删除")
    @GetMapping("/deleteClass")

    public Object deleteClass( Integer classId){
       myClassService.deleteClassByClassId(classId);
//        List<MyClass> myClassList = myClassService.getAllClasses();
//        model.addAttribute("myClassList", myClassList)
       return "admin/classList";
//        return myClassService.getAllClasses();
    }

}
