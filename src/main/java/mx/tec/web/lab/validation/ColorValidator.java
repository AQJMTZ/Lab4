package mx.tec.web.lab.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *Defines the type of color that is valid 
 * @author AQJMt
 */

public class ColorValidator implements ConstraintValidator<ValidSize, String> {
	private final List<String> validColors = Arrays.asList("negro", "azul" , "cafe", "blanco", "rojo");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		for (String validColor : validColors) {
			
			if (validColor.equalsIgnoreCase(value)){
					return true;
			}
		}
		return false;
		}
}
