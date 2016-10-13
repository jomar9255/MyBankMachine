/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;

public class ATM {
    private String bankName;
    private double accntBalance;
    
    /**
     * 
     */
    public ATM(){
        bankName = "Unknown";
        accntBalance = 0.00;
    }
    
    public ATM(String bank){
        bankName = bank;
        accntBalance = 0.00;
    }
    
    public ATM(String bank, double balance){
        bankName = bank;
        accntBalance = balance;
    }
    
    /**
     * withdraw(String input) casts the parameter to a double, and returns a 
     * double. Returns -1 if the withdrawal exceeds the bank account balance. 
     * @param input
     * @return 
     */
    public double withdraw(String input){
        double in = Double.parseDouble(input);
        if(in > accntBalance){
            return -1;
        }else{
            accntBalance -= in;
            return accntBalance;
        }
    }
    /**
     * withdraw(double input) returns a double. Returns -1 if the withdrawal 
     * exceeds the bank account balance. 
     * @param input
     * @return 
     */
    public double withdraw(double input){
        double in = input;
        if(in > accntBalance){
            return -1;
        }else{
            accntBalance -= in;
            return accntBalance;
        }
    }
    
    public double deposit(String input){
        double in = Double.parseDouble(input);
        accntBalance += in;
        return accntBalance;
        }
    
    public double deposit(double input){
        double in = input;
        accntBalance += in;
        return accntBalance;
    }
    
    public double dailyInterest(double p, double i, double n){
       double output;
       double finAmnt = p * Math.pow(1+i, n);
       output = accntBalance + finAmnt;
       return output;
    }
    
    public String toString(){
        String output;
        output = "-----------------------"
               + "\nBank: " + bankName
               + "\nCurrent Balance: " + accntBalance;
        
        return output;
    }
}
