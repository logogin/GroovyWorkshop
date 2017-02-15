package lab04

import groovy.json.JsonSlurper
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import lab02.Rate

import java.math.RoundingMode

@ToString
@TupleConstructor
class Money implements Comparable<Money> {
    int amount

    Money plus(Money other) {
        new Money(amount + other.amount)
    }

    Money next() {
        new Money(amount + 1)
    }

    Money previous() {
        new Money(amount - 1)
    }

    int compareTo(Money other) {
        amount.compareTo(other.amount)
    }
}
