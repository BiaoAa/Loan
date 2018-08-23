package com.biaoba.loan.manager.mapper;


import com.biaoba.loan.bean.NplmLoanContract;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmLoanContractMapper extends Mapper<NplmLoanContract> {


    List<NplmLoanContract> loadContractList(@Param("pageNo") int pageNo,@Param("pageSize") int pageSize);

    Integer selectContractCount();
}
