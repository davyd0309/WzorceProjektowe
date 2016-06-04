package com.company.strategia.model;

import com.company.strategia.latanie.LatanieImplOdrzutowe;
import com.company.strategia.strzelanie.StrzelanieImplBazooka;
import lombok.extern.java.Log;

/**
 * Created by Konrad on 04.06.2016.
 */
@Log
public class Terminator extends Robot{

    public Terminator() {
        latanieInterface = new LatanieImplOdrzutowe();
        strzelanieIntefarce = new StrzelanieImplBazooka();
        log.info("Stworzono nowego Terminatora");
    }


}
