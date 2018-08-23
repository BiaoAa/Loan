package com.biaoba.loan.manager.sercice.impl;

import com.biaoba.loan.bean.NplmLoanContract;
import com.biaoba.loan.iterface.LoanService;
import com.biaoba.loan.manager.mapper.NplmLoanContractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private  NplmLoanContractMapper nplmLoanContractMapper;

    @Override
    public List<NplmLoanContract> loadContractList(String pageNo1,String  pageSize1) {
        int pageNo = Integer.parseInt(pageNo1);
        int pageSize = Integer.parseInt(pageSize1);
        List<NplmLoanContract> nplmLoanContractList = nplmLoanContractMapper.loadContractList((pageNo-1)*pageSize,pageSize);
        return nplmLoanContractList;
    }

    @Override
    public Integer selectContractCount() {
        return nplmLoanContractMapper.selectContractCount();
    }


}
