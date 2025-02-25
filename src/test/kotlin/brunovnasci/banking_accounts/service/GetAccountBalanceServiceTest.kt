package brunovnasci.banking_accounts.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GetAccountBalanceServiceTest {
    private val service = GetAccountBalanceService()

    @Test
    fun `should return balance for given account id`() {
        val actualBalance = service.execute("12345", listOf(1, 2, 3, 4, 5))

        assertEquals(0, actualBalance)
    }
}