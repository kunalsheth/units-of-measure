package info.kunalsheth.units_of_measure;

import java.lang.annotation.Target;

/**
 * Created by kunal on 8/8/17.
 */
@Target({})
public @interface UomData {
    int metre() default 0;
    int kilogram() default 0;
    int second() default 0;
    int ampere() default 0;
    int kelvin() default 0;
    int mole() default 0;
    int candela() default 0;
}
