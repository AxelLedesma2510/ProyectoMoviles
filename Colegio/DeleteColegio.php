<?php
	require_once('Colegio.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	            
        $IDColegio = $_POST['IDColegio'];
    	
        $Delete = DeleteColegio($IDColegio);
        echo $Delete;
    }
?>