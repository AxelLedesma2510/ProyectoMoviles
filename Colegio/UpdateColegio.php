<?php
	require_once('Colegio.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        
        $IDColegio = $_POST['IDColegio'];
        $Nombre = $_POST['Nombre'];
    	
        $Update = UpdateColegio($IDColegio,$Nombre);
        echo $Update;
    }
?>