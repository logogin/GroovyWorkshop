package lab03

def phrase = 'The rain in Spain stays mainly in the plain!'

println phrase.replaceAll(/\w*ain\b/, '_')

println phrase.replaceAll(/ain\b/, '___')