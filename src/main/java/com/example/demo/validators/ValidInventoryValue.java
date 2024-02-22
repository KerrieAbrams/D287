package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {InventoryValueValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidInventoryValue {
    String message() default "Inventory value must be within the minimum and maximum value range";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
