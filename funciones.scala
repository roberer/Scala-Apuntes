// Crear funciones sin argumentos
def funcion1(): String = "Hola"           // val res1: String = Hola
def funcion2 = "Adiós"                    // val res2: String = Adiós - Definir sin paréntesis solo si la funcion es simple y no hace llamadas a otras funciones

print(funcion1)   // Hola 
funcion2          // Adiós 

// Funciones que no devuelven resultado (unit)
def funcion3(): Unit = "Hola" 
def funcion4() = print("Adiós")

función3   //
función4   // Adiós - Devuelve el resultado de la función print(), no un valor string

// Crear funciones con argumentos
def media(num1: Float, num2: Float): Float = {(num1 + num2)/2}

media(10, 15)    // val res3: Float = 12.5
