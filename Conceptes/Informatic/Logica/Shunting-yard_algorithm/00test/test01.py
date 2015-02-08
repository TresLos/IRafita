"""
Aqui tenim una idea, fem un diccionari amb totes les possiblitats,
si no existeix, direm que es una variable 'digit', si existeix, ens tocarem les pilotes

Aqui sobretot nomes farem +,-,*,^, encara dubto de si implementar ja les parentesis. Direm que si va ;)
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
	return readFile ('../operation00.op')

# Esperem ja poder fer el programa desitjat
def main ():
	out = []
	stk = [] # stack
	Operation = readTable ()
	nopresent = []
	for token in auto ():
# En un FuTuR, les variables, tambe haurien d'estar per aqui ;)
		if token.isdigit ():
			out += token

####################
# Per versions mes abansades, si mai es una funcio, doncs aixo
# hauria de tenir present les funcions
####################

####################
# Recordatori, Funtion argument separator, com la coma 'crear matrius etc'
####################

		elif token in Operation:
# El que vull treballar en la primera versio :)
# Aixi que te la pinta de funcionar correctament ;)
			condicioOperant (out, stk, Operation, token)
		elif token is '(':
			stk += token
		elif token is ')':
###
# VIGILAR: If the token at the top of the stack is a function token, pop it onto the output queue NO pillo que me vol dir TT
###
			if condicioParentesisObert (out, stk): print 'Warning'
		else:
			nopresent += token
	while stk:
		out += stk.pop ()
	if nopresent:
		print 'Si no esta buit, tenim un problema ', nopresent
	return out

################################################################################################################################
################################################################################################################################
# El que vull dominar en aquest exemple ;)
# Puc dir que funciona ocm desitjava :)
def condicioOperant (out, stk, Operation, token):
	if stk:
		if stk[-1] in Operation:
			t = Operation[token]
			if t[1] == 'Left':
				if t[0] <= Operation[stk[-1]][0]:
					out += stk.pop ()
			elif t[1] == 'Right':
				if t[0] < Operation[stk[-1]][0]:
					out += stk.pop ()
	stk += token
################################################################################################################################
################################################################################################################################
# Els parentesis, sembla molt facil, tot i que he de vigilar perque no controlo algo que no entenc la wiki
def condicioParentesisObert (out, stk):
	condicio = True
	while (condicio):
		if not stk: return 'Warning' # Error que no hi ha cap parentesis que obri aquest que tancava
		elif stk[-1] is '(':
			condicio = False
			stk.pop ()
		else:
			out += stk.pop ()
################################################################################################################################
################################################################################################################################
