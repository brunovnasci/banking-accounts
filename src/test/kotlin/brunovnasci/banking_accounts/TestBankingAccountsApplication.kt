package brunovnasci.banking_accounts

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<BankingAccountsApplication>().with(TestcontainersConfiguration::class).run(*args)
}
