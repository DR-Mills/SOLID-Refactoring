import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

	// instance variables
	private String title;
	private int runTime;
	private ArrayList<String> scenes = new ArrayList<>();
	private Play play;
	
	// constructor
	public Movie(String title, int runTime, ArrayList<String> scenes, Play play) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
		this.play = play;
	}

	// getters & setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public Play getPlay() {
		return play;
	}

	public void setPlay(Play play) {
		this.play = play;
	}

	@Override
	public String toString() {
		return "[Movie Title: " + title + ", Run Time: " + runTime + " min., Scenes: " + scenes.size() + "]";
	}

	

}
