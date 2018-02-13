import com.durasoft.filters.Consumer;
import com.durasoft.filters.GroupGenerator;
import com.durasoft.filters.Producer;

public class Main {

	public static void main(String[] args) {
		Producer producer = new Producer("bin/students.txt");
		GroupGenerator groupGenerator = new GroupGenerator();
		Consumer consumer = new Consumer("groups.txt");
		PipeLine pipeLine = new PipeLine(producer, groupGenerator, consumer);
		pipeLine.execute();
		System.out.println("Done");
	}

}
