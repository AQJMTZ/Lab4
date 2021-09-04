package mx.tec.web.lab.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 * Marks the validated size
 * @author AQJMt
 *
 */
public class SizeValidator implements ConstraintValidator<ValidSize, String> {
	private final List<String> validSizes = Arrays.asList("XS", "S" , "M", "L", "XL");

	/**
	 * Checks that the sizes received is valid
	 * @return true if valid, else false
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return validSizes.contains(value);
	}
}
