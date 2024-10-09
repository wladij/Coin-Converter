# Coin Converter 💱

Este es un proyecto de un **Conversor de Divisas** desarrollado en Java, que permite convertir entre varias monedas populares (dólar estadounidense, peso argentino, real brasileño y peso colombiano) utilizando una API de tipo `Exchange Rate`. El propósito de este proyecto es realizar conversiones de manera rápida y precisa.

## Descripción 📄

El proyecto permite a los usuarios seleccionar entre diferentes opciones de conversión y luego ingresar la cantidad que desean convertir. Una vez que se selecciona la opción y se ingresa el valor, el programa realiza una solicitud a una API para obtener la tasa de cambio actual y devuelve el valor convertido.

### Monedas Soportadas:
- Dólar (USD) ⇔ Peso Argentino (ARS)
- Dólar (USD) ⇔ Real Brasileño (BRL)
- Dólar (USD) ⇔ Peso Colombiano (COP)

## Tecnologías Utilizadas 💻

- **Lenguaje**: Java
- **Dependencias**: 
  - `Gson` para la manipulación de JSON.
  - `HttpClient` de Java para realizar solicitudes HTTP.
- **API utilizada**: [ExchangeRate-API](https://www.exchangerate-api.com/)

## Cómo Ejecutar el Proyecto 🚀

### Prerrequisitos:

1. **Java**: Asegúrate de tener instalada una versión reciente de Java (Java 8 o superior).
2. **IDE**: Puedes ejecutar este proyecto en cualquier IDE que soporte Java (IntelliJ IDEA, Eclipse, NetBeans, etc.).

### Instalación:

1. Clona este repositorio:
   ```bash
   git clone https://github.com/wladij/Coin-Converter.git
2. Abre el proyecto en tu IDE favorito.
3. Asegúrate de tener la dependencia de Gson configurada. Puedes agregarla usando Maven o descargándola manualmente.


### Ejecución:

1. Ejecuta la clase `Principal.java`.
2. Elige la opción de conversión en el menú interactivo.
3. Ingresa el valor que deseas convertir.
4. Obtendrás el resultado en pantalla con la conversión actualizada.

## Estructura del Proyecto 📂

  ```bash
  │── src
  │   ├── Principal.java          # Clase principal que maneja el menú y las interacciones del usuario
  │   ├── ApiRequest.java         # Clase que maneja las solicitudes HTTP a la API de Exchange Rate
  │   ├── ConsultaAPI.java        # Clase para manejar la respuesta de la API
  │   ├── Resultado.java          # Clase que almacena el resultado de la consulta
  ├── README.md                   # Documento con la descripción del proyecto.
  ```

## Funcionalidades 🔧

- Convertir entre diferentes monedas utilizando tasas de cambio en tiempo real.
- Manejo de errores de entrada (evita fallos por datos incorrectos).
- Estructura modular, lo que facilita agregar nuevas funcionalidades o soportar más monedas.
 

## Futuras Mejoras 🛠️

- Soporte para más monedas.
- Interfaz gráfica de usuario (GUI) para facilitar el uso.
- Optimización del manejo de excepciones para mejorar la robustez del sistema.
- Cacheo de respuestas de la API para mejorar la eficiencia.

## Contribuciones 🤝

¡Las contribuciones son bienvenidas! Si tienes alguna mejora o sugerencia, por favor abre un `Pull Request` o reporta un `Issue`.

---

### Autor

**Joe Candelario** 🇪🇨

---








