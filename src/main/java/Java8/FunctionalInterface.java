package Java8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created by Soumya on Oct,2020
 */
@java.lang.FunctionalInterface
interface FunctionalInterface {
    public void m1();
}

/*class Ola implements FunctionalInterface{
  *//*  @Override
    public void m1() {
        System.out.println("FI overridden");
    }*//*
    ()->System.out.print("FI overridden");
}*/
 class Test{
     public static void main(String[] args) {
         System.out.println("FI");

         /*   Ola ola= new Ola();
         ola.m1();*/
         //Using Lambda Expresssion
         FunctionalInterface functionalInterface= ()->System.out.println("Running method using lambda Expressions ");
         functionalInterface.m1();
     }
 }
