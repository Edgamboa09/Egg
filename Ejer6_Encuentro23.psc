Algoritmo Ejer6_Encuentro23
	
	definir i,j, matriz, suma,col, nro, fila,columna,diago Como Entero
	definir m2, mf Como Entero
	definir magica Como Logico
	magica = verdadero
	Escribir "Ingrese tama�o de matriz menor a 10"
	leer col
	
	si col < 10 entonces
		dimension m2[col]
		Dimension matriz[col,col]
		para i<- 0 hasta col-1 Hacer
			para j<- 0 hasta col-1 Hacer
				Escribir "Ingrese valores para la matriz"
				leer nro
				si (nro >0 y nro<10)entonces 
					matriz[i,j] =nro
				SiNo
					Escribir "El numero ingresado no es valido ingrese rango entre 0 y 9"
				FinSi
			FinPara
		FinPara
		
		para i= 0 hasta col-1 Con Paso 1 Hacer
			para j=0 hasta col-1 con paso 1 Hacer
				Escribir sin saltar matriz(i,j), " "
			FinPara
			Escribir ""
		FinPara
		
		para i<- 0 hasta col-1 Hacer
			fila = 0
			para j<- 0 hasta col-1 Hacer
				fila = fila +matriz[i,j]
			FinPara
			m2[i]=fila
		FinPara
		suma = m2[0]
		para mf<-0 hasta col-1 Hacer
			si suma <> m2[mf] Entonces
				magica = falso
			FinSi
		FinPara
		
		para i<- 0 hasta col-1 Hacer
			fila = 0
			para j<- 0 hasta col-1 Hacer
				fila = fila +matriz[j,i]
			FinPara
			m2[i]=fila
		FinPara
		suma = m2[0]
		para mf<-0 hasta col-1 Hacer
			si suma <> m2[mf] Entonces
				magica = falso
			FinSi
		FinPara
		//diagonal pricipal
		fila = 0
		para i<- 0 hasta col-1 Hacer
			
			para j<- 0 hasta col-1 Hacer
				si i=j Entonces
					fila = fila +matriz[i,]
				FinSi
			FinPara
		FinPara
		
		si (fila <> m2[0]) Entonces
			magica = falso
		FinSi
		//diagonal secundaria
		j=col-1
		diago = 0
		para i<- 0 hasta col-1 Hacer
			diago = diago + matriz[j,i]
			j = j-1
		FinPara
		
		si diago <> m2[0] Entonces
			magica = Falso
		FinSi
		
		si magica Entonces
			Escribir "El valor al cual es igual es: " diago
		sino 
			Escribir "La matriz no es magica"
		FinSi
		
	sino
		escribir "El tama�o de la matriz no es valido"
	fin si
FinAlgoritmo
