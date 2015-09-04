package json;

import java.io.IOException;

import org.boon.json.JsonSerializer;
import org.boon.json.serializers.impl.JsonSimpleSerializerImpl;

import model.ExtractItem;

public class BoonSerializer extends JSONSerializer {

	private JsonSerializer serializer;

	public BoonSerializer() {
		super();
		serializer = new JsonSimpleSerializerImpl();
	}

	public static void main(String[] args) throws IOException {
		new BoonSerializer().run();
	}

	@Override
	public String serialize(ExtractItem item) throws IOException {
		return serializer.serialize(item).toString();
	}
}
