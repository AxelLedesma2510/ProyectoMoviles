<?php
    require_once('Accesorio.php');
    
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    	
    	$IDComputadora = $_POST['IDComputadora'];

        $Accesorios = SelectAccesorio($IDComputadora);
        echo $Accesorios;
    }
    
    
?>
