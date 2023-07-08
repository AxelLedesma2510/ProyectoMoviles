<?php
	require_once('Accesorio.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	            
        $IDAccesorio = $_POST['IDAccesorio'];
    	
        $Delete = DeleteAccesorio($IDAccesorio);
        echo $Delete;
    }
?>