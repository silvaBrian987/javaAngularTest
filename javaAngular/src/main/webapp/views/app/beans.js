function Usuario(){
	this.nombre = "";
	this.apellido = "";
	this.sexo = "";
	this.fechaAlta = new Date();
	this.tieneGrupo = false;
	this.grupo = new Grupo();
}

function Grupo(){
	this.nombre = "";
}