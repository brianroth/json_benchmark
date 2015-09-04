package json;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.ExtractItem;

public class JacksonSerializer extends JSONSerializer {

	private ObjectMapper objectMapper;

	public JacksonSerializer() {
		super();
		objectMapper = new ObjectMapper();
	}

	public static void main(String[] args) throws IOException {
		new JacksonSerializer().run();
	}

	@Override
	public String serialize(ExtractItem item) throws IOException {
		return objectMapper.writeValueAsString(item);
	}
}
