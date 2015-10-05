/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author Bolivar-1
 */
public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int x = 3;
            int y = 4;
            int result = add(x, y);
            System.out.println("Result = " + result);
        }
        catch (Exception ex){
            System.out.println("Exception: " + ex);
        }
        
    }

    private static int add(int x, int y) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(x, y);
    }
    
}
