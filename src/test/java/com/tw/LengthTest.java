package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.IsNot.not;

public class LengthTest {

    @Test
    public void shouldCheckEqualityWhenOneCentimeterIsComparedWithOneCentimeter(){
        Length firstLength = new Length(1);
        Length secondLength = new Length(1);

        assertThat(firstLength,equalTo(secondLength));
    }

    @Test
    public void shouldCheckEqualityWhenTwoCentimeterIsComparedWithOneCentimeter(){
        Length firstLength = new Length(2);
        Length secondLength = new Length(1);

        assertThat(firstLength, not(equalTo(secondLength)));
    }
}
