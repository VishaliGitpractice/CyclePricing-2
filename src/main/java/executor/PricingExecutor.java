package executor;

import helper.CycleHelper;
import model.Cycle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PricingExecutor {
    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
    public void execute(File file) throws IOException, InterruptedException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line1 = br.readLine();
        String line2 = br.readLine();
        while(line1 != null && line2 != null) {
            if(executor.getActiveCount() == 10) {
                timeUnit.sleep(1);
            } else {
                while (executor.getActiveCount()<10) {
                    if (line1 != null && line2 != null){
                        Task task = new Task(line1, line2);
                        executor.execute(task);
                        line1 = br.readLine();
                        line2 = br.readLine();
                    } else {
                        break;
                    }
                }
            }
        }
    }

    class Task implements Runnable {
        LocalDate date;
        Map<String,String> comps=new HashMap<>();
        Task(String line1, String line2) {
            this.date = LocalDate.parse(line1);
            comps.put("chain",line2.split(",")[0]);
            comps.put("frame",line2.split(",")[1]);
            comps.put("handle",line2.split(",")[2]);
            comps.put("seat",line2.split(",")[3]);
            comps.put("wheel",line2.split(",")[4]);

        }
        public void run() {
            CycleHelper helper = new CycleHelper();
            Cycle cycle = helper.getCycle(this.comps, this.date);
            cycle.totalPrice();
            
        }
    }
}
