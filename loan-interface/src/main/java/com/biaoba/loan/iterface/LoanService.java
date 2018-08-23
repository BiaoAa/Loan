package com.biaoba.loan.iterface;

import com.biaoba.loan.bean.NplmLoanContract;

import java.util.List;

public interface LoanService {


    List<NplmLoanContract> loadContractList(String pageNo, String pageSize);

    Integer selectContractCount();

    // String selectContractCount();
}
