package com.company.strategia.model;

import com.company.strategia.latanie.LatanieInterface;
import com.company.strategia.strzelanie.StrzelanieIntefarce;
import lombok.Data;

/**
 * Created by Konrad on 04.06.2016.
 */

@Data
public abstract class Robot {

    protected String name;
    protected LatanieInterface latanieInterface;
    protected StrzelanieIntefarce strzelanieIntefarce;


    public void lec(){
        latanieInterface.lec();
    }

    public void strzelam(){
        strzelanieIntefarce.strzelam();
    }



}
