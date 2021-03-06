package ua.epam.spring.hometask.util.annotation;

import javax.validation.Constraint;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD, PARAMETER, METHOD})
@Retention(RUNTIME)
@Constraint(validatedBy = CheckIsEmail.class)
public @interface IsEmail {
    String message() default "{error.message.from.properties}";
}
