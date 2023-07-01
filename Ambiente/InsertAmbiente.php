<?php
	require_once('Ambiente.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	            
        $IDColegio = $_POST['IDColegio'];
        $Descripcion = $_POST['Descripcion'];
    	
        $Insertar = InsertAmbiente($IDColegio,$Descripcion);
        echo $Insertar;
    }
?>