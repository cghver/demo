package com.tanghuachun.demo.dao;

import com.tanghuachun.demo.entity.Company;
import com.tanghuachun.demo.entity.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author darren
 */
public interface CompanyDao {
    long countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(Integer acid);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(Integer acid);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}