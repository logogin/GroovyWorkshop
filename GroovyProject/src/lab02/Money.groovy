package lab02

import groovy.json.JsonSlurper
import groovy.transform.ToString

import java.math.RoundingMode

@ToString
class Money {
    BigDecimal amount
    String currency

    public Money plus(Money other) {
        def slurper = new JsonSlurper()
        def response = slurper.parse(new URL("http://rate-exchange.appspot.com/currency?from=$other.currency&to=$currency"))
        Rate rate = response as Rate
        def value = amount + other.amount * rate.rate
        value = value.setScale(2, RoundingMode.HALF_DOWN)
        return new Money(amount:value, currency: currency)
    }
}
