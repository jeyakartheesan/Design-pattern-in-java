package com.jk;

import com.friends.HeroPen;
import com.friends.PoiltPen;

public class PenAdapter implements Pen{
    PoiltPen poiltPen=new PoiltPen();
    HeroPen heroPen=new HeroPen();
    @Override
    public void write(String str) {
        poiltPen.mark(str);
        heroPen.mark(str);

    }
}
