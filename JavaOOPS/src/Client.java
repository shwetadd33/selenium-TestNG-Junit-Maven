
public class Client {

	public static void main(String[] args) {
		// Create object of the facebook page
		
		FacebookPage.owner = "Facebook Inc";
		
		FacebookPage fb = new FacebookPage();
		fb.name = "HomePage";
		fb.pageviews = 1001;
		
		System.out.println(fb.name);
		System.out.println(fb.pageviews);
		System.out.println("fb owner is: " + fb.owner);
		
		FacebookPage fb1 = new FacebookPage();
		System.out.println("fb1 owner is: " + fb1.owner);
	}

}
