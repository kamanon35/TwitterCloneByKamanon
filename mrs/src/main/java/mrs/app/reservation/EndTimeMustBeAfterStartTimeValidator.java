package mrs.app.reservation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import lombok.Data;

@Data
public class EndTimeMustBeAfterStartTimeValidator
		implements ConstraintValidator<EndTimeMustBeAfterStartTime, ReservationForm> {

	private String message;

	@Override
	public void initialize(EndTimeMustBeAfterStartTime constraintAnnotation) {
		message = constraintAnnotation.message();
	}

	@Override
	public boolean isValid(ReservationForm value, ConstraintValidatorContext context) {

		// nullチェックは@NotNullなどに委譲する方針らしい
		if (value.getStartTime() == null || value.getEndTime() == null) {
			return true;
		}
		boolean isEndTimeMustBeAfterStartTime = value.getEndTime()
				.isAfter(value.getStartTime());
		/*
		 * デフォルトメッセージを出し方を無効にして、endTimeプロパティに対してエラーメッセージを設定する。
		 * これは画面でエラーメッセージを表示する際に、フィールドの横にメッセージを表示したいときに必要となる処理である。
		 * */
		if (!isEndTimeMustBeAfterStartTime) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(message)
					.addPropertyNode("endTime").addConstraintViolation();
		}
		return isEndTimeMustBeAfterStartTime;
	}
}
