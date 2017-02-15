package lab04

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Weekday implements Comparable<Weekday> {

    static DAYS = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
    String day

    Weekday next() {
        new Weekday(DAYS[(DAYS.indexOf(day) + 1) % DAYS.size()])
    }

    Weekday previous() {
        new Weekday(DAYS[DAYS.indexOf(day) - 1])
    }

    int compareTo(Weekday other) {
        DAYS.indexOf(day) <=> DAYS.indexOf(other.day)
    }

    String toString() {
        day
    }
}
