import com.durasoft.filters.Filter;

public class PipeLine {
	private Filter producer;
	private Filter groupGenerator;
	private Filter consumer;
	
	public PipeLine(Filter producer, Filter groupGenerator, Filter consumer) {
		this.producer = producer;
		this.groupGenerator = groupGenerator;
		this.consumer = consumer;
	}

	public void execute() {
		Object result = producer.performOperation(null);
		result = groupGenerator.performOperation(result);
		result = consumer.performOperation(result);
	}
}
