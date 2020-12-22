package com.tensquare.base.dao;

/**
 * @author 刘  杨
 * @date 2020-12-21 15:09
 */

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 标签数据访问接口
 */
public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {

}
