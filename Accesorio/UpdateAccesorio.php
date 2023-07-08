<?php
	require_once('Accesorio.php');

	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        
        $IDAccesorio = $_POST['IDAccesorio'];
        $Estado = $_POST['Estado'];
    	
        $Update = UpdateAccesorio($IDAccesorio,$Estado);
        echo $Update;
    }
?>