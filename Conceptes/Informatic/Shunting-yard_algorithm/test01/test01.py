"""
Aqui tenim una idea, fem un diccionari amb totes les possiblitats,
si no existeix, direm que es una variable 'digit', si existeix, ens tocarem les pilotes
"""

# Aqui, ja sabem de que tracta, tenim tot fet > en els meus tindras altres operacions i no te perque binaries <
def readTable ():
	total = {}
	for line in open ('../table.sya','r'):
		tp = line[:-1].split ('\t')
		total[tp[0]] = (int (tp[1]), tp[2])
	return total

# Ja tenim la taula de preferencies
# Ara llegirem la entrada del fitxer, jaja, tota l'estona per llegir
def readFile (e): # operation01.op
	for line in open (e):
		out = line[:-1].split (' ')
	return out

# Fer mes facil testejar
def auto ():
	return readFile ('../operation01.op')

# Esperem ja poder fer el programa desitjat
def main ():
	out = []
	tmp = []
	for i in auto ():
		if i.isdigit ():
			out += i
		else:
			pass
	return out
