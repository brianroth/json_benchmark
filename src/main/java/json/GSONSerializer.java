package json;

import java.io.IOException;

import com.google.gson.GsonBuilder;

import model.ExtractItem;

public class GSONSerializer extends JSONSerializer {

	private GsonBuilder builder;

	public GSONSerializer() {
		super();
		builder = new GsonBuilder();
	}

	public static void main(String[] args) throws IOException {
		new GSONSerializer().run();
	}

	@Override
	public String serialize(ExtractItem item) throws IOException {
		return builder.create().toJson(item);
	}

}
