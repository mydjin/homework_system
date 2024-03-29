package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Work_question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Work_questionMapper {

    //作业-题目组成操作

    /**
     * 新增作业题目
     * @param work_question
     * @return
     */
    int addWork_question(Work_question work_question);

    /**
     * 按workId查找作业题目
     * @param workId
     * @return
     */
    List<Work_question> findWork_QuestionByWorkId(@Param("workId") Integer workId);

    /**
     * 按questionId查找作业题目
     * @param questionId
     * @return
     */
    List<Work_question> findWork_QuestionByQuestionId(@Param("questionId") Integer questionId);

    /**
     * 查找所有作业题目
     * @return
     */
    List<Work_question> getAllWork_questions();

}
