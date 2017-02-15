package lab06

def data = 'This is is a test text! Yo... yo'
data = data.replaceAll(/\p{Punct}/, ' ')
words = data.split()
println words.groupBy {it.toLowerCase()}.collectEntries {k, v -> [k, v.size()]}.sort{-it.value}