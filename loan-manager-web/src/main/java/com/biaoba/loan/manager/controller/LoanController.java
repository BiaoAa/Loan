package com.biaoba.loan.manager.controller;


import com.alibaba.fastjson.JSON;
import com.biaoba.loan.bean.NplmLoanContract;
import com.biaoba.loan.iterface.LoanService;
import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoanController {

    @Autowired
    private LoanService loanService;

    @RequestMapping("index")
    public String index(){
        return "smp";
    }

    @RequestMapping("loanlist")
    public String loanList(){
        return "loanlist";
    }



   @RequestMapping("loancontract")
    public String loancontract(HttpServletRequest request,String page){
        String pageSize="10";
        Integer count = loanService.selectContractCount();
        request.setAttribute("total",count);
        return "loancontract";
    }

    @ResponseBody
    @RequestMapping("getLoanContractList")
    public Map<String, Object> getLoanContractList(HttpServletRequest request){
        String page = request.getParameter("page");
        String pageSize = request.getParameter("rows");


        Integer count = loanService.selectContractCount();
        List<NplmLoanContract> contractList = loanService.loadContractList(page,pageSize);
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("rows",contractList);
        resultMap.put("total",count);
        return resultMap;
    }

    @RequestMapping("paymentlist")
    public String repanment( Integer id){
        return "repanment";
    }
}
