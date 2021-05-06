package edu.handong.csee.java.hw2.converters;

import edu.handong.csee.java.hw2.IntegratedConverter;
/**
 * This is AllConter class that convert KM to M and MILE, TON to KG and G.
 * If neither KM nor TON is inserted, an error message appears.
 */
public class AllConverter extends IntegratedConverter{
    private double fromV;
    private int kmORton;
    private double convertedV1, convertedV2;
        /**
         * AllConverter setFomValue
         * @param fromValue is from user
         * @return is for convert
         */
        public AllConverter setFromValue(double fromValue){
            this.fromV = fromValue;
            return this;
        }
        /**
         * AllConverter setOriginalMeasure
         * @param originalMeasure KM:1 TON:2 else:0
         * @return determines the calculation method and printout.
         */
        public AllConverter setOriginalMeasure(String originalMeasure){
            if(originalMeasure.equals("KM")) this.kmORton=1;
            else if(originalMeasure.equals("TON")) this.kmORton=2;
            else this.kmORton=0;
            return this;
        }
        /**
         * AllConverter convertAndPrintOut
         * @return there are 3 cases.
         */
        public AllConverter convertAndPrintOut(){
            if(kmORton==1){
                this.convertedV1=fromV*1000;
                this.convertedV2=fromV/1.6;
                System.out.println(fromV +" KM to " + convertedV1 + " M");
                System.out.println(fromV +" KM to " + convertedV2 + " MILE");
            }   
            else if(kmORton==2){
                this.convertedV1=fromV*1000;
                this.convertedV2=fromV*1000000;
                System.out.println(fromV +" TON to " + convertedV1 + " KG");
                System.out.println(fromV +" TON to " + convertedV2 + " G");
            }
            else{
                System.out.println("AllConverter cannot support the measure!");
            }
            return this;
        }
    }
