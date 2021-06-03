package com.onebill.training.moduletest.musicapp;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
        Scanner sc =new Scanner(System.in);
        System.out.println("Press 1 - play a song\nPress 2 - Search a song\npress 3 - Show all Songs\nPress 4 - Operate on song Database ");
        System.out.println("\nPress your choice!");
        int choice =sc.nextInt();
        
        switch(choice) {
        case 1:
        	PlaySong ps = new PlaySong();
        	ps.playSong();
        	break;
        case 2:
        	SearchSong search =new SearchSong();
        	search.searchSong();
        	break;
        case 3:
        	DisplaySongs display = new DisplaySongs();
        	display.displaySongs();
        	break;
        case 4:
        	DatabaseOperation db_op =new DatabaseOperation();
        	db_op.dbOperation();
        	break;
        default:
        	System.out.println("Your Choice is Wrong!...Please Try again");
        	System.exit(0);
        }
	}
        
	}

