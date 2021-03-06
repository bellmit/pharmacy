package com.miaosha.dao;

import com.miaosha.dataobject.MedicineTableDO;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MedicineTableDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicine_table
     *
     * @mbg.generated Thu Apr 11 15:00:55 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicine_table
     *
     * @mbg.generated Thu Apr 11 15:00:55 CST 2019
     */
    int insert(MedicineTableDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicine_table
     *
     * @mbg.generated Thu Apr 11 15:00:55 CST 2019
     */
    int insertSelective(MedicineTableDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicine_table
     *
     * @mbg.generated Thu Apr 11 15:00:55 CST 2019
     */
    MedicineTableDO selectByPrimaryKey(Integer id);
    List<MedicineTableDO> selectAll();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicine_table
     *
     * @mbg.generated Thu Apr 11 15:00:55 CST 2019
     */
    int updateByPrimaryKeySelective(MedicineTableDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicine_table
     *
     * @mbg.generated Thu Apr 11 15:00:55 CST 2019
     */
    int updateByPrimaryKey(MedicineTableDO record);
}