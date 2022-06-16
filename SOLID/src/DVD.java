import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVD implements Play {

	private int playCounter = 0;
	
	
	public void setPlayCounter(int playCounter) {
		this.playCounter = playCounter;
	}
	
	@Override
	public void play(ArrayList<String> scenes) {
		if (playCounter < 1) {
			ScenePrinter.printScenes(scenes);
			playCounter = 1;
		}
		
		int sceneChoice = Validator.integerWithinRange("Which scene would you like to watch? ",
				new Scanner(System.in), 0, scenes.size() - 1);
		
		System.out.println("\nScene " + sceneChoice + ":\n" + ScenePrinter.getPrinterFriendlyScene(scenes.get(sceneChoice)));
	}







}
