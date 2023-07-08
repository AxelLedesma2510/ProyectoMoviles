<?php
	require_once('Computadora.php');

	
	if ($_SERVER['REQUEST_METHOD'] == 'GET') {
	    $computadoras = selectComputadoras();
	    echo $computadoras;
	}
	
	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        
        $IDAmbiente = $_POST['IDAmbiente'];
    	
        $select = SelectComputadorasXAmbiente($IDAmbiente);
        echo $select;
    }
?>
