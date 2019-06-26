package mrs.app.reservation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * アノテーションを定義するクラス？？全く意味不明
 */
@Documented
// チェックロジックはThiryMinutesUnitValidatorクラスに委譲する宣言
@Constraint(validatedBy = { ThirtyMinutesUnitValidator.class })
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
public @interface ThirtyMinutesUnit {

	// デフォルトのエラーメッセージを設定（この形式にすることでプロパティファイルから取得される）
	String message() default "{mrs.app.reservation.ThirtyMinutesUnit.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
	@Retention(RUNTIME)
	@Documented
	public @interface List {
		ThirtyMinutesUnit[] calue();
	}
}
