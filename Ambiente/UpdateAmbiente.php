<?php
	require_once('Ambiente.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        
        $IDAmbiente = $_POST['IDAmbiente'];
        $IDColegio = $_POST['IDColegio'];
        $Descripcion = $_POST['Descripcion'];
    	
        $Update = UpdateAmbiente($IDAmbiente,$IDColegio,$Descripcion);
        echo $Update;
    }
?>