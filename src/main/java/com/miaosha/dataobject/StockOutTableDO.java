package com.miaosha.dataobject;

import java.util.Date;

public class StockOutTableDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_out_table.id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_out_table.stockin_dept_id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    private Integer stockinDeptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_out_table.stockout_dept_id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    private Integer stockoutDeptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_out_table.add_time
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    private Date addTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_out_table.id
     *
     * @return the value of stock_out_table.id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_out_table.id
     *
     * @param id the value for stock_out_table.id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_out_table.stockin_dept_id
     *
     * @return the value of stock_out_table.stockin_dept_id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    public Integer getStockinDeptId() {
        return stockinDeptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_out_table.stockin_dept_id
     *
     * @param stockinDeptId the value for stock_out_table.stockin_dept_id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    public void setStockinDeptId(Integer stockinDeptId) {
        this.stockinDeptId = stockinDeptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_out_table.stockout_dept_id
     *
     * @return the value of stock_out_table.stockout_dept_id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    public Integer getStockoutDeptId() {
        return stockoutDeptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_out_table.stockout_dept_id
     *
     * @param stockoutDeptId the value for stock_out_table.stockout_dept_id
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    public void setStockoutDeptId(Integer stockoutDeptId) {
        this.stockoutDeptId = stockoutDeptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_out_table.add_time
     *
     * @return the value of stock_out_table.add_time
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_out_table.add_time
     *
     * @param addTime the value for stock_out_table.add_time
     *
     * @mbg.generated Wed Apr 17 09:01:58 CST 2019
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}