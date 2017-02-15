package lab02

import groovy.json.JsonSlurper

def slurper = new JsonSlurper()
def result = slurper.parse(new URL('http://rate-exchange.appspot.com/currency?from=UAH&to=UAH'))

println result as Rate

m1 = new Money(amount: 10.05, currency: 'UAH') + new Money(amount: 20.27, currency: 'UAH')
println "10.5 UAH + 20.27 UAH = $m1"

m2 = new Money(amount: 10.05, currency: "UAH") + new Money(amount: 10, currency: "USD")
println "10.05 UAH + 10 USD = $m2"

println new Money(amount: 10, currency: "USD") + new Money(amount: 4, currency: "UAH")