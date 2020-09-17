package com.tfswufe.mapper;

import com.tfswufe.pojo.SmbmsBill;
import com.tfswufe.pojo.SmbmsBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmbmsBillMapper {
    long countByExample(SmbmsBillExample example);

    int deleteByExample(SmbmsBillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmbmsBill record);

    int insertSelective(SmbmsBill record);

    List<SmbmsBill> selectByExample(SmbmsBillExample example);

    SmbmsBill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmbmsBill record, @Param("example") SmbmsBillExample example);

    int updateByExample(@Param("record") SmbmsBill record, @Param("example") SmbmsBillExample example);

    int updateByPrimaryKeySelective(SmbmsBill record);

    int updateByPrimaryKey(SmbmsBill record);
}