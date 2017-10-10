package info.kunalsheth.unitsofmeasure;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by kunal on 8/6/17.
 */
@Retention(RetentionPolicy.SOURCE)
@Repeatable(Relations.class)
public @interface Relate {
    UomData a();

    UomData b();
}
