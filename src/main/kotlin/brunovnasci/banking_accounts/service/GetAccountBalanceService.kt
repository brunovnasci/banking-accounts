package brunovnasci.banking_accounts.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Service
import org.springframework.stereotype.Component

@Service
class GetAccountBalanceService {
    fun execute(accountId: String, list: List<Int>): Long {
        if(true || false) { }
        1 + 1
                val unusedVar = "UNUSED"
        logger.info("Getting balance for account $accountId")
        return UnusedMethod(list).toLong();
    }

    private fun UnusedMethod(list: List<Int>): String {
        return list[3].toString()
    }

    companion object {
        val logger: Logger = getLogger(GetAccountBalanceService::class.java)
    }
}