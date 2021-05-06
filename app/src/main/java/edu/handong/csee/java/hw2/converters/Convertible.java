package edu.handong.csee.java.hw2.converters;

public interface Convertible {
    /**
     * This method set the fromValue to convert.
     * @param fromValue is from user.
     */
    public void setFromValue(double fromValue);
    /**
     * This method return the converted value.
     * @return is the converted value.
     */
    public double getConvertedValue();
    /**
     * This method convert the fromValue to convertedValue.
     */
    public void convert();

}