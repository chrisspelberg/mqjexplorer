// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MaxMsgLength.java

package com.kolban.mqjexplorer.mqattributes;

// Referenced classes of package com.kolban.mqjexplorer.mqattributes:
//            NumericTextField

public class MaxMsgLength extends NumericTextField
{

    public MaxMsgLength()
    {
    }

    public int getValue()
    {
        return Integer.parseInt(getText());
    }

    public void setValue(int i)
    {
        setText(Integer.toString(i));
    }

    public static String toString(int i)
    {
        return Integer.toString(i);
    }
}
