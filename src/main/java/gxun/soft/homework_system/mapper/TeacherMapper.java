package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherMapper {

    //教师操作

    /**
     * 添加教师
     * @param teacher
     * @return
     */
    int addTeacher(@Param("teacher") Teacher teacher);

    /**
     * 按teaId删除教师
     * @param teaId
     * @return
     */
    int deleteTeacherByTeacherId(@Param("teaId") Integer teaId);

    /**
     * 按teaId查找教师
     * @param teaId
     * @return
     */
    Teacher findTeacherByTeacherId(@Param("teaId") Integer teaId);

    /**
     * 按teaName查找教师
     * @param teaName
     * @return
     */
    List<Teacher> findTeacherByTeacherName(@Param("teaName") String teaName);

    /**
     * 按classId查询教师
     * @param classId
     * @return
     */
    List<Teacher> findTeacherByClassId(@Param("classId") Integer classId);

    /**
     * 获取所有教师
     * @return
     */
    List<Teacher> getAllTeacher();
}
