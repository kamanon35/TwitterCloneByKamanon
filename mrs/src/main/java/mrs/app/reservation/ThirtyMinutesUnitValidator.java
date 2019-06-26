package mrs.app.reservation;

import java.time.LocalTime;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ThirtyMinutesUnitアノテーションに対するチェック処理を実装する
 */

public class ThirtyMinutesUnitValidator
		implements ConstraintValidator<ThirtyMinutesUnit, LocalTime> {

	@Override
	public void initialize(ThirtyMinutesUnit constraintAnnotation) {
	}

	@Override
	public boolean isValid(LocalTime value, ConstraintValidatorContext context) {
		
		//入力値がnullの場合はここではチェックせず、@Notnullなど他のルールに委譲する
		if (value == null) {
			return true;
		}
		return value.getMinute() % 30 == 0;
	}
}
