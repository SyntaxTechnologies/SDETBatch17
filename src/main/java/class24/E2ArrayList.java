package class24;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

       // String [] names={"add","sss"};
        ArrayList<String> names=new ArrayList<>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("John");
        names.add("Ali");
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("************************");
        for(String n:names){
            System.out.println(n);
        }
        System.out.println("************************");

        int i=0;
        while (i<names.size()){
            System.out.println(names.get(i));
            i++;
        }
    }
}
