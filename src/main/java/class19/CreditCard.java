package class19;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

/*
Create a class CreditCard Create an instance method that will calculate
interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes

 */
public class CreditCard {

   public   void calInterest(double balance){
        System.out.println(balance*0.05);
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{

    @Override
    public void calInterest(double balance) {
        System.out.println(balance*0.07);
    }
}