package com.amiyasahu.spm.dao;

import com.amiyasahu.spm.model.Product;
import com.amiyasahu.spm.model.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    long countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int deleteByPrimaryKey(String productcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    List<Product> selectByExampleWithBLOBs(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    Product selectByPrimaryKey(String productcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int updateByPrimaryKeyWithBLOBs(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    int updateByPrimaryKey(Product record);
}