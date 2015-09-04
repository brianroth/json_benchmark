package json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

import model.ExtractItem;
import model.ExtractLocationPeriod;
import model.PeriodType;

public abstract class JSONSerializer {

	public Faker faker;

	public abstract String serialize(ExtractItem item) throws IOException;

	public JSONSerializer() {
		faker = new Faker();
	}

	public void run() throws IOException {
		List<ExtractItem> items = getItems(1000, 100);

		long startTime = System.currentTimeMillis();

		for (ExtractItem item : items) {
			serialize(item);
		}

		System.out.println("Elapsed time was " + (System.currentTimeMillis() - startTime));

	}

	public List<ExtractItem> getItems(int count, int periodCount) {

		List<ExtractItem> items = new ArrayList<ExtractItem>();

		for (int i = 0; i < count; i++) {
			ExtractItem item = new ExtractItem(PeriodType.DAILY, System.currentTimeMillis(),
					faker.code().isbn10(), faker.business().creditCardNumber(), rndFloat(), rndFloat());

			for (int j = 0; j < periodCount; j++) {
				item.addPeriod(new ExtractLocationPeriod(rndInt(), j, rndFloat(), rndFloat(), rndFloat()));
			}

			items.add(item);
		}

		return items;
	}

	protected float rndFloat() {
		return (float) Math.random();
	}

	protected int rndInt() {
		return (int) (100 * Math.random());
	}
}
