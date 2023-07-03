<?php
	require_once('Usuario.php');

	
	if ($_SERVER['REQUEST_METHOD'] == 'GET') {
	   	
	   	$User = $_GET['User'];
        $Password = $_GET['Password'];
        
	    $usuario = SelectUsuario($User, $Password);
	    echo $usuario;
	}
	
	
?>
