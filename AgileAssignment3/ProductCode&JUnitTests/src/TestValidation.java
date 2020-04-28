
public class TestValidation {
	public boolean validate(String celtofahren, String fahrentocel) {
		return (celtofahren.equals("") && fahrentocel.equals("")) ? false : true;
	}

	public boolean ValidateUP(String celtofahren, String fahrentocel) {
		return ((celtofahren.length() >= 0 && celtofahren.length() <= 100)
				&& (fahrentocel.length() >= 0 && fahrentocel.length() <= 212)) ? true : false;
	}

}
