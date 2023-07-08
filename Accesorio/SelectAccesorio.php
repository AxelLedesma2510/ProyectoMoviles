<?php
    require_once('Accesorio.php');
    
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    	
    	$IDAmbiente = $_POST['IDAmbiente'];

        $Accesorios = SelectAccesorio($IDAmbiente);
        echo $Accesorios;
    }
    
?>
