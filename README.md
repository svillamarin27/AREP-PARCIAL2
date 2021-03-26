# AREP-PARCIAL2

## Requerimientos

Diseñé, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS y otro desplegador en AWS lambda con AWS gateway. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista (Si sus dos últimos dígitos de su cédula son el mismo use el siguiente dígito que sea diferente). Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una parámetro de tipo "Double".


0. log

1. ln

2. sin

3. cos

4. tan

5. acos

6. asin

7. atan

8. sqrt

9. exp (el número de eauler elevado ala potendia del parámetro)


Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".

## Prerrequisitos

Para el desarrollo del proyecto se utilizó Maven como una herramienta para la construcción y gestión del mismo, el código fue desarrollado con el lenguaje de programación Java; por lo tanto se requiere para su ejecución tener estas dos herramientas en las versiones especificadas a continuación.

	- Java versión 8 o superior
	- Maven versión 3.5 o superior

## Instalación

Para descargar el proyecto de GitHub, primero debemos clonar este repositorio, ejecutando la siguiente línea de comando en GIT.
	
	https://github.com/svillamarin27/AREP-PARCIAL2.git
	
## Ejecución Localmente

Para compilar el proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

	mvn package
	
Dirigase a la dirección http://localhost:4567 en un web browser
	
Función Seno

![image](https://user-images.githubusercontent.com/37603257/112704096-6f005300-8e67-11eb-8ff7-10021d8f92e0.png)

Raíz cuadrada

![image](https://user-images.githubusercontent.com/37603257/112704196-ad960d80-8e67-11eb-85c5-f2a167148fd7.png)

## DockerHub

	docker tag parcial2b svillamarin27/parcial2b
	docker push svillamarin27/parcial2b

![image](https://user-images.githubusercontent.com/37603257/112704273-ff3e9800-8e67-11eb-944c-3a56ecc3242f.png)

## EC2

	sudo yum update -y && sudo yum install docker
	sudo service docker start
	sudo usermod -a -G docker ec2-user
	
![image](https://user-images.githubusercontent.com/37603257/112704391-7411d200-8e68-11eb-882e-37c496020e2f.png)

	docker pull svillamarin27/parcial2b
	docker run -d -p 25000:4567 --name parcial2b svillamarin27/parcial2b
	
Modificamos el grupo de seguridad para poder ingresar mediante el puerto 25000

![image](https://user-images.githubusercontent.com/37603257/112704510-e1256780-8e68-11eb-9162-e6c585ead86f.png)

![image](https://user-images.githubusercontent.com/37603257/112704818-0070c480-8e6a-11eb-91b5-057d0bb8fedc.png)

![image](https://user-images.githubusercontent.com/37603257/112704860-28602800-8e6a-11eb-9486-15e25bb4d4fc.png)

## Lambda y Gateway

Lambda 

![image](https://user-images.githubusercontent.com/37603257/112704883-4b8ad780-8e6a-11eb-8275-925b15bc2907.png)

Gateway

![image](https://user-images.githubusercontent.com/37603257/112704923-7d03a300-8e6a-11eb-8b9f-352bbe41d470.png)

![image](https://user-images.githubusercontent.com/37603257/112704946-93a9fa00-8e6a-11eb-9364-8eef07defe90.png)

Función Seno 

![image](https://user-images.githubusercontent.com/37603257/112705006-df5ca380-8e6a-11eb-982d-2486430986c6.png)

Raíz cuadrada

![image](https://user-images.githubusercontent.com/37603257/112705020-f0a5b000-8e6a-11eb-9684-8ba61a202454.png)

Link del video

https://www.youtube.com/watch?v=EUeHb8n8XEQ (Tambien esta en el repositorio)

 # Autor
 Sebastián Villamarín Rodríguez
 
 # Licencia

Este proyecto esta licenciado bajo la licencia General Public License v3.0, revise el archivo [LICENSE](LICENSE) para más información.






