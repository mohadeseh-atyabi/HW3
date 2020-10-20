package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;

    // A player for the music files.
    private MusicPlayer player;

    private ArrayList<Music> favorite;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
        player = new MusicPlayer();
        favorite = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     * @param newMusic The file to be added.
     */
    public void addFile(Music newMusic)
    {
        files.add(newMusic);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            files.get(index).print();
        }
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        int i=1;
        Iterator<Music> it = files.iterator();
        while(it.hasNext()){
            System.out.printf("%d) %s\n" , i , it.next().getName());
            i++;
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)) {
            player.startPlaying(files.get(index).getName());
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if(index>=0 && index<files.size()){
            return true;
        }
        else{
            System.out.println("Invalid input.Please check the list again.");
            return false;
        }
    }

    /**
     * Adds music to your favorites.
     * @param index Index of your favorite music.
     */
    public void addFavorite(int index){
        if(validIndex(index)){
            favorite.add(files.get(index));
        }
    }

    /**
     * Removes music from your favorites.
     * @param index Index of the music in favorite list.
     */
    public void removeFavorite(int index){
        if(validIndex(index)){
            favorite.remove(index);
        }
    }

    /**
     * Show a list of all the files in the favorite.
     */
    public void printFavorite(){
        int i=1;
        Iterator<Music> it = favorite.iterator();
        while(it.hasNext()){
            System.out.printf("%d) %s\n" , i , it.next().getName());
            i++;
        }
    }


}
