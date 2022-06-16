import java.util.ArrayList;
import java.util.List;

public class VHS implements Play {

	private int currentTime;
	
	
	// getters & setters
	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	
	public void play(ArrayList<String> scenes) {
		System.out.println();
		System.out.println("Scene " + currentTime + ":\n" + ScenePrinter.getPrinterFriendlyScene(scenes.get(currentTime)));
		currentTime++;
		if (currentTime > scenes.size()-1) {
			rewind();
		}
	}
	
	public void rewind() {  // be kind, please rewind
		currentTime = 0;
		System.out.println("\nMovie has ended.\n" + "Be kind, please rewind.\n" + "Movie will continue from the beginning unless you exit.\n\n");
	}


}
