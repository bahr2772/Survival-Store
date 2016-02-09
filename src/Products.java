import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Products {

	static ArrayList<Items> storeList = new ArrayList<Items>();



	public static  void productsIn() {


		String filePath = "D:/Programming/SurvivalStore/survivalProducts.csv";
		try {
			BufferedReader productsIn = new BufferedReader(new FileReader(filePath));

			String lineText = productsIn.readLine();
			while ((lineText = productsIn.readLine()) != null) {
				String[] temp = lineText.split(",");
				storeList.add(new Items(temp[0], temp[1],Double.parseDouble(temp[2]), Integer.parseInt(temp[3])));

			}
			productsIn.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}

	}




}

