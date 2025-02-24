package brunovnasci.banking_accounts.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Service

@Service
class GetAccountBalanceService {
    fun execute(accountId: String): Long {
        logger.info("Getting balance for account $accountId")
        return 0
    }

    companion object {
        val logger: Logger = getLogger(GetAccountBalanceService::class.java)
    }
}