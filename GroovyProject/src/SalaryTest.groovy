
e1 = new Employee(age:30, salary:1000)
e2 = new Employee(age:20, salary:500)

b1 = new Bonus(age:25, amount:50)
b2 = new Bonus(age:55, amount:1000)

println e1.plus(b1)
println e2 + b1
println e1 + b2
println e2 + b2