package helper;

import model.Frame;

import java.time.LocalDate;
import java.util.*;

public class FrameHelper {


    public Frame getFrame(LocalDate date,String frames) {
        HashMap<String,Map<String,Double>> hashMap=new HashMap<>();
        Map<String,Double> steelfram=new HashMap<String,Double>();
        steelfram.put("2016-12-01/2018-12-01",100d);
        steelfram.put("2018-12-02/2020-12-01",200d);
        hashMap.put("steelframe",steelfram);
        Map<String,Double> ironframe=new HashMap<String,Double>();
        ironframe.put("2016-12-01/2018-12-01",300d);
        ironframe.put("2018-12-02/2020-12-01",400d);
        hashMap.put("ironframe",ironframe);


        Frame frame = new Frame();
        if (hashMap.containsKey(frames)) {
            Map<String,Double> sets= hashMap.get(frames);
            boolean assigned=false;
            for(Map.Entry<String,Double> m :sets.entrySet()){
                String[] s=m.getKey().split("/");
                if(date.isAfter(LocalDate.parse(s[0])) && date.isBefore(LocalDate.parse(s[1]))){
                    frame.setRodPrice(m.getValue());
                    assigned=true;
                }
            }
            if (assigned==false){
                frame.setRodPrice(500d);
            }
        }
        else {
            frame.setRodPrice(500d);
        }
        return frame;
    }
}
