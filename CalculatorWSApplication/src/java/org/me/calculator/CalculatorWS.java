/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Bolivar-1
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        //TODO write your implementation code here:
        int k = x + y;
        return k;
    }
}