package info.kunalsheth.units_of_measure;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by kunal on 8/6/17.
 */
@Retention(RetentionPolicy.SOURCE)
@Repeatable(Derivatives.class)
public @interface Differentiate {
    UomData x();

    UomData withRespectTo();
}
