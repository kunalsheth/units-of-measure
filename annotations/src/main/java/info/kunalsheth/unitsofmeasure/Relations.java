package info.kunalsheth.unitsofmeasure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by kunal on 8/6/17.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface Relations {
    Relate[] value();
}
