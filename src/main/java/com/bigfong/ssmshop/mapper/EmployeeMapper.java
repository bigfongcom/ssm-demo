package com.bigfong.ssmshop.mapper;


import com.bigfong.ssmshop.domain.Employee;
import com.bigfong.ssmshop.query.QueryObject;

import java.util.List;


/***********************************************************************
 *
 * @author fenfenglee
 * @create-time 2018年11月3日 下午10:15:40
 * @revision $Id: 1.0
 * 
 ***********************************************************************/

public interface EmployeeMapper {
    List<EmployeeMapper> queryForList(QueryObject qo);
    List<Employee> listAll();
}
