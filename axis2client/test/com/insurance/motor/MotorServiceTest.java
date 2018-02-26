

/**
 * MotorServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
    package com.insurance.motor;

    /*
     *  MotorServiceTest Junit test case
    */

    public class MotorServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetQuote() throws java.lang.Exception{

        com.insurance.motor.MotorServiceStub stub =
                    new com.insurance.motor.MotorServiceStub();//the default implementation should point to the right endpoint

           com.insurance.motor.MotorServiceStub.GetQuote getQuote4=
                                                        (com.insurance.motor.MotorServiceStub.GetQuote)getTestObject(com.insurance.motor.MotorServiceStub.GetQuote.class);
                    // TODO : Fill in the getQuote4 here
                
                        assertNotNull(stub.getQuote(
                        getQuote4));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetQuote() throws java.lang.Exception{
            com.insurance.motor.MotorServiceStub stub = new com.insurance.motor.MotorServiceStub();
             com.insurance.motor.MotorServiceStub.GetQuote getQuote4=
                                                        (com.insurance.motor.MotorServiceStub.GetQuote)getTestObject(com.insurance.motor.MotorServiceStub.GetQuote.class);
                    // TODO : Fill in the getQuote4 here
                

                stub.startgetQuote(
                         getQuote4,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends com.insurance.motor.MotorServiceCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultgetQuote(
                         com.insurance.motor.MotorServiceStub.GetQuoteResponse result
                            ) {
                
            }

            public void receiveErrorgetQuote(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    