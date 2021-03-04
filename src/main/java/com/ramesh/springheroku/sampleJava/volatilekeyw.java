package com.ramesh.springheroku.sampleJava;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class volatilekeyw {
    public static void main(String[] args) {
        String str = "aSONEYBBn";
        String midword = "SONEY";
        String[] chkStr = str.split(midword);
        String lftStr = chkStr[0];
        String rhtStr = chkStr[1];

        // Get Length
        int lftStrLen = lftStr.length();
        int rhtStrLen = rhtStr.length();

        if(lftStrLen==rhtStrLen){
            System.out.println("true");
        }else if(lftStrLen<rhtStrLen){
            System.out.println("false");
        }else if(lftStrLen>rhtStrLen){
            System.out.println("false");
        }
    }

}
