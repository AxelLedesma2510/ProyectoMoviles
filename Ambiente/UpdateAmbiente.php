<?php
	require_once('Ambiente.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        
        $IDAmbiente = $_POST['IDAmbiente'];
        $Descripcion = $_POST['Descripcion'];
    	
        $Update = UpdateAmbiente($IDAmbiente,$Descripcion);
        echo $Update;
    }
?>