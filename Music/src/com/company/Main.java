package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int input;
        int in;
        boolean run = true;

        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        while( run == true ){
            System.out.println("Enter the number of what you want");
            System.out.println("1) Add music");
            System.out.println("2) List of musics");
            System.out.println("3) Play music");
            System.out.println("4) Remove music");
            System.out.println("5) Add to favorites");
            System.out.println("6) Remove from favorites");
            System.out.println("7) List of favorite musics");
            System.out.println("8) Stop playing");
            System.out.println("9) Exit");
            input = myObj.nextInt();

            switch (input){
                case 1:
                    int year;
                    String name = new String();
                    String  singer = new String();
                    System.out.println("Which type?");
                    System.out.println("1) Pop");
                    System.out.println("2) Jazz");
                    System.out.println("3) Rock");
                    System.out.println("4) Country");
                    in = myObj.nextInt();
                    System.out.println("Name of the music");
                    name = myObj.next();
                    System.out.println("Singer of the music");
                    singer = myObj.next();
                    System.out.println("Year of the music");
                    year = myObj.nextInt();
                    Music music = new Music(name,singer,year);
                    switch (in){
                        case 1:
                            pop.addFile(music);
                            break;
                        case 2:
                            jazz.addFile(music);
                            break;
                        case 3:
                            rock.addFile(music);
                            break;
                        case 4:
                            country.addFile(music);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Which type?");
                    System.out.println("1) Pop");
                    System.out.println("2) Jazz");
                    System.out.println("3) Rock");
                    System.out.println("4) Country");
                    in = myObj.nextInt();
                    switch (in){
                        case 1:
                            pop.listAllFiles();
                            break;
                        case 2:
                            jazz.listAllFiles();
                            break;
                        case 3:
                            rock.listAllFiles();
                            break;
                        case 4:
                            country.listAllFiles();
                            break;
                    }
                    break;

                case 3:
                    int index;
                    System.out.println("Which type?");
                    System.out.println("1) Pop");
                    System.out.println("2) Jazz");
                    System.out.println("3) Rock");
                    System.out.println("4) Country");
                    in = myObj.nextInt();
                    System.out.println("Enter the index of the music");
                    index = myObj.nextInt();
                    switch (in) {
                        case 1:
                            pop.startPlaying(index);
                            break;
                        case 2:
                            jazz.startPlaying(index);
                            break;
                        case 3:
                            rock.startPlaying(index);
                            break;
                        case 4:
                            country.startPlaying(index);
                            break;
                    }
                    break;

                case 4:
                    int index2;
                    System.out.println("Which type?");
                    System.out.println("1) Pop");
                    System.out.println("2) Jazz");
                    System.out.println("3) Rock");
                    System.out.println("4) Country");
                    in = myObj.nextInt();
                    System.out.println("Enter the index of the music");
                    index2 = myObj.nextInt();
                    switch (in){
                        case 1:
                            pop.removeFile(index2);
                            break;
                        case 2:
                            jazz.removeFile(index2);
                            break;
                        case 3:
                            rock.removeFile(index2);
                            break;
                        case 4:
                            country.removeFile(index2);
                            break;
                    }
                    break;
                case 5:
                    int index3;
                    System.out.println("Which type?");
                    System.out.println("1) Pop");
                    System.out.println("2) Jazz");
                    System.out.println("3) Rock");
                    System.out.println("4) Country");
                    in = myObj.nextInt();
                    System.out.println("Enter the index of the music");
                    index3 = myObj.nextInt();
                    switch (in){
                        case 1:
                            pop.addFavorite(index3);
                            break;
                        case 2:
                            jazz.addFavorite(index3);
                            break;
                        case 3:
                            rock.addFavorite(index3);
                            break;
                        case 4:
                            country.addFavorite(index3);
                            break;
                    }
                    break;
                case 6:
                    int index4;
                    System.out.println("Which type?");
                    System.out.println("1) Pop");
                    System.out.println("2) Jazz");
                    System.out.println("3) Rock");
                    System.out.println("4) Country");
                    in = myObj.nextInt();
                    System.out.println("Enter the index of the music");
                    index4 = myObj.nextInt();
                    switch (in){
                        case 1:
                            pop.removeFavorite(index4);
                            break;
                        case 2:
                            jazz.removeFavorite(index4);
                            break;
                        case 3:
                            rock.removeFavorite(index4);
                            break;
                        case 4:
                            country.removeFavorite(index4);
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Which type?");
                    System.out.println("1) Pop");
                    System.out.println("2) Jazz");
                    System.out.println("3) Rock");
                    System.out.println("4) Country");
                    in = myObj.nextInt();
                    switch (in){
                        case 1:
                            pop.printFavorite();
                            break;
                        case 2:
                            jazz.printFavorite();
                            break;
                        case 3:
                            rock.printFavorite();
                            break;
                        case 4:
                            country.printFavorite();
                            break;
                    }
                    break;
                case 8:
                    System.out.println("Which type you were listening?");
                    System.out.println("1) Pop");
                    System.out.println("2) Jazz");
                    System.out.println("3) Rock");
                    System.out.println("4) Country");
                    in = myObj.nextInt();
                    switch (in){
                        case 1:
                            pop.stopPlaying();
                            break;
                        case 2:
                            jazz.stopPlaying();
                            break;
                        case 3:
                            rock.stopPlaying();
                            break;
                        case 4:
                            country.stopPlaying();
                        break;
                    }
                        case 9:
                            run = false;
                            break;
            }
        }
    }
}

