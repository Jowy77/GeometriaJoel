package binding.Custom;

import javafx.beans.binding.StringExpression;

public class StringBindings {

	public static TrimBinding trim(StringExpression str) {
		return new TrimBinding(str);
	}

}
