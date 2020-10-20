package com.company;

import javax.swing.*;

public class Music {

    //Name of the music
    private String name;

    //Name of the singer
    private String singer;

    //The year music published
    private int year;

    public Music(String name, String singer, int year){
        this.name = name;
        this.singer = singer;
        this.year = year;
    }

    /**
     * Prints the information of the music.
     */
    public void print(){
        System.out.println("Singer is " + singer);
        System.out.printf("It is published at %d\n" , year);
    }

    public String getName(){ return name; }
    public String getSinger(){ return singer; }
}
