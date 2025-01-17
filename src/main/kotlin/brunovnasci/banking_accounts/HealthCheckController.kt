package brunovnasci.banking_accounts

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    private val logger = LoggerFactory.getLogger(HealthCheckController::class.java)

    @GetMapping("/health")
    fun healthCheck(): String {
        logger.info("Health check endpoint accessed")
        return "OK"
    }
}