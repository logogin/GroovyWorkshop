package lab07

import groovy.json.JsonSlurper

class Counter {
    public int count(List list, def element, Closure c) {
        def counter=0
        list.each {
            if(c(it, element)) {
                counter++;
            }
        }
        counter
    }
}


def jack = new Person(name: 'Jack', age: 35)
List list = [jack, new Person(name: 'Barcuh', age: 36), new Person(name: 'Nikolay', age: 33)]
def count = new Counter().count(list, jack) { a, b ->
    a.age == b.age
}

println count

List.metaClass.superCount = { element, eq ->
    def counter = 0
    delegate.each {
        if( eq(it, element) ) {
            counter++;
        }
    }
    counter
}

println list.superCount(jack) { a, b ->
    a.age == b.age
}

JsonSlurper