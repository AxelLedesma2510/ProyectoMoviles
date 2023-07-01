<?php
	require_once('Ambiente.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	            
        $IDAmbiente = $_POST['IDAmbiente'];
    	
        $Delete = DeleteAmbiente($IDAmbiente);
        echo $Delete;
    }
?>