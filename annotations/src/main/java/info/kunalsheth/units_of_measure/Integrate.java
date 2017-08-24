package info.kunalsheth.units_of_measure;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by kunal on 8/6/17.
 */
@Retention(RetentionPolicy.SOURCE)
@Repeatable(Integrals.class)
public @interface Integrate {
    UomData x();

    UomData withRespectTo();
}
