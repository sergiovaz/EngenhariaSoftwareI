package pt.iscte.esi.projeto.form.models;
import java.util.List;
public class TwitterAPITest {
/*
 * This is just to see if the Twitter api is working, it will be deleted later
 * */
	public static void main(String[] args) {
		TwitterAPI p = new TwitterAPI();
		List<Message> message = p.getMessage();
		for(Message m: message)
			System.out.println(m.getTime() + ":" +m.getMessage()+ "\n");
		
	}

}
