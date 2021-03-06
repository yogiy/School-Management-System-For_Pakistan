/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.config;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.comm.SerialPort;

/**
 *
 * @author JAY KUMAR
 */
public class SMS_CONFIG {
    
    public static String[] BAUD_RATES_KEY = {"600","2400","4800","9600","7200","12000","14400","19200","38400","57600","115200","230400"};    
    public static int[] BAUD_RATES = {600,2400,4800,9600,7200,12000,14400,19200,38400,57600,115200,230400};    
    
    public static String[] DATABITS_KEY = {"5","6","7","8"};
    public static int[] DATABITS_VALUES = {SerialPort.DATABITS_5,SerialPort.DATABITS_6,SerialPort.DATABITS_7,SerialPort.DATABITS_8};
  
    public static String[] STOPBITS_KEY = {"1","1_5","2"};
    public static int[] STOPBITS_VALUES = {SerialPort.STOPBITS_1,SerialPort.STOPBITS_1_5,SerialPort.STOPBITS_2};
  
    public static String[] PARITY_KEY = {"Even","Mark","None","Odd","Space"};
    public static int[] PARITY_VALUES = {SerialPort.PARITY_EVEN,SerialPort.PARITY_MARK,SerialPort.PARITY_NONE,SerialPort.PARITY_ODD,SerialPort.PARITY_SPACE};
    
    public static int getBaudRate(String s){
        return get(s, BAUD_RATES_KEY, BAUD_RATES);
    }
    
    public static int getDatabits(String s){
        return get(s, DATABITS_KEY, DATABITS_VALUES);
    }
    
    public static int getStopbits(String s){
        return get(s, STOPBITS_KEY, STOPBITS_VALUES);
    }
    
    public static int getParity(String s){
        return get(s, PARITY_KEY, PARITY_VALUES);
    }
    
    public static String getBaudRate(int s){
        return get(s, BAUD_RATES_KEY, BAUD_RATES);
    }
    
    public static String getDatabits(int s){
        return get(s, DATABITS_KEY, DATABITS_VALUES);
    }
    
    public static String getStopbits(int s){
        return get(s, STOPBITS_KEY, STOPBITS_VALUES);
    }
    
    public static String getParity(int s){
        return get(s, PARITY_KEY, PARITY_VALUES);
    }
    
    
    public static int get(String s,String[] keys,int[] values){
        for(int i=0;i<keys.length;i++){
            if(keys[i].equals(s)){
                return values[i];
            }
        }
        try {
            throw new Exception("Item not found in Array...!");
        } catch (Exception ex) {
            Logger.getLogger(SMS_CONFIG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -200;
    }
    
    public static String get(int v,String[] keys,int[] values){
        for(int i=0;i<keys.length;i++){
            if(values[i]== v){
                return keys[i];
            }
        }
        try {
            throw new Exception("Item not found in Array...!");
        } catch (Exception ex) {
            Logger.getLogger(SMS_CONFIG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
