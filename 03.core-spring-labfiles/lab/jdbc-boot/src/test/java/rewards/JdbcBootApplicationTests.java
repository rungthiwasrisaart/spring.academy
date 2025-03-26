package rewards;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class JdbcBootApplicationTests {
	public static final String query = "SELECT count(*) from T_ACCOUNT";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	void testNumberOfAccount() {
		long count = jdbcTemplate.queryForObject(query, Long.class);
		assertThat(count).isEqualTo(21L);
	}

}
