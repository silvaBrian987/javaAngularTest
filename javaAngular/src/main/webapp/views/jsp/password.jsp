<!DOCTYPE html>
<html ng-app="app">

<head>
<base href="http://localhost:8080/javaAngular/">
<script src="./resources/libs/angular-js/angular.min.js"></script>
<script src="./resources/app/script.js"></script>

<script src="./resources/libs/crypto-js/core.js"></script>
<script src="./resources/libs/crypto-js/md5.js"></script>
<script src="./resources/libs/crypto-js/sha1.js"></script>
<script src="./resources/libs/crypto-js/sha256.js"></script>
<script src="./resources/libs/crypto-js/sha512.js"></script>

</head>

<body ng-controller="PasswordController">
	<form>
		<fieldset>
			<legend>Ejemplo de encriptacion de password</legend>
			<label for="algoritmo">Algoritmo: </label><select ng-model="algoritmo" id="algoritmo" name="algoritmo"><option selected="selected">MD5</option><option>SHA1</option><option>SHA2-256</option><option>SHA-2-512</option></select><br>
			<label for="password">Password: </label><input id="password" name="password" type="text" ng-model="password" /><br>
			<label>Resultado en {{algoritmo}}: </label> {{encriptado}} <br>
			
			<input type="button" value="Analizar" ng-click="enviar(password)"/> <br>
			<label>{{resultadoAnalisis}}</label>
		</fieldset>
	</form>
</body>

</html>