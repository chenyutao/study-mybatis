package pers.tao.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tao.demo.entity.User;
import pers.tao.demo.entity.UserExample;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    /**
     *
     * @param record
     * @return
     */
    int insert(User record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}