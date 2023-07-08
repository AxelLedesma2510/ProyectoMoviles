<?php
	require_once('Computadora.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	            
        $IDComputadora = $_POST['IDComputadora'];
    	
        $Delete = DeleteComputadora($IDComputadora);
        echo $Delete;
    }
?>