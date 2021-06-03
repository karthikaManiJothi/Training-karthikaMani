package com.onebill.training.moduletest.musicapp;

import java.util.Scanner;

public class PlaySong {
	
    Scanner sc =new Scanner(System.in);
	public void playSong() {
		
		System.out.println("1.Play all songs\n2.Play songs Randomly\n3.Play a particular song");
		System.out.println("\nEnter you choice:");
		int choice =sc.nextInt();
		
		switch(choice) {
		
		case 1:
			SongBySequenticalOrder songbyseq =new SongBySequenticalOrder();
			songbyseq.playingAllSongsBySequence();
			break;
		case 2:
			SongByRandom songbyran =new SongByRandom();
			songbyran.playingSongsByRandom();
			break;
		case 3:
			PlayingParticularSong particular =new PlayingParticularSong();
			particular.songByUserChoice();
			break;
		default:
			System.out.println("Wrong choice!");
			System.exit(0);
		}
	}
}
