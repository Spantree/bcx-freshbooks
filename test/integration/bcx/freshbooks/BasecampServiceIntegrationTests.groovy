package bcx.freshbooks

import static org.junit.Assert.*
import org.junit.*

class BasecampServiceIntegrationTests {
	def basecampService
	
    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testAuthentication() {
        basecampService.getCredentials() != ':'
    }
}
