package brunovnasci.banking_accounts.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Service
import org.springframework.stereotype.Component

@Service
class GetAccountBalanceService {
    fun execute(accountId: String): Long {
        if(true || false) { }
        1 + 1
                val unusedVar = "UNUSED"
        logger.info("Getting balance for account $accountId")
        return 0;
    }

    private fun UnusedMethod() {
        val array = listOf(1)
        val arrayOutBounds = array[3]
    }

    companion object {
        val logger: Logger = getLogger(GetAccountBalanceService::class.java)
    }
}