app.controller("UsuarioController", [ '$scope', '$log', '$http', function($scope, $log, $http) {
	$scope.usuario = new Usuario;
	$log.debug("$scope creado!!")

	var config = {
		method : "GET",
		url : "./UsuarioServlet"
	}

	var response = $http(config);

	response.success(function(data, status, headers, config) {
		$log.debug(data);
		$scope.usuario = data;
	});
} ]);

app.controller("PasswordController", [ '$scope', 'hash', '$http', '$log', function($scope, hash, $http, $log) {
	$scope.password = "";
	$scope.resultadoAnalisis = "";
	$scope.encriptado = "";
	
	$scope.getHash = function(message) {
		var hashResult = hash(message);
		return hashResult;
	}
	
	$scope.encriptado = $scope.getHash($scope.password);
	
	$scope.enviar = function(password) {
		var config = {
			method : "POST",
			url : "password/encriptar",
			params : {
				"mensaje" : $scope.password,
				"hash" : $scope.encriptado
			}
		}

		$http(config).then(function successCallback(response) {
			$log.debug(response.data);
			$scope.resultadoAnalisis = response.data;
		}, function errorCallback(response) {
			$log.debug(response.data);
		});
	}
} ]);