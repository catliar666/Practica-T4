![](https://cdn.discordapp.com/attachments/1161335251021332530/1193522949223874580/im1.jpg?ex=65ad05dd&is=659a90dd&hm=63c70ddb800ca5b6975aeb13b961cd2581bb24e0510ad1ddd64e4d8fc4121e11&)

---------------------------------------------------------------------
# Índice
 - **Presentación**
 - **Instalación**
 - **Iniciar el programa**
 - **Funcionamiento**
 	- I. Iniciar sesión
	 - II. Crear cuenta
	 - III. Seguimiento de un paquete con número de referencia
	 - IV. Salir
 - **UML**



## Presentación
¡Envíos rápidos y seguros en un solo lugar! Elige nuestro programa ahora actualizado, para una empresa de paquetería y haz que tus envíos lleguen a su destino sin problemas. Con tecnología de punta y un equipo de profesionales, confía en nosotros para hacer crecer tu negocio y satisfacer a tus clientes. ¡No busques más, somos la solución perfecta para tus necesidades de envío!

![](https://cdn.discordapp.com/attachments/1161335251021332530/1193527397618810880/logo_usado_2.jpeg?ex=65ad0a02&is=659a9502&hm=82129e80a59bd705cfcb509d7e35f11723af35bb9d8a48367ba33439b87c6f5b&)

El programa de gestión de paquetería es altamente eficiente y completo. Ha sido diseñado por expertos en el campo, María y Ahmed, quienes han trabajado arduamente para dar una experiencia satisfactoria y para crear la solución más completa y efectiva en hacer frente a cualquier cantidad de demanda. Además, cuenta con una interfaz intuitiva, bonita y fácil de usar, lo que permite a los usuarios navegar por el sistema sin problemas y realizar tareas de manera rápida y sencilla.

Una ventaja importante es que el programa está diseñado para adaptarse a las necesidades específicas de cada empresa de paquetería, lo que significa que puede ser personalizado para satisfacer las necesidades y requisitos únicos de cada cliente. En resumen, el programa es el más completo y efectivo en el mercado, y estamos seguros de que será una herramienta invaluable para cualquier empresa de paquetería que busque mejorar su eficiencia y rendimiento.

## - Instalación

Para poder ejecutar el programa debemos instalar el [jdk-21](https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe "jdk-21") (haciendo click aquí se te descargará directamente en el ordenador), lo instalamos y  deberá asegurarse de que lo instala en la ruta “C:\Program Files\Java“, después entramos en windows y buscamos variables de entornos nos aparecerá esta ventana y seleccionamos variables de entornos.

![img](https://cdn.discordapp.com/attachments/1026233960335941692/1051938612482158683/image.png)

Se nos abrirá la siguiente ventana, seleccionamos “Path” y pulsamos sobre editar.

![img](https://cdn.discordapp.com/attachments/1161335251021332530/1193528572309159946/unnamed_1.png?ex=65ad0b1a&is=659a961a&hm=d5e760cc441143b9413661cb53c3515218d462c128a8f1a5329594b7ad42f362&)

Se abrirá la siguiente ventana haremos click en la variable de java e introducimos la siguiente la ruta C:\Program Files\Java\jdk-18.0.2.1\bin , confirmamos y aceptamos.

![img](https://cdn.discordapp.com/attachments/1026233960335941692/1051939288725598298/image.png)

Descargamos mediante el enlace a github el archivo “.zip”, creamos una carpeta en C: con el nombre que queramos e introducimos el archivo .zip que hemos descargado, lo descomprimimos y abrimos la carpeta que nos crea, entramos en src y pulsamos en el ejecutable y el programa comenzará a funcionar.

## Iniciar el programa

Para descargar el programa debemos seguir los siguientes pasos:

###### 1.  Descargar zip
![img](https://media.discordapp.net/attachments/1161335251021332530/1201216870217433148/image.png?ex=65c90363&is=65b68e63&hm=877d9a91940299f834d3f652f2c4a67177870de71eef93ec436a96b14b7d57cc&=&format=webp&quality=lossless&width=897&height=445)

###### 2. Extraer todo
![img](https://media.discordapp.net/attachments/1161335251021332530/1193575172800774245/image.png?ex=65ad3680&is=659ac180&hm=549da32d7e38accfb1791fd1206265b8819f0b74bf8c07ccd1ee403f2844f7b5&=&format=webp&quality=lossless&width=680&height=267)

###### 3. Extraer

![img](https://media.discordapp.net/attachments/1161335251021332530/1201217096751775947/image.png?ex=65c90399&is=65b68e99&hm=740b545ec9b116fbc3dafc75e380acf886ef16f6a1b5fc301893ca274678cb52&=&format=webp&quality=lossless&width=605&height=445)

###### 4. Ruta

Nos dirigimos a la siguiente ruta:
"...\Practica-T4\out\artifacts\EnviarCorreos_jar"


###### 5. Ejecutamos

Ya solo nos quedaría ejecutar el archivo FernanPaaq.bat:

![img](https://media.discordapp.net/attachments/1161335251021332530/1193576365946048623/image.png?ex=65ad379d&is=659ac29d&hm=a33617fa3459b7c662d92e6a357407ded704df6ab3fa31557450c340e9ea2e48&=&format=webp&quality=lossless&width=198&height=223)








## Funcionamiento

### Inicio
![img](https://media.discordapp.net/attachments/1161335251021332530/1201164558459473970/image.png?ex=65c8d2ab&is=65b65dab&hm=4f585f4dc31761c39dc9778acc51d3aa65143ea650881d22c081828d3bb3c961&=&format=webp&quality=lossless&width=895&height=275)

Ahora nos da la bienvenida este menú renovado, dandonos la opción de agregar unos datos de prueba por defecto introduciendo "s". Si decidimos no agregar los datos y darle al Enter no se agregarán esos datos por defecto.

![img](https://media.discordapp.net/attachments/1161335251021332530/1201166279906705508/image.png?ex=65c8d445&is=65b65f45&hm=4ba7d464f8f720519283363067f7f0513089eb912108051e065ea881b3bb7e4c&=&format=webp&quality=lossless&width=850&height=662)

Al aceptar nos agrega un usuario normal, una cuenta de un conductor y un paquete de prueba. La información de las cuentas añadidas aparecen por pantalla.

#### 1.  Iniciar sesión

A la hora de iniciar sesión lo podemos hacer como administrador, usuario normal o conductor.

##### Menú administrador

En el primer caso lo haremos como administrador, nos pedirá el email y la clave. El email y la clave por defecto del administrador son:

**email:** admin@gmail.com
**clave:** admin

![img](https://media.discordapp.net/attachments/1161335251021332530/1201193123758473317/image.png?ex=65c8ed45&is=65b67845&hm=7a1e856ee7125d25dc763bfc4dfba54ace145ca40d0581af65a68f209e171dd9&=&format=webp&quality=lossless&width=722&height=445)

Este menú administrador nos da varias opciones como:

###### 1. Registrar un nuevo envío

A la hora de registrar un nuevo envío nos pedirá una serie de datos que se guardarán en el sistema con una ID que identifica cada envío. Esa ID es única e irrepetible mediante nuestro sistema automático de detección y creación de ID's añadida en esta nueva actualización de nuestro programa.

![img](https://media.discordapp.net/attachments/1161335251021332530/1201193726324772934/image.png?ex=65c8edd5&is=65b678d5&hm=284740b1de7b32675cd4fef88a6bf5bce42fff4b8d37b69216a03ef75d7c3add&=&format=webp&quality=lossless&width=585&height=445)

(A la hora de escribir el nombre de las provincias es obligatorio escribirlo correctamente, independientemente de las mayusculas, como en este caso Jaén con tilde en la "e")



###### 2. Asignar un envío a un conductor

A la hora de asignar un envío a un conductor nos mostrará los envíos ya previamente creados y posteriormente nos mostrará los conductores disponibles. También nos pedirá que introduzcamos los días en los que queremos que se haga la entrega del paquete y nos indicará la fecha.

![img](https://media.discordapp.net/attachments/1161335251021332530/1201194011524878407/image.png?ex=65c8ee19&is=65b67919&hm=d933a041d32108d7ad204cd245ac9a6bcd39d5efbf57853a410cf5caac54d9c4&=&format=webp&quality=lossless&width=785&height=332)


Una vez asignado un envio a un conductor se le informará al conductor vía telegram con un número de identificación del paquete ademas de su fecha de entrega.
![img](https://cdn.discordapp.com/attachments/1163537549126545470/1201241252117626931/Screenshot_20240128_165634_Telegram.jpg?ex=65c91a18&is=65b6a518&hm=eb62cd7f5d57353bb88c3c3c485ffd54ea13bce6d3e6e80839d79e4221e5375d&)


###### 3. Ver los datos de todos los usuarios registrados

Con esta opción podemos ver los usuarios registrados en el sistema.

![img]([https://media.discordapp.net/attachments/1161335251021332530/1201189142197968946/image.png?ex=65c8e990&is=65b67490&hm=2282d0c9a4cf6873fcdd1c5cadddbac0b2409fca6acd091c75c76887ef38388c&=&format=webp&quality=lossless&width=961&height=335](https://discord.com/channels/@me/1163537549126545470/1201431214964346980))

###### 4. Ver los datos de todos los envíos

Esta opción nos mostrará los datos de todos los envios efectuados o que se vayan a efectuar.

![img]([[https://media.discordapp.net/attachments/1161335251021332530/1201189554573541446/image.png?ex=65c8e9f2&is=65b674f2&hm=7a52d7890dfc1e87ca4a37fd569d99aebe948735e3b68d1388e8b4fb68aa2b27&=&format=webp&quality=lossless&width=1072&height=445](https://discord.com/channels/@me/1163537549126545470/1201429997718601828)](https://cdn.discordapp.com/attachments/1163537549126545470/1201429997420810250/image.png?ex=65c9c9e0&is=65b754e0&hm=67e18501baffe526e8a1a44590e5329e78c3c76090ff7250fee01f145fd7e920&))
###### 5. Ver los datos de todos los conductores

Aquí podemos ver los conductores registrados en el sistema.

![img]([[https://media.discordapp.net/attachments/1161335251021332530/1201190572669550602/image.png?ex=65c8eae5&is=65b675e5&hm=bc7aeb083a166c0aecd87bcd773076d34ba94506dc01dcf6adc27bdaa78bcaf9&=&format=webp&quality=lossless&width=741&height=316](https://discord.com/channels/@me/1163537549126545470/1201429606431985674)](https://cdn.discordapp.com/attachments/1163537549126545470/1201429606197108797/image.png?ex=65c9c983&is=65b75483&hm=f59730d1d08fe7bdd97ce161e720f9d28d45149aaa6c8a6b05adc9a3a64400ed&))
###### 6. Modificar el perfil

Aquí podemos cambiar los datos de nuestro perfil tanto clave como nombre.

![img](https://media.discordapp.net/attachments/1161335251021332530/1201190719835078696/image.png?ex=65c8eb08&is=65b67608&hm=ce6f142ced073a36acec7476b6e7462ae0068d7f9b76c07fe036ff0eb3ff69be&=&format=webp&quality=lossless&width=436&height=257)
###### 7. Cerrar sesión

Esta opción nos permite salir de nuestro perfil logeado.

##### Usuario normal

![img](https://media.discordapp.net/attachments/1161335251021332530/1201191579856162897/image.png?ex=65c8ebd5&is=65b676d5&hm=7422ca23ca46a2c66c633d363ea84a95a80ffc2e6ff2e667c7626a02f7eddcdb&=&format=webp&quality=lossless&width=848&height=291)

Como usuario normal solo podemos hacer un seguimiento de nuestros envios, modificar nuestros datos como dirección, número de teléfono, etc. Tambien podemos ver nuestro perfil, nuestros datos, modificarlos y cerrar sesión.

Cuando un paquete es asignado al usuario normal mediante su correo electrónico, a este se le avisará mediante un email indicando toda la información de su nuevo paquete. 
![img](https://cdn.discordapp.com/attachments/1163537549126545470/1201236049528103054/Screenshot_20240128_194240_Gmail.jpg?ex=65c91540&is=65b6a040&hm=dae53317acf8d6ebbf9874f8dc9cf75f9d06742487f028e0b8ee53e8730e1577&)

![img](https://cdn.discordapp.com/attachments/1163537549126545470/1201236056939434004/Screenshot_20240128_194246_Gmail.jpg?ex=65c91541&is=65b6a041&hm=c63438f8bca89aebed3e86774b6113f7a8a2ed7cbccf31f398f68f03632eb3d5&)

![img](https://cdn.discordapp.com/attachments/1163537549126545470/1201236065701339326/Screenshot_20240128_194255_Gmail.jpg?ex=65c91543&is=65b6a043&hm=0a4f57492e8d23ae2e10e6fe9e90e7d36a989621c2648c799a8435bd3740f93d&)

También se le avisará mediante correo electrónico cuando el paquete cambie su estado de envío.

![img](https://cdn.discordapp.com/attachments/1163537549126545470/1201240245946032291/image0.jpg?ex=65c91928&is=65b6a428&hm=4823904cf1bdb2f181eb8fb5eadcc40bdc34cfdf71a79377b85a434386921658&)

##### Conductor

![img](https://media.discordapp.net/attachments/1161335251021332530/1201191909260013609/image.png?ex=65c8ec24&is=65b67724&hm=18919b0234133dc41af233c9f55be9799637f92cf006ccabce07c3fe378d0a17&=&format=webp&quality=lossless&width=858&height=277)

Si iniciamos sesión con una cuenta de conductor podemos ver la información de nuestros envios asignados, cambiar el estado de un envío, ver el historial de paquetes entregados, modificar nuestro perfil y cerrar sesión.

#### 2. Crear una cuenta

A la hora de crear una cuenta podemos crearla como usuario normal o como conductor.

![img](https://media.discordapp.net/attachments/1161335251021332530/1201171138777202799/Captura_de_pantalla_2024-01-28_152237.png?ex=65c8d8cc&is=65b663cc&hm=cf6e27d05152acfcfa2994d81da85822a2f652a13a25547b8a77969382181420&=&format=webp&quality=lossless)

###### Crear cuenta como usuario normal:

![img](https://media.discordapp.net/attachments/1161335251021332530/1201171524372144158/image.png?ex=65c8d928&is=65b66428&hm=05e38dc807f42cbfd24c2440d46c8aab09ed015c0185cd2249a679857e02b01a&=&format=webp&quality=lossless&width=720&height=170)

Nos pedirá un email al que nos enviarán un código de verificación:
![img](https://media.discordapp.net/attachments/1161335251021332530/1201172507164688467/image.png?ex=65c8da12&is=65b66512&hm=9352c8da97cc395587f4877d472a50f6590efa3195644f4d76aef069705de674&=&format=webp&quality=lossless&width=223&height=535)

Y al introducir el código de verficacion en el programa nos dejará crear una clave, además de pedirnos ciertos datos.
![img](https://media.discordapp.net/attachments/1161335251021332530/1201172943762358272/image.png?ex=65c8da7a&is=65b6657a&hm=09a58bf0e23a75f7df6f3c6f9e217d01b24f893fecbaf6fe75633c30e238a16d&=&format=webp&quality=lossless)

Crear cuenta como conductor:

Nos pedirá un email al que nos enviarán un código de verificación:
![img](https://media.discordapp.net/attachments/1161335251021332530/1201177913173758013/image.png?ex=65c8df1b&is=65b66a1b&hm=d1417251fe454cd7927ce8e719ecdf9d8daac9da20b772e2611cf9b3d9c8924c&=&format=webp&quality=lossless&width=1112&height=305)


![img](https://media.discordapp.net/attachments/1161335251021332530/1201183963922845726/image.png?ex=65c8e4bd&is=65b66fbd&hm=b8068ea006d8eb27f00924d30451c7696e092301a3532bf2fae0f39359d80f3f&=&format=webp&quality=lossless&width=188&height=443)

Y al introducir el código de verficacion en el programa nos dejará crear una clave, además de pedirnos ciertos datos.
![img](https://media.discordapp.net/attachments/1161335251021332530/1201178155604529232/image.png?ex=65c8df55&is=65b66a55&hm=0c63fbc57a360f11f6c74d94fabb733b5d8daf5e7c4f5d3bb668d0fcda95ad0c&=&format=webp&quality=lossless&width=807&height=358)

#### 3. Seguimiento de un paquete con número de referencia

En este apartado mediante el numero de referencia de nuestro envío podemos hacer un seguimiento y consultar nuestros datos:

![img]([https://media.discordapp.net/attachments/1161335251021332530/1201192807763808398/image.png?ex=65c8ecfa&is=65b677fa&hm=3bc6d80f7e8e718afa34bf050139f3d7b58c37c4824f641c4a2c9b570446fde0&=&format=webp&quality=lossless&width=928&height=445](https://cdn.discordapp.com/attachments/1163537549126545470/1201431214666563635/image.png?ex=65c9cb03&is=65b75603&hm=f6a891b0cf7c6af0a5bc6ee732b763a6efc3e53004cda1454893224e9529aba7&))


#### 4. Salir

Esta opción nos deja salir y cerrar el programa.

#### - UML

![img](https://media.discordapp.net/attachments/1161335251021332530/1193604053234626590/UML_practica3.jpeg?ex=65ad5166&is=659adc66&hm=2e3935af6db4bd759b0f4cf78130e763605ee895bfa9f404e9d9e17e2bca7aef&=&format=webp&width=896&height=538)

---------------------------------------------------------------------
