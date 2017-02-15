import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
class Employee {
    int age
    int salary

    public Employee plus(Bonus bonus) {
        if (age > bonus.age) {
            salary += bonus.amount
        }
        return this
    }
}
