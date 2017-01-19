package programs;

public class Restaurant implements StarHotel {

           public void food()
           {
        	   System.out.println("Food are awesome here!!");
           }
           public void chef()
           {
        	   System.out.println("Have done catering");
           }
           public static void main(String[] args) {
			Restaurant res = new Restaurant();
			res.food();
			res.chef();
		}
           
	}


