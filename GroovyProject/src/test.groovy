@Grab('commons-lang:commons-lang:2.4')
import org.apache.commons.lang.ClassUtils
println "Hello"

println new TestClass()
println ClassUtils.isInnerClass(TestClass)

def props() {
    [intField: 1, stringField: "test"]
}

TestClass t = props() as TestClass

println t

persons = []
for (i in 1..10) {
    persons.add(new Person(name: "name_$i", age: i))
}

println persons

persons.each {it.age += 10}

println persons

println ([new Person(name: "a", age: 10), new Person(name: "b", age: 5), new Person(name:"a", age: 5)].sort({a,b -> a.age <=> b.age ?: a.name <=> b.name}))

def quickSort(list) {
    if (list.size() < 2) return list
    def pivot = list[list.size().intdiv(2)]
    def left = list.findAll { item -> item < pivot }
    def middle = list.findAll { item -> item == pivot }
    def right = list.findAll { item -> item > pivot }
    quickSort(left) + middle + quickSort(right)
}