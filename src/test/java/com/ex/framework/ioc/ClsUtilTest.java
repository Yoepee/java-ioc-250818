package com.ex.framework.ioc;

import com.ex.framework.ioc.util.sample.TestCar;
import com.ex.framework.ioc.util.ClsUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClsUtilTest {
    @Test
    @DisplayName("ClsUtil.loadClass")
    void t1() {
        Class<TestCar> cls = ClsUtil.loadClass("com.ex.framework.ioc.util.sample.TestCar");

        assertThat(cls).isEqualTo(TestCar.class);
    }
}
