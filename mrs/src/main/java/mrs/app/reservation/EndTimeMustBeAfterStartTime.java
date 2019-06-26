package mrs.app.reservation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = { EndTimeMustBeAfterStartTimeValidator.class })
// 複数のフィールドにまたがるチェックであるためクラスレベルにアノテーションを付けるようにする（意味不明）
@Target({ TYPE, ANNOTATION_TYPE })
public @interface EndTimeMustBeAfterStartTime {
	
	String message() default "{mrs.app.reservation.EndTimeMustBeAfterStartTime.message}";
	
	Class<?>[]groups() default{};
	
	Class<? extends Payload>[]payload() default {};
	
	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
	@Retention(RUNTIME)
	@Documented
	public @interface List{
		EndTimeMustBeAfterStartTime[]value();
	}
	
}
