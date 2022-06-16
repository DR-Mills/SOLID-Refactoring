import java.util.ArrayList;
import java.util.Scanner;

public class ScenePrinter {

	public static boolean userEngaged(Scanner scnr) {
		return Validator.userContinueYorN("\nWatch another scene? ", scnr);
	}

	public static void printInfo(Movie movie) {
		System.out.println("Title: " + movie.getTitle());
		System.out.println("Run Time: " + movie.getRunTime() + " min.");
	}

	public static void printScenes(ArrayList<String> scenes) { // only displays partial scenes
		String partialScene = "";

		System.out.println("Scene   Partial Description");

		for (int i = 0; i < scenes.size(); i++) {

			try {
				partialScene = scenes.get(i).substring(0, 45) + ". . . ";
			} catch (StringIndexOutOfBoundsException e) {
				partialScene = scenes.get(i).substring(0, scenes.get(i).length());
			}

			System.out.println("  " + i + "   " + partialScene);
		}
	}

	public static String getPrinterFriendlyScene(String scene) {
		StringBuilder strIn = new StringBuilder(scene);
		StringBuilder strOut = new StringBuilder();
		int substringIndex = 0;

		do {
			if (strIn.length() <= 100) {
				strOut.append(strIn);
				return strOut.toString();
			} else {
				for (int i = 100; i < strIn.length(); i++) {
					if (strIn.charAt(i) == ' ') {
						substringIndex = i;
						break;
					}
					substringIndex = strIn.length() - 1;
				}
				strOut.append(strIn.substring(0, substringIndex + 1) + "\n");
				strIn = strIn.replace(0, substringIndex + 1, "");
			}

		} while (strIn.length() >= 0);

		return null;
	}

}
