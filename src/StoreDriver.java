import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreDriver {



	public static void main (String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		boolean quit = false;

		Products prod = new Products();
		Filter all = new Filter();

		Products.productsIn();

		do{
			System.out.println("What would you like to do?"
					+ "\n [1] See ALL Products"
					+ "\n [2] See Prodcuts by Catagory"
					+ "\n [3] View Shopping Cart"
					+ "\n [4] View Wallet"
					+ "\n [5] Exit Program");

			int select = input.nextInt();

			switch(select){

			case 1: 
				all.display_All();
				break;

			case 2:
				all.filter_by_catagory();
				break;
			}



		}while(quit);

		input.close();

	}
}


