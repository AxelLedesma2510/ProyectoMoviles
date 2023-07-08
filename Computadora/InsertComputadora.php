<?php
	require_once('Computadora.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	            
        $IDAmbiente = $_POST['IDAmbiente'];
        $Modelo = $_POST['Modelo'];
        $Estado = $_POST['Estado'];
        $Fecha = $_POST['Fecha'];
    	
        $Insertar = InsertComputadora($IDAmbiente,$Modelo,$Estado,$Fecha);
        echo $Insertar;
    }
?>