import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
public class AssertJExample {

    @Test
    @DisplayName("Kiểm tra email hợp lệ")
    void testEmail(){
        String email = "xuyen.pham@onemount.com";
        assertThat(email).contains("@")
                .isNotNull()
                .containsPattern("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-zA-Z]{2,})$");
    }

    @Test
    @DisplayName("Kiểm tra cân nặng của người")
    void testWeight (){
        double weight = 48.5d;
        assertThat(weight).isEqualTo(48.5, withPrecision (1.0d))
                .isCloseTo(45.0, Offset.offset(3.5d))
                .isBetween(0.0, 150.0);
    }
}