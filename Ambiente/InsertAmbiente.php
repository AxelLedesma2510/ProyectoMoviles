<?php
	require_once('Ambiente.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	            
        $Descripcion = $_POST['Descripcion'];
    	
        $Insertar = InsertAmbiente($Descripcion);
        echo $Insertar;
    }
?>