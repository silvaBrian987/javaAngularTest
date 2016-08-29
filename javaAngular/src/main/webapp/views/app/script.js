var app = angular.module("app", []);

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