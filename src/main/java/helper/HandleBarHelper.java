package helper;

import model.HandleBar;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HandleBarHelper {

    public HandleBar getHandleBar(LocalDate date, String NUmberofBrakes) {
        Map<String,Double> hashMap=new HashMap<>();
        hashMap.put("2016-12-01/2018-12-01",300d);
        hashMap.put("2018-12-02/2020-12-01",400d);
        HandleBar handleBar = new HandleBar();
        boolean assigned=false;
        for (Map.Entry<String,Double> maps: hashMap.entrySet()){
            String[] s=maps.getKey().split("/");
            if(date.isAfter(LocalDate.parse(s[0])) && date.isBefore(LocalDate.parse(s[1]))){
                handleBar.setBrakesPrice(Integer.parseInt(NUmberofBrakes)*maps.getValue());
                assigned=true;
            }
        }
        if(assigned==false){
            handleBar.setBrakesPrice(Integer.parseInt(NUmberofBrakes)*150d);
        }
        return handleBar;
    }
}
