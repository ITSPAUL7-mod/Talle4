
# Proyecto Quarkus - Scopes CDI

##Instrucción

Uso de los scopes CDI en Quarkus
- ApplicationScoped
- Dependent
- Singleton

#Ejemplos de ApplicationScoped

    1. Gestor de Caché de Productos: Un componente que carga la lista de productos más vendidos desde la base de datos al iniciar la aplicación y la mantiene en memoria para evitar consultas repetitivas a la base de datos.

    2. Contador de Visitas en Tiempo Real: Un servicio que incrementa y gestiona un contador global de usuarios activos o visitas totales, accesibles para cualquier sesión de usuario.

    3. Administrador de Tareas Programadas: Un componente que programa tareas como "enviar correos de resumen diario a las 00:00" o "limpiar logs temporales", asegurando que solo haya una instancia encargada de estas acciones.
    
    4. Motor de Reglas de Descuento: Un servicio que carga reglas de negocio desde un archivo externo al inicio y las aplica a todas las compras.

    5. Sincronizador de Inventario: Un proceso en segundo plano que se asegura de que el stock local esté alineado con el del almacén central cada 10 minutos.

    6. Gestor de Cuotas de API: Almacena en un mapa atómico cuántas peticiones ha hecho cada cliente en el minuto actual para aplicar Rate Limiting.

    7. Servicio de Email y Plantillas: Un componente que carga y compila en memoria las plantillas HTML para el envío de correos electrónicos al arrancar.

#Ejemplos de Singleton

    1. Pool de Conexiones a Base de Datos: El objeto que gestiona físicamente los sockets de conexión con PostgreSQL o MySQL.

    2. Validador de Esquemas JSON: Un motor que compila los esquemas al inicio para validar estructuras de datos de entrada muy rápidamente.

    3. Monitor de Sistema de Archivos: Un servicio que observa un directorio específico en busca de archivos nuevos o cambios (por ejemplo, una carpeta de "uploads" que procesa imágenes automáticamente).

    4. Proveedor de Números Aleatorios Seguros: Un componente que encapsula la generación de entropía segura para tokens de sesión o IDs de transacción.

    5. Gestor de Inventario en Tiempo Real para Flash Sales: Un servicio que maneja un ConcurrentHashMap con el stock disponible de productos estrella durante una oferta de 5 minutos.

    6. Centralizador de Puntos de Lealtad: Un bean que contiene la fórmula matemática compleja para calcular puntos basada en el nivel del usuario y el tipo de producto.

    7. Agregador de Alertas de Fraude: Un componente que recibe señales de comportamiento sospechoso y decide si debe disparar una alerta general basada en un umbral acumulativo.

#Ejemplos de Dependent

    1. Formateador de Moneda Local: Un objeto que ajusta los decimales y símbolos según el país del cliente en una petición puntual.

    2. Calculadora de Impuestos por Ítem: Se instancia para procesar un producto específico en el carrito y se descarta tras obtener el resultado.

    3. Generador de Reportes Temporales: Un componente que se encarga de dar formato a un archivo PDF o Excel específico basado en un conjunto de datos.

    4. Validador de Reglas de Password: Una utilidad que verifica si una contraseña cumple con criterios de longitud, caracteres especiales y números.

    5. Gestor de Carga de Archivos Locales: Un bean que gestiona la escritura de bytes en un directorio temporal del servidor.

    6. Transformador de Archivos CSV a JSON: Un componente que abre un flujo de lectura de un archivo, procesa línea por línea y mantiene un buffer de escritura.

    7. Calculadora de Impuestos por Ítem: Un bean que toma un solo producto de un carrito de compras y calcula el IVA o aranceles específicos basados en la categoría del producto.



## Authors

- [@PaulAguas-AvanzadaII](https://github.com/ITSPAUL7-mod)



# pw.api.u4.p6.as

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/pw.api.u4.p6.as-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- RESTEasy Classic JSON-B ([guide](https://quarkus.io/guides/rest-json)): JSON-B serialization support for RESTEasy Classic
- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code for Hibernate ORM via the active record or the repository pattern
- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing Jakarta REST and more
- JDBC Driver - PostgreSQL ([guide](https://quarkus.io/guides/datasource)): Connect to the PostgreSQL database via JDBC

## Provided Code

### Hibernate ORM

Create your first JPA entity

[Related guide section...](https://quarkus.io/guides/hibernate-orm)


[Related Hibernate with Panache section...](https://quarkus.io/guides/hibernate-orm-panache)


### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)