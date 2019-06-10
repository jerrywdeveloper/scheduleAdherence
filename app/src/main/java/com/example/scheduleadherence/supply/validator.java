package com.example.scheduleadherence.supply;

import androidx.annotation.Nullable;

import java.util.HashMap;

public class validator{

    public validator(){
    }

    public String valid(String str){
        String message_returned ="valid";


        return message_returned;
    }

    public boolean existing(String str, HashMap map){
        return map.containsKey(str);
    }

    /*Methods*/
    //Length test
    protected boolean strLenCheck(String str){
        return (str.length() > 8);
    }

    //Special character test
    protected boolean strSpecial(String str){
        return str.toLowerCase().replaceAll("[a-z0-9 ]","").length() >= 1;
    }

    //Contains number test
    protected boolean strNum(String str){
        return str.matches("(.*)[0-9](.*)");
    }

    //Contains casing test
    protected boolean strCase(String str){
        return (str.matches("(.*)[A-Z](.*)") && str.matches("(.*)[a-z](.*)"));
    }



}
