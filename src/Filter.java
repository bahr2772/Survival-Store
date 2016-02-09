import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {


	public  void display_All(){

		for(int i = 1; i < Products.storeList.size(); i++){
			System.out.println(i + "\t" + Products.storeList.get(i).cat   + " , "
					+Products.storeList.get(i).name + " , $"
					+Products.storeList.get(i).cost + " , "
					+Products.storeList.get(i).stock);
		}


	}	

	public void filter_by_catagory() {

		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to filter");
		System.out.println(" [1] Food \n"
				+ " [2] Tools \n"
				+ " [3] Backpacks \n"
				+ " [4] Light and Commuinication \n"
				+ " [5] Sanitation and Hygiene \n"
				+ " [6] Emergency Power \n"
				+ " [7] Fist Aid and Mecial \n"
				+ " [8] Cooking and Fuel \n"
				+ " [9] Clothing \n"
				+ "[10] Warmth and Shelter \n"
				+ "[11] Survival Kits \n"
				+ "[12] Tools and Supplies");

		int set = input.nextInt();

		String inputString = " ";
		switch(set){
		case 1:
			inputString  = "food";break;
		case 2:
			inputString  = "tools";break;
		case 3:
			inputString  = "backpacks";break;
		case 4:
			inputString  = "light and commuinication";break;
		case 5:
			inputString  = "sanitation and hygiene";break;
		case 6:
			inputString  = "emergency power";break;
		case 7:
			inputString  = "fist aid and mecial";break;
		case 8:
			inputString  = "cooking and fuel";break;
		case 9:
			inputString  = "clothing";break;
		case 10:
			inputString  = "warmth and shelter";break;
		case 11:
			inputString  = "survival kits";break;
		case 12:
			inputString = "tools and supplies";break;
		default:
			inputString = null;
		}
		String setString = inputString;


		Predicate<Items> catagory = p -> p.cat.equals(setString);
		Predicate<Items> fullPredicate = (catagory);
		List<Items> catFilter = Products.storeList.stream().filter(fullPredicate).collect(Collectors.toList());

		for(int i = 1; i < catFilter.size(); i++){
			System.out.println( i + " "+ catFilter.get(i).cat   + " , "
					+catFilter.get(i).name + " , $"
					+catFilter.get(i).cost + " , "
					+catFilter.get(i).stock);
		}		


		input.close();

	}
}
