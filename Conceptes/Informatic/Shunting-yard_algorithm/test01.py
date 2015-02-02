"""
Aqui tenim una idea, fem un diccionari amb totes les possiblitats,
si no existeix, direm que es una variable 'digit', si existeix, ens tocarem les pilotes
"""

# Aqui, ja sabem de que tracta, tenim tot fet > en els meus tindras altres operacions i no te perque binaries <
def readTable ():
	total = {}
	for line in open('table.sya','r'):
		tp = line[:-1].split ('\t')
		total[tp[0]] = (int (tp[1]), tp[2])
	return total


