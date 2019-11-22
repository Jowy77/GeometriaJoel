package dad.javafx.dogs.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UnirestObjectMapper implements com.mashape.unirest.http.ObjectMapper{
	
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public <T> T readValue(String value, Class<T> valueType) {
		try {
			return mapper.readValue(value, valueType);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public String writeValue(Object value) {
		try {
			return mapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			// TODO: handle exception
		}
		return null;
	}

}
