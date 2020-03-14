package org.example;
import org.example.Behavioural.AdapterPattern;
import org.example.Behavioural.ProxyPattern;
import org.example.Creational.FactoryMethodPattern;
import org.example.Creational.PrototypeDesignPattern;
import org.example.Structural.IteratorPattern;
import org.example.Structural.TemplatePattern;

import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

//        System.out.println( "Hello World!" );
        AdapterPattern Ap=new AdapterPattern();
        ProxyPattern PP=new ProxyPattern();
        FactoryMethodPattern FMP=new FactoryMethodPattern();
        PrototypeDesignPattern PDP=new PrototypeDesignPattern();
        IteratorPattern IP=new IteratorPattern();
        TemplatePattern TP=new TemplatePattern();
    }
}
