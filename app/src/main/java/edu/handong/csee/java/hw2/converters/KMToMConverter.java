package edu.handong.csee.java.hw2.converters;
/**
 * KM to M
 * This class implements Convertible.
 */
public class KMToMConverter implements Convertible{
private double fromV;
private double convertedV;
/**
 * This method set the fromValue to convert.
 */
    public void setFromValue(double fromValue){
        fromV = fromValue;
    }
/**
 * This method return the converted value.
 */
    public double getConvertedValue(){
        return convertedV;
    }
/**
 * This method convert fromV to converted V.
 */
    public void convert(){
        convertedV = fromV * 1000;
    }
}
