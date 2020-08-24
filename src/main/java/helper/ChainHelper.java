package helper;

import model.Chain;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.*;

public class ChainHelper {



    public Chain getChain(LocalDate date) {
        Chain chain = new Chain();
        if (date.isBefore(LocalDate.parse("2016-12-01"))) {
            chain.setNutsPrice(120d);
        } else {
            chain.setNutsPrice(150d);
        }
        return chain;
    }
}
