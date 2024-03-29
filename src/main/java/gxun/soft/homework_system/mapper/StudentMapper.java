package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {

    //学生操作

    /**
     * 添加学生
     * @param student
     * @return
     */
    int addStudent(@Param("student") Student student);

    /**
     * 按stuId删除学生
     * @param stuId
     * @return
     */
    int deleteStudentByStudentId(@Param("stuId") Integer stuId);

    /**
     * 按stuId查找学生
     * @param stuId
     * @return
     */
    Student findStudentByStudentId(@Param("stuId") Integer stuId);

    /**
     * 按stuName查找学生
     * @param stuName
     * @return
     */
    List<Student> findStudentByStudentName(@Param("stuName") String stuName);

    /**
     * 按classId查找学生
     * @param classId
     * @return
     */
    List<Student> findStudentByClassId(@Param("classId") Integer classId);

    /**
     * 按className查找学生
     * @param className
     * @return
     */
    List<Student> findStudentByClassName(@Param("className") String className);

    /**
     * 获取所有学生
     * @return
     */
    List<Student> getAllStudent();
}
