<?php
	
	$mysql = new mysqli(
		"localhost",
		"id20973250_adriann",
		"Intento2345**",
		"id20973250_pruebadb"
	);

	if($mysql->connect_errror){
		die("failed to connect" . $mysql->connect_errror);
	}else{
		echo "Conexión Realizada";
	}

?>