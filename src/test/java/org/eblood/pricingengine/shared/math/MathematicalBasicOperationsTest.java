package org.eblood.pricingengine.shared.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MathematicalBasicOperationsTest {

    @Test
    void factorial() {
        assertThat(MathematicalBasicOperations.factorial(0)).isEqualTo(1);
        assertThat(MathematicalBasicOperations.factorial(1)).isEqualTo(1);
        assertThat(MathematicalBasicOperations.factorial(5)).isEqualTo(120);
        assertThat(MathematicalBasicOperations.factorial(10)).isEqualTo(3628800);
    }

    @Test
    void fibonacci() {
        assertThat(MathematicalBasicOperations.fibonacci(0)).isEqualTo(0);
        assertThat(MathematicalBasicOperations.fibonacci(1)).isEqualTo(1);
        assertThat(MathematicalBasicOperations.fibonacci(2)).isEqualTo(1);
        assertThat(MathematicalBasicOperations.fibonacci(43)).isEqualTo(433494437);
    }

}