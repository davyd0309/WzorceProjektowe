package com.company.strategia.strzelanie;

import lombok.extern.java.Log;

/**
 * Created by Konrad on 04.06.2016.
 */
@Log
public class StrzelanieImplBazooka implements StrzelanieIntefarce {


    public void strzelam() {
        log.info("Strzelam z bazooki");
    }
}
