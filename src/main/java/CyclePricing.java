import ch.qos.logback.core.util.FileUtil;
import executor.PricingExecutor;
import helper.CycleHelper;
import model.Cycle;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CyclePricing {
    public static void main (String[] args) throws IOException, InterruptedException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Are you going to upload File ? y/n: ");
        String ip = input.readLine();
        if (ip.equals("n")) {
            System.out.println("Sample Input : " +
                    "\n2015-08-10\n" +
                    "chain,frame,handle,seat,wheel");
            System.out.println("Please provide # to stop");

            System.out.println("Please provide Date : ");
            ip = input.readLine();
            while (!ip.equals("#")) {
                Map<String, String > map=new HashMap<>();
                LocalDate date = LocalDate.parse(ip);
                System.out.println("Please provide components : ");

                System.out.println("Please provide chain : ");
                String chain = input.readLine();
                if(chain.length()>0){
                    map.put("chain",chain);
                }


                System.out.println("Please provide wheels : ");
                String wheel = input.readLine();
                if (wheel.length()>0){
                    map.put("wheel",wheel);
                }

                System.out.println("Please provide numbers of breaks for handle : ");
                String breaks = input.readLine();
                if (breaks.length()>0){
                    map.put("handle",breaks);
                }

                System.out.println("Please provide frame : ");
                String frame = input.readLine();
                if (frame.length()>0){
                    map.put("frame",frame);
                }


                System.out.println("Please provide seat : ");
                String seat = input.readLine();
                if (seat.length()>0){
                    map.put("seat",seat);
                }




                CycleHelper helper = new CycleHelper();
                Cycle cycle = helper.getCycle(map, date);

                System.out.println("Total Price : "+cycle.totalPrice());
                System.out.println("Please provide Date : ");
                ip = input.readLine();
            }
        } else {
            System.out.println("Sample Input : " +
                    "\n2015-08-10\n" +
                    "chain,frame,handle,seat,wheel");
            System.out.println("Enter the file path : ");
            ip = input.readLine();
            PricingExecutor executor = new PricingExecutor();
            File file = new File(ip);
            executor.execute(file);
        }
    }
}
