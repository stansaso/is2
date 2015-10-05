#dato = open('texto.txt','r')
#linea=dato.readline()
#while linea!="":
#        print linea
#        linea=dato.readline()
#longitud=len(dato)
def encriptar(texto,v,ll):
	for a in range(0,len(texto)):
		da=ord(texto[a])
		dato=(da+v)%255
		db=chr(dato)
		ll.append(db)
	return ll
def desecriptar(textod,vv,lld):
	for b in range(0,len(textod)):
		da=ord(textod[b])
		dato=(da-vv)%255
		db=chr(dato)
		lld.append(db)
	return lld
def grabar(tt):
	ar=open('mostrar.txt','w')
	ar.write(tt)
	ar.close()




f=file("texto.txt", "r")
cadena=f.read()
print("ingrese el valor")
n=input()
li_en=[]
lenc=encriptar(cadena,n,li_en)
mos="".join(lenc)
li_des=[]
ldes=desecriptar(mos,n,li_des)
mosd="".join(ldes)
grabar(mosd)
