package com.company.strategia.model;

import com.company.strategia.latanie.LatanieImplNieLatam;
import com.company.strategia.strzelanie.StrzelanieImplKarabin;
import lombok.extern.java.Log;

/**
 * Created by Konrad on 04.06.2016.
 */
@Log
public class Optimus extends Robot {

    public Optimus() {
        latanieInterface = new LatanieImplNieLatam();
        strzelanieIntefarce = new StrzelanieImplKarabin();
        log.info("Stworzono nowego Optimusa");
    }
}
