<?php
	require_once('Colegio.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	            
        $Nombre = $_POST['Nombre'];
    	
        $Insertar = InsertColegio($Nombre);
        echo $Insertar;
    }
?>