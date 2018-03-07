import com.healthycoder.NewsEngine;

public class Main {

	public static void main(String[] args) throws Exception{
		NewsEngine newsEngine = new NewsEngine("bin/modules.properties");
		newsEngine.displayNews();
	}

}
