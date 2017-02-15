package lab04

println new Money(10)..new Money(20)

def money = new Money(100)

switch (money) {
    case new Money(0)..new Money(70): println("Poor"); break
    case new Money(71)..new Money(120): println("Norm"); break
    case new Money(121)..new Money(170): println("Rich"); break
}

def sun = new Weekday('Sun')
def thu = new Weekday('Thu')

println sun..thu
def worklog = ''
for (day in sun..thu) {
    worklog += " Worked at $day"
}

println worklog